<template>
  <h1 style="text-align: center; margin-bottom: 20px">
    💗 나만의 MBTI 궁합 저장소 💗
  </h1>
  <div class="card" style="width: 700px; margin: 0 auto">
    <div class="card-body">
      <h2 style="text-align: center">저장된 MBTI 궁합 결과</h2>
      <div v-if="matchResults.length === 0" style="text-align: center;">저장된 결과가 없습니다.</div>
      <ul v-else class="list-group">
        <li v-for="res in matchResults" :key="res.id" class="list-group-item" style="display: flex; justify-content: space-between;">
          <div>
            <div>{{ res.myMBTI }}💗{{ res.friendMBTI }}</div>
            <div>{{ res.matchResult }}</div>
            <div>궁합률: {{ res.compatibility }}%</div>
          </div>
          <button class="btn btn-outline-danger" @click="deleteBtnHandler(res.id)" style="height: 50px; margin-top: 10px;">삭제</button>
        </li>
      </ul>
    </div>
  </div>
</template>
<script setup>
import axios from "axios";
import { onMounted, ref } from "vue";
const BASEURI = "/api/savedResults";
const matchResults = ref([]);
const fetchMatchResults = async () => {
  try {
    const response = await axios.get(BASEURI);
    if (response.status === 200) {
      matchResults.value = response.data;
    } else {
      alert("데이터 조회 실패");
    }
  } catch (error) {
    alert("에러 발생" + error);
  }
};
const deleteBtnHandler=async(id)=>{
  try {
      const response = await axios.delete(BASEURI + `/${id}`);
      if (response.status === 200) {
        let index = matchResults.value.findIndex((item) => item.id === id);
        matchResults.value.splice(index, 1);
        alert("삭제 성공");
      } else {
        alert("삭제 실패");
      }
    } catch (error) {
      alert("에러 발생: " + error);
    }
};
onMounted(()=>fetchMatchResults());
</script>
