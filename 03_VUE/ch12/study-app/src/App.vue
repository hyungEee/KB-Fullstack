<template>
  <RouterView />
</template>

<script setup>
import { RouterLink, RouterView } from "vue-router";
import { reactive, computed, provide } from "vue";
import axios from "axios";

const STUDYURI = "/api/studies";
const states = reactive({ studyList: [] });

const fetchStudyList = async () => {
  try {
    const response = await axios.get(STUDYURI);
    if (response.status === 200) {
      states.studyList = response.data;
      console.log(states.studyList);
    }
  } catch (errer) {
    alert("에러 발생: " + error);
  }
};

provide(
  "studyList",
  computed(() => states.studyList)
);
provide("actions", { fetchStudyList });
fetchStudyList();
</script>

<style scoped></style>
