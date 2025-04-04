<style>
.category {
  width: 500px;
  margin: 15px;
  margin-top: 40px;
  padding: 10px;
  border: 1px solid lightgray;
  border-radius: 5px;
}
.category-ul {
  line-height: 2;
}
</style>
<template>
  <div class="category">
    <div style="font-size: 1.2em">카테고리</div>
    <ul class="category-ul">
      <li>전체</li>
      <li>리빙</li>
      <li>디지털</li>
      <li>취미</li>
    </ul>
  </div>
</template>
<script>
export default {
  setup() {
    return {};
  },
};
</script>
