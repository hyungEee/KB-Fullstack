<style>
h2 {
  font-weight: bold;
}
.expense-container {
  line-height: 3;
  padding-left: 5px;
  list-style: none;
  margin-top: 20px;
}
.expense-li {
  background-color: rgb(255, 218, 224);
  border-radius: 15px;
  height: 60px;
  margin-bottom: 10px;
  padding: 2px 20px 0px 20px;
  font-size: 1.2em;
  display: flex;
  flex-direction: row;
  justify-content: space-between;
}
.delete {
  text-decoration: none;
}
</style>
<template>
  <div>
    <h2>💸 지출 내역</h2>
    <ul class="expense-container">
      <li v-for="(item, index) in expenseList" :key="index" class="expense-li">
        <div>{{ item.name }}: {{ item.price }}원</div>
        <a href="#" class="delete" @click="handleDelete(index)">❌</a>
      </li>
    </ul>
    <br />
    <h2>📊 카테고리별 지출 합계</h2>
    <ul class="expense-container">
      <li v-for="(item, index) in totalCategory" :key="index">
        <div v-if="item.total > 0" class="expense-li">
          {{ item.name }}:{{ item.total }}원
        </div>
      </li>
    </ul>
  </div>
</template>
<script setup>
import { defineProps, defineEmits } from "vue";
const props = defineProps({
  expenseList: { type: Array, required: true },
  totalCategory: { type: Array, required: true },
});
const emit = defineEmits(["delete-expense"]);
const handleDelete = (id) => {
  emit("delete-expense", id);
};
</script>
