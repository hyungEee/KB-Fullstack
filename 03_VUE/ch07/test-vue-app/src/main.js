import "./assets/main.css";
import { createApp } from "vue";

// 전역 컴포넌트 등록방법
// 모든 곳에 등록이 되기 때문에 파일이 커질 수 있다는 단점 => 비권장
// import CheckboxItem from './components/CheckboxItem.vue';
// createApp(App).component("CheckboxItem", CheckboxItem).mount("#app");

// 지역 컴포넌트 등록은 사용할 vue 컴포넌트내에서 매번 컴포넌트 등록하면 된다(권장)
// import App from './App.vue'
// import App from "./App2.vue";
import App from "./CafeApp.vue";

createApp(App).mount("#app");
