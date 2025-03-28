<style>
.details {
  text-align: center;
}
</style>
<template>
  <div class="details">
    <h2>{{ product.name }}</h2>
    <img
      :src="product.image"
      alt=""
      style="width: 400px; border-radius: 20px"
    />
    <div>가격: {{ product.price }}원</div>
    <button class="btn btn-primary">장바구니 담기</button>
    <div>
      <button class="btn btn-primary">상세 정보</button>
      <button class="btn btn-primary">리뷰</button>
    </div>
  </div>
</template>
<script>
import { useRoute } from "vue-router";
import products from "@/../data/products.json";

export default {
  name: "ProductDetail",
  setup() {
    const currentRoute = useRoute();
    const id = parseInt(currentRoute.params.id, 10);
    const product = products.find((p) => p.id === id);
    console.log(product);
    return { product };
  },
};
</script>
