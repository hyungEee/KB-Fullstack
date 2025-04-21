<template>
  <div class="container">
    <div class="movie-list-container">
      <h1>🎥 지브리 영화 리스트</h1>
      <button class="addMovieBtn" @click.stop="showModal = true">
        🎬 영화 추가하기
      </button>
      <div v-if="showModal" class="modal-darker">
        <div class="modal">
          <AddMovieModal
            :visible="showModal"
            @movie-added="movieAddHandler"
            @close="showModal = false"
          ></AddMovieModal>
        </div>
      </div>
      <ul>
        <li v-for="(item, index) in movies" :key="index">
          <router-link :to="'/movies/' + item.id" style="text-decoration: none">
            <div class="movie-div">
              🎬 {{ item.title }} - {{ item.director }}
            </div>
          </router-link>
        </li>
      </ul>
    </div>
  </div>
</template>

<script setup>
import { inject, ref, toRaw } from "vue";
import axios from "axios";
import AddMovieModal from "@/components/AddMovieModal.vue";

const movies = inject("movies");
const requestAPI = inject("requestAPI");
const showModal = ref(false);

const movieAddHandler = (newMovie) => {
  const postAPI = async () => {
    const plainMovie = toRaw(newMovie);
    await axios.post("/api/movies", plainMovie);
    await requestAPI();
    console.log(plainMovie);
    showModal.value = false;
  };
  postAPI();
};
</script>

<style scoped>
.container {
  width: 100vw;
  height: 150vh;
  background-color: rgb(34, 34, 34);
  color: white;
}
.movie-list-container {
  display: flex;
  flex-direction: column;
  gap: 5px;
  padding-left: 20px;
  width: 100%;
  height: 100%;
  position: relative;
}
.modal-darker{
  position: fixed;
  top: 0;
  left: 0;
  width: 100vw;
  height: 100vh;
  background-color: rgba(0, 0, 0, 0.5); /* 반투명 어두운 배경 */
}
.modal {
  position: absolute;
  left: 20%;
  top: 10%;
}
.movie-div {
  color: gold;
}
.addMovieBtn {
  background-color: gold;
  color: black;
  font-size: 0.9rem;
  border: 0;
  border-radius: 8px;
  width: 150px;
  height: 40px;
}
</style>
