<style>
nav {
  margin: 0 auto;
  border-bottom: 1px solid gray;
}
ul {
  padding: 20px 0 20px 0;
  background-color: black;
}
.navi {
  display: flex;
  flex-direction: row;
  justify-content: center;
  list-style: none;
  font-size: 1.4em;
  font-weight: bold;
  margin: 0px;
}
li {
  margin-left: 30px;
  margin-right: 30px;
  color: white;
}
</style>
<template>
  <nav>
    <ul class="navi">
      <li>
        <router-link class="nav-link" to="/">홈</router-link>
      </li>
      <li>
        <router-link class="nav-link" to="/products">상품목록</router-link>
      </li>
      <li>
        <router-link class="nav-link" to="/cart">장바구니</router-link>
      </li>
    </ul>
  </nav>
</template>
<script>
export default {
  setup() {
    return {};
  },
};
</script>
