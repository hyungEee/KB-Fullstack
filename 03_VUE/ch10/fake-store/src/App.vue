<template>
  <div class="container-fluid">
    <Header></Header>
    <router-view></router-view>
  </div>
</template>
<script>
import Header from "@/components/Header.vue";

export default {
  name: "App",
  components: { Header },
};
</script>
<style>
@import url("https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css");
</style>
