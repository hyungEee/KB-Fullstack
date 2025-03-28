<style>
.card-container {
  display: grid;
  grid-template-columns: 1fr 1fr 1fr 1fr;
}
.card {
  margin: 10px;
}
.card-text {
  text-align: center;
}
.link-text {
  text-decoration: none;
  color: green;
}
img {
  height: 60%;
}
</style>

<template>
  <div>
    <h2>상품 목록</h2>
    <div class="card-container">
      <div v-for="(item, index) in products" :key="index" class="card">
        <img class="card-img-top" :src="item.image" alt="Card image" />
        <div class="card-body">
          <h4 class="card-title" style="text-align: center">{{ item.name }}</h4>
          <div class="card-text">{{ item.price }}원</div>
          <div style="text-align: center; margin-top: 10px">
            <router-link :to="'/products/' + item.id" class="link-text"
              >상세보기</router-link
            >
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import products from "@/../data/products.json";
export default {
  name: "products",
  setup() {
    return {
      products,
    };
  },
};
</script>
