<style>
.layout {
  display: flex;
  flex-direction: row;
  justify-content: center;
}
</style>
<template>
  <Header></Header>
  <div class="layout">
    <router-view name="left"></router-view>
    <main class="main">
      <router-view></router-view>
    </main>
  </div>
</template>
<script>
import Header from "@/components/Header.vue";
import { provide, reactive } from "vue";
export default {
  name: "App",
  components: { Header },
  setup() {
    const cart = reactive([]);
    const addToCart = (product) => {
      cart.push(product);
    };
    provide("cart", cart);
    provide("addToCart", addToCart);
    return { cart, addToCart };
  },
};
</script>
<style>
@import url("https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css");
</style>
