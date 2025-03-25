<style>
.statContainer {
  margin-top: 5px;
  padding: 10px;
  background-color: rgb(255, 214, 221);
  border: 2px solid rgb(255, 89, 172);
  border-radius: 5px;
  display: flex;
  flex-direction: column;
}
.statContents {
  margin: 5px;
  line-height: 2;
}
</style>
<template>
  <div class="statContainer">
    <h2>📊 주문 통계</h2>
    <div class="statContents">
      <div>총 주문 횟수: {{ orders.length }}회</div>
      <div>총 매출: {{ sum }}회</div>
      <div>가장 인기있는 음료:</div>
      <div>가장 많이 선택된 사이즈:</div>
      <div>추가 샷 비율:</div>
    </div>
  </div>
</template>
<script>
export default {
  name: "Statistics",
  props: ["orders"],
  data() {
    return {};
  },
  computed: {
    sum() {},
  },
};
</script>
