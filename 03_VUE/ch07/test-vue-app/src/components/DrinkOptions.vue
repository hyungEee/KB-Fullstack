<style>
.container {
  margin-top: 15px;
  padding: 10px;
  background-color: beige;
  border: 1px solid gray;
  border-radius: 5px;
  display: flex;
  flex-direction: column;
}
.box {
  margin-top: 10px;
}
</style>
<template>
  <div class="container">
    <h2>{{ selectedDrink.name }} 옵션 선택</h2>
    <div class="box">
      사이즈:
      <br />
      <input type="radio" v-model="size" name="size" value="Small" />
      Small
      <input type="radio" v-model="size" name="size" value="Medium" />
      Medium
      <input type="radio" v-model="size" name="size" value="Large" />
      Large
    </div>
    <div class="box">
      <input type="checkbox" v-model="extraShot" />
      샷 추가
    </div>
    <div class="box">
      얼음 양:
      <select v-model="ice">
        <option value="적게">적게</option>
        <option value="보통">보통</option>
        <option value="많이">많이</option>
      </select>
    </div>
  </div>
</template>
<script>
export default {
  name: "DrinkOptions",
  props: ["selectedDrink"],
  data() {
    return {
      size: "Medium",
      extraShot: false,
      ice: "보통",
    };
  },
  computed: {
    selectedOptions() {
      return {
        size: this.size,
        extraShot: this.extraShot,
        ice: this.ice,
      };
    },
  },
  watch: {
    selectedOptions: {
      deep: true,
      handler(newOptions) {
        this.$emit("options-changed", { selectedOptions: newOptions });
      },
    },
  },
};
</script>
