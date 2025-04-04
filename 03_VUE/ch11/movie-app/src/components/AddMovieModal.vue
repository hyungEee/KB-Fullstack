<template>
  <div class="modal-container">
    <div class="input-container">
      <div style="font-size: 2rem">📽</div>
      <input type="text" placeholder="제목" v-model="newMovie.title" />
      <input type="number" placeholder="연도" v-model="newMovie.year" />
      <input type="text" placeholder="감독" v-model="newMovie.director" />
      <textarea
        type="text"
        placeholder="줄거리"
        v-model="newMovie.description"
      ></textarea>
      <input
        type="text"
        placeholder="포스터 이미지 URL"
        v-model="newMovie.poster"
      />
    </div>
    <div class="btn-container">
      <button @click="$emit('movie-added', newMovie)">등록</button>
      <button @click="$emit('close')">닫기</button>
    </div>
  </div>
</template>
<script setup>
import { reactive } from "vue";
const newMovie = reactive({
  title: "",
  year: 0,
  director: "",
  description: "",
  poster: "",
});
</script>
<style scoped>
.modal-container {
  border-radius: 10px;
  display: flex;
  flex-direction: column;
  width: 350px;
  height: 400px;
  padding: 20px;
  gap: 20px;
  background-color: white;
  color: black;
}
.input-container {
  display: flex;
  flex-direction: column;
  gap: 20px;
}
input {
  height: 25px;
  border: 1px solid gray;
  border-radius: 5px;
}
textarea {
  height: 45px;
  border: 1px solid gray;
}
.btn-container {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  margin-top: 10px;
}
button {
  height: 30px;
  width: 50px;
  border: 0;
  border-radius: 5px;
  background-color: gold;
}
</style>
