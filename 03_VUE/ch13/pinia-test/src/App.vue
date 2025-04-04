<script setup>
import { computed } from "vue";
import { useCounterStore } from "./stores/counter";

const store = useCounterStore();
const { increment } = store;

// const count=store.count;
// 이러면 반응성을 잃어버림

const count = computed(() => store.count); // 반응성 있는 방법

increment();
</script>

<template>
  {{ store.count }}/{{ store.doubleCount }}<br />
  {{ count }}
</template>
