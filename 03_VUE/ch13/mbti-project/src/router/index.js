import { createRouter, createWebHistory } from "vue-router";
import MatchTest from "@/pages/MatchTest.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: "/test",
      name: "test",
      component: MatchTest,
    },
    {
      path: "/results",
      name: "results",
      component: MatchTest,
    },
  ],
});

export default router;
