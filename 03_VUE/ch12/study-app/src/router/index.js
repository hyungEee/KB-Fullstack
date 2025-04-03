import { createRouter, createWebHistory } from "vue-router";
import Studies from "@/pages/Studies.vue";
import StudyInfo from "@/pages/StudyInfo.vue";
const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: "/studies",
      name: "studies",
      component: Studies,
    },
    {
      path: "/studies/:id",
      name: "studies/id",
      component: StudyInfo,
    },
  ],
});

export default router;
