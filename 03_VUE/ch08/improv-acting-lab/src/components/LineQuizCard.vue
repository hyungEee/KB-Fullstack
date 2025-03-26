<style>
.line-quiz {
  font-style: italic;
  font-size: 1.2em;
}
.btn-box {
  display: flex;
  flex-direction: row;
}
</style>
<template>
  <div class="line-container">
    <h2>📝 즉흥 대사 출처 퀴즈</h2>
    <div style="font-size: 1.2em">Q. 이 대사는 어디에서 나온 걸까요?</div>
    <div class="line-quiz">{{ this.lines[rand].line }}</div>
    <div>힌트: 모두 유명 드라마 속 대사예요!</div>
    <div class="btn-box">
      <button
        class="btn-line"
        v-for="(item, index) in quiz"
        :key="index"
        @click="quizBtnCliked"
      >
        {{ item.source }}
      </button>
    </div>
  </div>
</template>
<script>
export default {
  name: "LineQuizCard",
  inject: ["lines"],
  data() {
    return {
      rand: 0,
      quiz: this.makeQuiz(),
    };
  },
  methods: {
    makeQuiz() {
      const quiz = [];
      let rand = Math.floor(Math.random() * (this.lines.length - 1));
      quiz.push({ source: this.lines[rand].source, isCorrect: true });
      let shuffled = this.lines.slice().sort(() => Math.random() - 0.5);
      let i = 0;
      while (true) {
        if (shuffled[i].source != quiz[0].source) {
          quiz.push({ source: shuffled[i].source, isCorrect: false });
          i++;
        }
        if (quiz.length == 4) {
          break;
        }
      }
      return quiz.sort(() => Math.random() - 0.5);
    },
    quizBtnCliked(e) {
      console.log(e);
    },
  },
};
</script>
