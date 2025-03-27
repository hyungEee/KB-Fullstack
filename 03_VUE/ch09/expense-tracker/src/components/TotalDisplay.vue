<style>
.totalPrint {
  background-color: palevioletred;
  border-radius: 15px;
  color: ivory;
  margin-bottom: 10px;
  margin-top: 20px;
  padding-left: 10px;
  height: 60px;
  display: flex;
  flex-direction: column;
  justify-content: center;
  text-align: center;
}
</style>
<template>
  <h2 class="totalPrint">📌 총 지출: {{ formatNumber(totalExpense) }}원</h2>
</template>
<script setup>
import { method } from "lodash";
const props = defineProps({
  totalExpense: { type: Array, required: true },
  formatNumber: { type: method, required: true },
});
</script>
