<template>
  <div>
    <input type="text" v-model.number="state.x" /><br />
    <input type="text" v-model.number="state.y" /><br />
    <div>결과:{{ result }}</div>
  </div>
</template>

<script>
import { reactive, computed } from "vue";

export default {
  name: "Calc",
  setup() {
    const state = reactive({ x: 10, y: 20 });
    const result = computed(() => {
      return state.x + state.y;
    });
    return { result, state };
  },
};
</script>
