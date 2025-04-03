<template>
  <div class="container">
    <h2>{{ studyItem.title }}</h2>
    <div>{{ studyItem.desc }}</div>
    <ul class="list-group">
      <li class="list-group-item">📆 마감일: {{ studyItem.dueDate }}</li>
      <li class="list-group-item">📆 등록일: {{ studyItem.createdAt }}</li>
      <li class="list-group-item">📌 카테고리: {{ studyItem.category }}</li>
      <li class="list-group-item">😀 최대인원: {{ studyItem.max }}</li>
      <li class="list-group-item">💗 좋아요: {{ studyItem.likes }}</li>
    </ul>
    <div style="margin-bottom: 20px">
      <span class="badge bg-success">D-?</span>
    </div>
    <button @click="router.push('/studies')"><- 목록으로</button>
  </div>
</template>
<script setup>
import { inject, reactive } from "vue";
import { useRoute, useRouter } from "vue-router";

const studyList = inject("studyList");
const currentRoute = useRoute();
const router = useRouter();

const matchedStudy = studyList.value.find(
  (item) => item.id === currentRoute.params.id
);
const studyItem = reactive({ ...matchedStudy });
</script>
<style scoped>
.container {
  margin-top: 20px;
}
h2 {
  font-weight: bold;
  margin-bottom: 20px;
}
ul {
  margin: 20px 0 20px 0;
}
</style>
