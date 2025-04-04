<script setup>
import { RouterView } from "vue-router";
import axios from "axios";
import { provide, ref } from "vue";

const movies = ref([]);
const requestAPI = async () => {
  const url = "/api/movies";
  try {
    const response = await axios.get(url);
    movies.value = [...response.data];
  } catch (e) {
    console.log("## 에러발생");
    console.log(e);
  }
};
requestAPI();
provide("movies", movies);
provide("requestAPI", requestAPI);
</script>
<template>
  <RouterView />
</template>

<style></style>
