<style>
.line-quiz {
  font-style: italic;
  font-size: 1.2em;
}
.btn-box {
  display: flex;
  flex-direction: row;
}
.res {
  font-size: 1.2em;
}
.nextBtn {
  border: 0;
  border-radius: 15px;
  padding: 10px 20px 10px 20px;
  background-color: green;
  color: white;
}
</style>
<template>
  <div class="line-container">
    <h2>📝 즉흥 대사 출처 퀴즈</h2>
    <div style="font-size: 1.2em">Q. 이 대사는 어디에서 나온 걸까요?</div>
    <div class="line-quiz">{{ lines[rand].line }}</div>
    <div>힌트: 모두 유명 드라마 속 대사예요!</div>
    <div v-if="!isAnswered" class="btn-box">
      <button
        class="btn-line"
        v-for="(item, index) in quiz"
        :key="index"
        @click="quizBtnClicked(item)"
      >
        {{ item.source }}
      </button>
    </div>
    <div v-if="isAnswered">
      <div v-if="!isSolved">
        <div class="res">🥲 아쉽네요! 다시 도전해 보세요!</div>
        <br />
        <div>당신의 선택: '{{ selected }}'</div>
        <div>결과: 오답</div>
      </div>
      <div v-else>
        <div class="res">❤️ 정답! 역시 지형이 최고!</div>
        <br />
        <div>당신의 선택: '{{ selected }}'</div>
        <div>결과: 정답!</div>
      </div>
      <br />
      <button class="nextBtn" @click="nextBtnHandler">다음 문제 풀기</button>
    </div>
  </div>
</template>
<script setup>
import { inject, ref, onMounted } from "vue";
const lines = inject("lines");
const rand = ref(0);
const quiz = ref([]);
const isAnswered = ref(false);
const isSolved = ref(false);
const selected = ref("");

const makeQuiz = () => {
  rand.value = Math.floor(Math.random() * (lines.length - 1));
  const quizTmp = [];
  quizTmp.push({ source: lines[rand.value].source, isCorrect: true });

  const shuffled = lines.slice().sort(() => Math.random() - 0.5);
  let i = 0;
  while (i < shuffled.length - 1) {
    if (shuffled[i].source !== lines[rand.value].source) {
      quizTmp.push({ source: shuffled[i].source, isCorrect: false });
    }
    i++;
  }
  quiz.value = quizTmp.sort(() => Math.random() - 0.5);
};
onMounted(() => {
  makeQuiz();
});

const quizBtnClicked = (item) => {
  isAnswered.value = true;
  isSolved.value = item.isCorrect;
  selected.value = item.source;
};

const nextBtnHandler = () => {
  isAnswered.value = false;
  makeQuiz();
};
</script>

