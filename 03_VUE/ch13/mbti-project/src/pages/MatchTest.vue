<template>
  <h1 style="text-align: center; margin-bottom: 20px">
    💗 나만의 MBTI 궁합 저장소 💗
  </h1>
  <div class="card" style="width: 600px; margin: 0 auto">
    <div class="card-body d-grid">
      <h2 style="text-align: center">MBTI 궁합 테스트</h2>
      <div class="d-grid" style="margin: 10px">
        <div>나의 MBTI</div>
        <select v-model="my" style="height: 30px; border-radius: 10px">
          <option v-for="(item, index) in mbtis" :key="index" :value="item">
            {{ item }}
          </option>
        </select>
      </div>
      <div class="d-grid" style="margin: 10px">
        <div>친구의 MBTI</div>
        <select v-model="friend" style="height: 30px; border-radius: 10px">
          <option v-for="(item, index) in mbtis" :key="index" :value="item">
            {{ item }}
          </option>
        </select>
      </div>
      <br />
      <button class="btn btn-primary btn-block" @click="matchBtnHandler">
        궁합계산
      </button>
      <div
        class="alert alert-success"
        v-show="isBtnClicked"
        style="margin-top: 20px; text-align: center"
      >
        <h2>{{ myMBTI }}💗{{ friendMBTI }}</h2>
        <div>{{ matchResult }}</div>
        <div>궁합률: {{ compatibility }}%</div>
      </div>
      <button
        class="btn btn-success btn-block"
        @click="saveBtnHandler"
        style="margin-top: 10px"
      >
        결과 저장
      </button>
      <div
        class="alert alert-info"
        v-show="isSaveSuccessed"
        style="margin-top: 10px; text-align: center"
      >
        저장완료! 결과 목록으로 이동 중...
      </div>
    </div>
  </div>
</template>
<script setup>
import { ref, computed } from "vue";
import { useMatchStore } from "@/stores/matchStore";
import { useRouter } from "vue-router";

const matchStore = useMatchStore();
const { mbtiMatch, setMy, setFriend, saveResult } = matchStore;
const myMBTI = computed(() => matchStore.myMBTI);
const friendMBTI = computed(() => matchStore.friendMBTI);
const matchResult = computed(() => matchStore.matchResult);
const compatibility = computed(() => matchStore.compatibility);
const mbtis = [
  "ENFJ",
  "ENFP",
  "ENTJ",
  "ENTP",
  "ESFJ",
  "ESFP",
  "ESTJ",
  "ESTP",
  "INFJ",
  "INFP",
  "INTJ",
  "INTP",
  "ISFJ",
  "ISFP",
  "ISTJ",
  "ISTP",
];
const my = ref("");
const friend = ref("");
const isBtnClicked = ref(false);
const router = useRouter();
const isSaveSuccessed = ref(false);

const matchBtnHandler = () => {
  setMy(my.value);
  setFriend(friend.value);
  mbtiMatch();
  isBtnClicked.value = true;
};
const saveBtnHandler = () => {
  saveResult(() => {
    router.push("/results");
    isSaveSuccessed.value = true;
  });
};
</script>
