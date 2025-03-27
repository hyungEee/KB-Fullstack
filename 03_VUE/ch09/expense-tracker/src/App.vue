<style>
.diary-container {
  padding: 30px;
  color: palevioletred;
  background-color: ivory;
  border-radius: 15px;
  box-shadow: 2px 2px 5px 3px palevioletred;
}
.title {
  font-weight: bold;
  font-size: 2.5em;
  text-align: center;
}
</style>

<template>
  <div class="diary-container">
    <h1 class="title">✿ ✿ ✿ 지형이의 가계부 ✿ ✿ ✿</h1>
    <br />
    <ExpenseForm @add-expense="addExpense"></ExpenseForm>
    <ExpenseList
      :expenseList="state.expenseList"
      :totalCategory="totalCategory"
      @delete-expense="deleteExpense"
    ></ExpenseList>
    <TotalDisplay
      :totalExpense="totalExpense"
      :formatNumber="formatNumber"
      :totalCategory="totalCategory"
    ></TotalDisplay>
  </div>
</template>
<script>
import ExpenseForm from "./components/ExpenseForm.vue";
import TotalDisplay from "./components/TotalDisplay.vue";
import ExpenseList from "./components/ExpenseList.vue";
import { reactive, computed } from "vue";
export default {
  name: "App",
  components: { ExpenseForm, TotalDisplay, ExpenseList },
  setup() {
    const state = reactive({
      expenseList: [],
    });

    const addExpense = (expense) => {
      state.expenseList.push({
        name: expense.name,
        price: expense.price,
        category: expense.category,
      });
    };

    const totalExpense = computed(() => {
      return state.expenseList.reduce((acc, cur) => acc + cur.price, 0);
    });

    const formatNumber = (total) => {
      return total.toLocaleString("ko-KR");
    };

    const deleteExpense = (id) => {
      state.expenseList.splice(id, 1);
    };

    const totalCategory = computed(() => {
      const totalOfCategory = [
        { name: "🍕 식비", total: 0 },
        { name: "🚌 교통", total: 0 },
        { name: "🎀 쇼핑", total: 0 },
      ];
      for (let i of state.expenseList) {
        if (i.category == "food") {
          totalOfCategory[0].total += i.price;
        } else if (i.category == "transfer") {
          totalOfCategory[1].total += i.price;
        } else {
          totalOfCategory[2].total += i.price;
        }
      }
      return totalOfCategory;
    });

    return {
      state,
      addExpense,
      totalExpense,
      formatNumber,
      ExpenseList,
      deleteExpense,
      totalCategory,
    };
  },
};
</script>
