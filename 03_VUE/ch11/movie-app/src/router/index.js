import { createRouter, createWebHistory } from "vue-router";
import App from "@/App.vue";
import MovieList from "@/components/MovieList.vue";
import MovieDetail from "@/components/MovieDetail.vue";
import AddMovieModal from "@/components/AddMovieModal.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: "/",
      component: App,
    },
    {
      path: "/movies",
      component: MovieList,
      children: [{ path: "/", component: AddMovieModal }],
    },
    {
      path: "/movies/:id",
      component: MovieDetail,
    },
  ],
});

export default router;
