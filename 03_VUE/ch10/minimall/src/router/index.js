import { createRouter, createWebHistory } from "vue-router";
import Cart from "@/pages/Cart.vue";
import Home from "@/pages/Home.vue";
import Products from "@/pages/Products.vue";
import ProductDetail from "@/pages/ProductDetail.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: "/",
      name: "home",
      component: Home,
    },
    {
      path: "/products",
      name: "products",
      component: Products,
    },
    {
      path: "/cart",
      name: "cart",
      component: Cart,
    },
    {
      path: "/products/:id",
      component: ProductDetail,
    },
  ],
});

export default router;
