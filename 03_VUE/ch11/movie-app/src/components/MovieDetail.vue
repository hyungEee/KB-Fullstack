<template>
  <div class="container">
    <div class="movie-info-container">
      <h1>🎥 지브리 영화 리스트</h1>
      <div class="movie-title">
        {{ movieInfo.title }} ({{ movieInfo.year }})
      </div>
      <div>감독: {{ movieInfo.director }}</div>
      <div>줄거리: {{ movieInfo.description }}</div>
      <img :src="movieInfo.poster" alt="" />
    </div>
  </div>
</template>
<script setup>
import { ref } from "vue";
import axios from "axios";
import { useRoute } from "vue-router";

const currentRoute = useRoute();
const id = currentRoute.params.id;

const movieInfo = ref(null);

const requestAPI = async () => {
  const url = "/api/movies/" + id;
  try {
    const response = await axios.get(url);
    movieInfo.value = response.data;
  } catch (e) {
    console.log("## 에러발생");
    console.log(e);
  }
};
requestAPI();
</script>
<style scoped>
.container {
  width: 100vw;
  height: 150vh;
  background-color: rgb(34, 34, 34);
  color: white;
}
.movie-info-container {
  width: 80%;
  display: flex;
  flex-direction: column;
  gap: 12px;
  padding-left: 20px;
}
img {
  width: 500px;
}
.movie-title {
  font-size: 1.7rem;
}
</style>
