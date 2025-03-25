<style>
.receipt {
  margin-top: 15px;
  padding: 10px;
  color: black;
  background-color: beige;
  border: 1px solid gray;
  border-radius: 5px;
  line-height: 2;
}
.orderBtn {
  height: 40px;
  width: 120px;
  border-radius: 5px;
  background-color: rgb(221, 212, 162);
  border: 1px solid gray;
  margin: 5px;
}
hr {
  border: 1px dashed rgb(172, 165, 126);
}
</style>
<template>
  <div class="receipt">
    <h2>🧾 주문 내역서</h2>
    <div>주문시간: {{ currentTime }}</div>
    <hr />
    <div>음료: {{ drink.name }}</div>
    <div>사이즈: {{ optionData.size }}</div>
    <div>추가 샷: {{ optionData.extraShot ? "있음" : "없음" }}</div>
    <div>얼음 양: {{ optionData.ice }}</div>
    <hr />
    <div>결제 금액: {{ drink.price }}</div>
    <button @click="$emit('place-order')" class="orderBtn">
      주문 확정하기
    </button>
  </div>
</template>
<script>
export default {
  name: "OrderSummary",
  props: ["drink", "optionData"],
  data() {
    return {};
  },
  computed: {
    currentTime() {
      return new Date();
    },
  },
};
</script>
