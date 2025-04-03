<template>
  <div class="container">
    <h2>📚 스터디 목록</h2>
    <div class="options">
      <span><input type="checkbox" v-model="isChecked" />모집 중만 보기</span>
      <select name="order" v-model="orderOption">
        <option value="due" selected>마감일 임박순</option>
        <option value="new">최신 등록일순</option>
        <option value="likes">좋아요순</option>
      </select>
    </div>
    <div class="grid-container">
      <StudyCard
        v-for="item in studyList"
        :key="item.id"
        :studyItem="item"
        @click="router.push(`/studies/${item.id}`)"
      ></StudyCard>
    </div>
  </div>
</template>
<script setup>
import { inject, ref } from "vue";
import StudyCard from "@/components/StudyCard.vue";
import { useRouter } from "vue-router";

const studyList = inject("studyList");
const isChecked = ref(false);
const orderOption = ref("due");

const router = useRouter();
</script>
<style scoped>
.grid-container {
  display: grid;
  grid-template-columns: repeat(2, 1fr);
  gap: 20px;
}
h2 {
  margin: 10px 0 10px 0;
}
.options {
  display: flex;
  justify-content: space-between;
  margin: 20px 0 20px 0;
}
</style>
