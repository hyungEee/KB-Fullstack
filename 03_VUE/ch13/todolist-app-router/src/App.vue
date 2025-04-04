<template>
  <div class="container">
    <Header></Header>
    <RouterView />
    <Loading v-if="isLoading" />
  </div>
</template>

<script setup>
import { RouterView } from "vue-router";
import Header from "@/components/Header.vue";
import { computed } from "vue";
import { useTodoListStore } from "./stores/todoList";
import Loading from "@/components/Loading.vue";

const todoListStore = useTodoListStore();
const isLoading = computed(() => todoListStore.isLoading);
const fetchTodoList = todoListStore.fetchTodoList;
fetchTodoList();
</script>
