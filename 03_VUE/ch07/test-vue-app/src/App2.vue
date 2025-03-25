<template>
  <div>
    <h2>App Component</h2>
    <hr />
    <ul>
      <!-- 사용자 정의 태그 -->
      <CheckboxItem v-for="idol in idols" :key="idol.id" :idol="idol" />
    </ul>
  </div>
</template>

<script>
import CheckboxItem from "./components/CheckboxItem2.vue";

export default {
  name: "App",
  components: { CheckboxItem },
  data() {
    return {
      idols: [
        { id: 1, name: "BTS", checked: true },
        { id: 2, name: "Black Pink", checked: false },
        { id: 3, name: "EXO", checked: false },
        { id: 4, name: "ITZY", checked: false },
      ],
    };
  },
};
</script>
