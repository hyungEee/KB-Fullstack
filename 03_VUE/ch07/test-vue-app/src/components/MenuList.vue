<style>
button {
  height: 50px;
  border-radius: 5px;
  background-color: beige;
  border: 1px solid gray;
  margin: 5px;
}
</style>

<template>
  <h2>메뉴 선택</h2>
  <button
    v-for="(menu, index) in menus"
    :key="index"
    @click="$emit('select-drink', { menu })"
  >
    {{ menu.name }}({{ menu.price }}원)
  </button>
</template>

<script>
export default {
  name: "CheckboxItem",
  props: ["menus"],
  data() {
    return { menu: "" };
  },
};
</script>
