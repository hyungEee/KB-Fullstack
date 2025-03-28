<template>
  <link
    rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css"
    integrity="sha512-Evv84Mr4kqVGRNSgIGL/F/aIDqQb7xQ2vcrdIwxfjThSH8CSR7PBEakCr51Ck+w+/U6swU2Im1vVX0SVk9ABhg=="
    crossorigin="anonymous"
    referrerpolicy="no-referrer"
  />
  <div style="position: relative; top: 200px; left: 50px; font-weight: bold">
    <div style="font-size: 2em; color: aliceblue">🎀 Jihyung Store 🎀</div>
    <div>vue3 연습사이트</div>
  </div>
  <img
    src="../assets/background.jfif"
    alt=""
    style="height: 300px; width: 100%"
  />
  <nav class="navbar navbar-expand-md bg-primary navbar-dark">
    <span class="navbar-brand">
      <router-link class="nav-link" to="/"
        ><i class="fa-solid fa-house"></i>{{ index.title }}</router-link
      >
    </span>
    <button class="navbar-toggler" type="button" @click="changeIsNavShow">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div :class="navClass">
      <ul class="navbar-nav">
        <li v-for="(item, index) in index.menus" :key="index" class="nav-item">
          <router-link class="nav-link" :to="item.url">
            <i :class="item.icon"></i>
            {{ item.title }}</router-link
          >
        </li>
      </ul>
    </div>
  </nav>
</template>
<script>
import { reactive, computed } from "vue";
import index from "@/config/index.js";
export default {
  setup() {
    const state = reactive({ isNavShow: false });

    // isNavShow 값에 따라서 각각 다른 클래스가 바인딩된다.
    const navClass = computed(() =>
      state.isNavShow
        ? "collapse navbar-collapse show"
        : "collapse navbar-collapse"
    );

    const changeIsNavShow = () => {
      // isNavShow 값을 반대로 변경
      state.isNavShow = !state.isNavShow;
    };

    return { state, changeIsNavShow, navClass, index };
  },
};
</script>
