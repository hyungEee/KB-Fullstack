<style>
.history {
  margin-top: 15px;
  padding: 10px;
  background-color: rgb(247, 245, 245);
  border: 1px solid gray;
  border-radius: 5px;
  display: flex;
  flex-direction: column;
}
.hi-hr {
  border: 1px dashed darkgray;
}
</style>
<template>
  <div class="history">
    <h2>📜 주문 내역</h2>
    <div v-if="orderHistory.length == 0">주문 내역이 없습니다.</div>
    <div v-else>
      <div v-for="(item, index) in orderHistory" :key="index">
        <br />
        <div>🕑 {{ item.time }}</div>
        <div>음료: {{ item.drinkName }}</div>
        <div>사이즈: {{ item.size }}</div>
        <div>추가 샷: {{ item.extraShot ? "있음" : "없음" }}</div>
        <div>얼음 양: {{ item.ice }}</div>
        <div>금액: {{ item.price }}</div>
        <br />
        <hr class="hi-hr" />
      </div>
    </div>
  </div>
</template>
<script>
export default {
  name: "OrderHistory",
  props: ["orderHistory"],
  data() {
    return {};
  },
};
</script>
