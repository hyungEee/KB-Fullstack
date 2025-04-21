<style>
.details {
  text-align: center;
}
.details-price {
  font-size: 1.2em;
  margin: 20px;
}
.moreinfo {
  margin: 10px;
  text-decoration: none;
  color: black;
}
.moreinfo-clicked {
  background-color: lightskyblue;
  color: white;
  border-radius: 15px;
  padding: 10px;
}
</style>
<template>
  <div class="details">
    <h2>{{ product.name }}</h2>
    <br />
    <img
      :src="product.image"
      alt=""
      style="width: 400px; border-radius: 20px"
    />
    <div class="details-price">가격: {{ product.price }}원</div>
    <button @click="addBtnHandler(product)" class="btn btn-primary">
      장바구니 담기
    </button>
    <div style="margin-top: 20px">
      <router-link
        class="moreinfo"
        :to="`/products/${product.id}`"
        exact-active-class="moreinfo-clicked"
        @click="desHandler"
        >상세정보</router-link
      >
      <router-link
        class="moreinfo"
        :to="`/products/${product.id}/review`"
        exact-active-class="moreinfo-clicked"
        @click="revHandler"
        >리뷰</router-link
      >
    </div>
    <router-view></router-view>
  </div>
</template>
<script>
import { useRoute } from "vue-router";
import products from "@/../data/products.json";
import { inject } from "vue";
import router from "@/router";

export default {
  name: "ProductDetail",
  setup() {
    const currentRoute = useRoute();
    const id = parseInt(currentRoute.params.id, 10);
    const product = products.find((p) => p.id === id);
    const addToCart = inject("addToCart");
    const addBtnHandler = (product) => {
      addToCart(product);
      router.push({ name: "cart" });
    };
    return {
      product,
      addToCart,
      addBtnHandler,
    };
  },
};
</script>
