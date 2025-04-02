<template>
  <div class="movie-list-container">
    <h1>🎥 지브리 영화 리스트</h1>
    <button class="addMovieBtn" @click="showModal = true">
      🎬 영화 추가하기
    </button>
    <ul>
      <li v-for="(item, index) in movies" :key="index">
        <router-link :to="'/movies/' + item.id" style="text-decoration: none">
          <div class="movie-div">🎬 {{ item.title }} - {{ item.director }}</div>
        </router-link>
      </li>
    </ul>
    <AddMovieModal
      :visible="showModal"
      @movie-added="movieAddHandler"
      @close="showModal = false"
      class="modal"
    ></AddMovieModal>
  </div>
</template>

<script setup>
import { inject, ref } from "vue";
import AddMovieModal from "@/components/AddMovieModal.vue";

const movies = inject("movies");
const showModal = ref(false);
</script>

<style scoped>
.movie-list-container {
  display: flex;
  flex-direction: column;
  gap: 5px;
  padding-left: 20px;
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
.modal {
  top: 10%;
  left: 30%;
}
</style>
