<style>
.line-container {
  border: 2px solid lightgray;
  border-radius: 12px;
  display: flex;
  flex-direction: column;
  gap: 10px;
  padding: 20px;
  justify-content: center;
}
.btn-line {
  border-radius: 12px;
  padding: 10px 20px 10px 20px;
  border: 0px;
  color: white;
  background-color: skyblue;
  margin: 0 auto;
}
.tip {
  background-color: paleturquoise;
  width: 90%;
  margin: 0 auto;
  padding: 10px;
}
img {
  width: 70%;
  margin: 0 auto;
}
</style>
<template>
  <div class="line-container">
    <h2 v-if="count == 0">"🎭 아직 대사가 없습니다. 버튼을 눌러주세요!"</h2>
    <h2 v-if="count > 0">"{{ lines[rand].line }}"</h2>
    <div v-if="count > 0">출처: {{ lines[rand].source }}</div>
    <button class="btn-line" @click="lineClicked">🎲 랜덤 대사 뽑기</button>
    <div>💛 오늘의 즉흥 대사입니다!</div>
    <div class="tip">🎀 TIP: 표정 풍부하게, 발음 또박또박!</div>
    <img src="../assets/img.jpg" />
    <div v-if="lines[rand].line.length > 50">
      대사가 길어요! 천천히 연기해보세요!
    </div>
  </div>
</template>
<script>
export default {
  name: "LineCard",
  inject: ["lines"],
  data() {
    return {
      count: 0,
      rand: 0,
    };
  },
  methods: {
    lineClicked() {
      this.count++;
      this.rand = Math.floor(Math.random() * (this.lines.length - 1));
    },
  },
};
</script>
