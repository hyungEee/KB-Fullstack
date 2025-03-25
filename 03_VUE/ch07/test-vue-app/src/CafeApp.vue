<style>
.selectedDrink {
  margin-top: 15px;
  padding: 10px;
  color: black;
  background-color: rgb(221, 212, 162);
  border: 1px solid gray;
  border-radius: 5px;
  line-height: 2;
}
.statBtn {
  margin: 20px 0px 20px 10px;
  width: 120px;
  height: 40px;
  background-color: rgb(255, 89, 172);
  color: ivory;
  border: 2px solid pink;
}
</style>

<template>
  <h1>☕ Jihyung's Cafe ☕</h1>
  <MenuList :menus="menulist" @select-drink="showSelectedDrink"></MenuList>
  <div v-if="selectedDrink" class="selectedDrink">
    선택한 음료: {{ selectedDrink.name }}
  </div>
  <DrinkOptions
    v-if="selectedDrink"
    :selectedDrink="selectedDrink"
    @options-changed="showChangedOptions"
  ></DrinkOptions>
  <div v-if="selectedDrink" class="selectedDrink">
    <div>현재 선택 옵션:</div>
    <div>사이즈: {{ selectedOptions.size }}</div>
    <div>추가샷: {{ selectedOptions.extraShot ? "있음" : "없음" }}</div>
    <div>얼음 양: {{ selectedOptions.ice }}</div>
  </div>
  <OrderSummary
    v-if="selectedDrink && selectedOptions"
    :drink="selectedDrink"
    :optionData="selectedOptions"
    @place-order="handlePlaceOrder"
  ></OrderSummary>
  <OrderHistory :orderHistory="orderHistory"></OrderHistory>
  <button v-if="orderHistory.length > 0" @click="clickStats" class="statBtn">
    {{ buttonText }}
  </button>
  <Statistics v-if="showStats" :orders="orderHistory"></Statistics>
</template>
<script>
import MenuList from "./components/MenuList.vue";
import DrinkOptions from "./components/DrinkOptions.vue";
import OrderSummary from "./components/OrderSummary.vue";
import OrderHistory from "./components/OrderHistory.vue";
import Statistics from "./components/Statistics.vue";

export default {
  name: "App",
  components: {
    MenuList,
    DrinkOptions,
    OrderSummary,
    OrderHistory,
    Statistics,
  },
  data() {
    return {
      showStats: false,
      selectedDrink: "",
      menulist: [
        { name: "아메리카노", price: 4000 },
        { name: "카페라떼", price: 4500 },
        { name: "바닐라라떼", price: 4800 },
        { name: "콜드브루", price: 5000 },
      ],
      selectedOptions: { size: "Medium", extraShot: false, ice: "보통" },
      orderHistory: [],
      buttonText: "통계 보기",
    };
  },
  methods: {
    showSelectedDrink(e) {
      this.selectedDrink = e.menu;
    },
    showChangedOptions(e) {
      this.selectedOptions = e.selectedOptions;
    },
    handlePlaceOrder(e) {
      alert(`${this.selectedDrink.name} 주문이 완료되었습니다!`);
      this.orderHistory.push({
        time: new Date().toLocaleString(),
        drinkName: this.selectedDrink.name,
        size: this.selectedOptions.size,
        extraShot: this.selectedOptions.extraShot,
        ice: this.selectedOptions.ice,
        price: this.selectedDrink.price,
      });
    },
    clickStats(e) {
      if (!this.showStats) {
        this.showStats = true;
        this.buttonText = "통계 숨기기";
      } else {
        this.showStats = false;
        this.buttonText = "통계 보기";
      }
    },
  },
};
</script>
