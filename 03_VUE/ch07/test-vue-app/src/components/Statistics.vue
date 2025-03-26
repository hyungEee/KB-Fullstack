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
      <div>총 매출: {{ sales }}원</div>
      <div>가장 인기있는 음료: {{ popularDrink }}</div>
      <div>가장 많이 선택된 사이즈: {{ popularSize }}</div>
      <div>추가 샷 비율: {{ extraShotRate }}%</div>
    </div>
  </div>
</template>
<script>
export default {
  name: "Statistics",
  props: {
    orders: {
      type: Array,
      default: () => [],
    },
  },
  data() {
    return {};
  },
  computed: {
    sales() {
      let sum = 0;
      for (let i of this.orders) {
        sum += i.price;
      }
      return sum;
    },
    popularDrink() {
      const count = {};
      this.orders.forEach((order) => {
        count[order.drinkName] = (count[order.drinkName] || 0) + 1;
      });

      let maxName = "";
      let maxCount = 0;

      for (let [name, cnt] of Object.entries(count)) {
        if (cnt > maxCount) {
          maxName = name;
          maxCount = cnt;
        }
      }
      return `${maxName} (${maxCount}회)`;
    },
    popularSize() {
      const count = {};
      this.orders.forEach((order) => {
        count[order.size] = (count[order.size] || 0) + 1;
      });
      let maxSize = "";
      let maxCount = 0;
      for (let [size, cnt] of Object.entries(count)) {
        if (cnt > maxCount) {
          maxSize = size;
          maxCount = cnt;
        }
      }
      return maxSize;
    },
    extraShotRate() {
      let es = this.orders.reduce((acc, cur) => {
        if (cur.extraShot) {
          return (acc += 1);
        } else {
          return acc;
        }
      }, 0);
      return (es / this.orders.length).toFixed(2) * 100;
    },
  },
};
</script>
