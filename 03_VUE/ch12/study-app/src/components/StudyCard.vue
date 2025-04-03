<template>
  <div class="card">
    <div class="card-body">
      <h4 class="card-title">{{ studyItem.title }}</h4>
      <div class="card-text">📌 카테고리: {{ studyItem.category }}</div>
      <div class="card-text">📆 등록일: {{ studyItem.createdAt }}</div>
      <div class="card-text">📆 마감일: {{ studyItem.dueDate }}</div>
      <div class="card-text">💗 좋아요: {{ studyItem.likes }}</div>
      <span class="badge bg-success">D-?</span>
    </div>
  </div>
</template>
<script setup>
import { inject } from "vue";

defineProps({
  studyItem: { type: Object, required: true },
});
</script>
