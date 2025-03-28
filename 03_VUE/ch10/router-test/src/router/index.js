import { createRouter, createWebHistory } from "vue-router";
import Home from "@/pages/Home.vue";
import About from "@/pages/About.vue";
import Members from "@/pages/Members.vue";
import Videos from "@/pages/Videos.vue";
import MemberInfo from "@/pages/MemberInfo.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    // 해당 path 접근시 해당 component 렌더링
    { path: "/", component: Home },
    { path: "/about", component: About },
    { path: "/members", component: Members },
    { path: "/members/:id", component: MemberInfo },
    { path: "/videos", component: Videos },
  ],
});

export default router;
