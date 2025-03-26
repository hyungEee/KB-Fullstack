<style>
.container {
  display: flex;
  flex-direction: column;
  margin: 0 auto;
  text-align: center;
  gap: 15px;
}
.ready-card {
  background-color: #f1f2f6;
  border: 1px solid #dfe4ea;
  border-radius: 12px;
  padding: 14px;
  width: 100%;
  text-align: center;
}
.btn-quiz {
  background-color: orchid;
  border-radius: 12px;
  padding: 10px 20px 10px 20px;
  border: 0px;
  width: 170px;
  color: white;
  margin: 0 auto;
}
</style>
<template>
  <div class="container">
    <h1 style="font-weight: bold">imporv-acting-lab 🎭</h1>
    <LineReadyButton @ready="handleReady">
      <div class="count">버튼을 누른 횟수: {{ count }}회</div>
      <div class="ready-card">🎭 준비되면 눌러주세요! 자신감을 가져요!</div>
    </LineReadyButton>
    <LineCard v-if="count > 0"></LineCard>
    <button class="btn-quiz" @click="handleQuiz">📝 퀴즈 시작하기</button>
    <LineQuizCard v-if="showQuiz"></LineQuizCard>
  </div>
</template>
<script>
import LineReadyButton from "./components/LineReadyButton.vue";
import LineCard from "./components/LineCard.vue";
import LineQuizCard from "./components/LineQuizCard.vue";
export default {
  name: "App",
  components: { LineReadyButton, LineCard, LineQuizCard },
  data() {
    return {
      count: 0,
      showQuiz: false,
    };
  },
  provide() {
    return {
      lines: [
        {
          line: "조금은 친절해도 되잖아. 다들 니들처럼 익숙한 게 아니니까.",
          source: "청춘시대",
        },
        {
          line: "너와 함께한 시간 모두 눈부셨다. 날이 좋아서 날이 좋지 않아서 날이 적당해서 모든 날이 좋았다.",
          source: "도깨비",
        },
        {
          line: "당신이 좋은 이유? 그저 그 사람이라서. 바로 너라서.",
          source: "응답하라 1997",
        },
        {
          line: "인생에서 시련 오는 거, 진짜와 가짜를 한 번씩 걸러내라고 하나님이 주신 기회가 아닌가 싶다.",
          source: "별에서 온 그대",
        },
        {
          line: "잊지 말자. 나는 어머니의 자부심이다. 모자라고 부족한 자식이 아니다.",
          source: "미생",
        },
      ],
    };
  },
  methods: {
    handleReady() {
      this.count++;
      console.log(`대사 준비 완료! 총 (${this.count}회 눌림)`);
    },
    handleQuiz() {
      this.showQuiz = !this.showQuiz;
    },
  },
};
</script>
