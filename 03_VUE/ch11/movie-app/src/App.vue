<script setup>
import { RouterLink, RouterView } from "vue-router";
import axios from "axios";
import { provide, ref } from "vue";

const movies = ref(null);
const requestAPI = async () => {
  const url = "/api/movies";
  try {
    const response = await axios.get(url);
    movies.value = response.data;
  } catch (e) {
    console.log("## 에러발생");
    console.log(e);
  }
};
requestAPI();
provide("movies", movies);
</script>
<template>
  <RouterView />
</template>

<style>
* {
  background-color: rgb(34, 34, 34);
  color: white;
}
</style>
