<style>
.cart-item-li {
  list-style: none;
  display: flex;
  flex-direction: row;
  border: 1px solid gray;
  border-radius: 15px;
  padding: 10px;
  margin: 10px;
}
.cart-item-info {
  display: flex;
  flex-direction: column;
  padding: 20px;
}
.cart-img {
  width: 150px;
}
.total {
  text-align: center;
  font-size: 1.2em;
}
</style>
<template>
  <div>
    <h2>🛒 장바구니</h2>
    <br />
    <ul style="padding-left: 0">
      <li v-for="(item, index) in cart" :key="index" class="cart-item-li">
        <img :src="item.image" class="cart-img" />
        <div class="cart-item-info">
          <div style="font-weight: bold">{{ item.name }}</div>
          <div style="margin-top: 10px">{{ item.price }}원</div>
        </div>
      </li>
    </ul>
    <br />
    <div class="total">총합: {{ total }}원</div>
  </div>
</template>

<script>
import { inject } from "vue";

export default {
  name: "cart",
  setup() {
    const cart = inject("cart");
    const total = cart.reduce((acc, cur) => {
      return acc + cur.price;
    }, 0);
    return { cart, total };
  },
};
</script>
