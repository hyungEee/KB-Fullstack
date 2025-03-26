<style>
.ready-container {
  width: 100%;
  margin: 0 auto;
  display: flex;
  flex-direction: column;
  justify-content: center;
  gap: 20px;
}
.ready-btn {
  background-color: #ff7675;
  border-radius: 12px;
  padding: 14px;
  border: 0px;
  width: 200px;
  color: white;
  margin: 0 auto;
}
button:hover {
  background-color: #d63031;
}
</style>
<template>
  <div class="ready-container">
    <button class="ready-btn" @click="$emit('ready')">🎬 대사 준비 완료</button>
    <slot>여기에 서윤이의 코멘트가 들어갑니다.</slot>
  </div>
</template>
<script>
export default {
  name: "LineReadyButton",
  data() {
    return {};
  },
};
</script>
