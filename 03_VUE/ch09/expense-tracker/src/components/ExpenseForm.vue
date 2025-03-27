<style>
.ef-container {
  display: flex;
  flex-direction: row;
  justify-content: center;
}
.expense-inputs {
  background-color: rgb(255, 218, 224);
  color: palevioletred;
  border: 1px solid palevioletred;
  border-radius: 15px;
  height: 50px;
  width: 30%;
  margin-right: 20px;
  margin-bottom: 20px;
  padding-left: 10px;
  font-size: 1.2em;
}
button {
  background-color: palevioletred;
  border: 0;
  height: 50px;
  width: 10%;
  border-radius: 15px;
  color: ivory;
  font-size: 1.2em;
}
</style>

<template>
  <div class="ef-container">
    <input
      class="expense-inputs"
      type="text"
      v-model="expense.name"
      placeholder="항목명 입력"
    />
    <input class="expense-inputs" type="number" v-model="expense.price" />
    <select class="expense-inputs" v-model="expense.category">
      <option value="" selected disabled hidden>카테고리 선택</option>
      <option value="food">식비</option>
      <option value="transfer">교통</option>
      <option value="shopping">쇼핑</option>
    </select>
    <button @click="addExpenseHandler">추가</button>
  </div>
</template>
<script>
import { reactive } from "vue";
export default {
  name: "ExpenseForm",
  emits: ["add-expense"],
  setup(props, context) {
    const expense = reactive({ name: "", price: 0, category: "" });

    const addExpenseHandler = () => {
      context.emit("add-expense", expense);
    };

    return { expense, addExpenseHandler };
  },
};
</script>
