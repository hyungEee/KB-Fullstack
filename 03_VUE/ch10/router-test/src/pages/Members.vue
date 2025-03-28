<template>
  <div class="card card-body">
    <h2>Members</h2>
    <p>요청경로: {{ currenRoute.fullPath }}</p>
  </div>
</template>

<script>
import { useRoute } from "vue-router";
export default {
  name: "Members",
  setup() {
    // composition API 버전에서는 useRoute 함수 써서 현재 매칭 라우트 객체 가져온다.
    const currenRoute = useRoute();
    return { currenRoute };
  },
};
</script>
