<template>
  <div>
    <h2>App Component</h2>
    <hr />
    <ul>
      <!-- 사용자 정의 태그 -->
      <CheckboxItem
        v-for="idol in idols"
        :key="idol.id"
        :name="idol.name"
        :checked="idol.checked"
      />
    </ul>
  </div>
</template>

<script>
import CheckboxItem from "./components/CheckboxItem.vue"; // 지역 컴포넌트 등록법

export default {
  name: "App",
  components: { CheckboxItem }, // 지역 컴포넌트 등록법
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
