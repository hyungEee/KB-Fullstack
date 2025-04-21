import { createRouter, createWebHistory } from "vue-router";
import Cart from "@/pages/Cart.vue";
import Home from "@/pages/Home.vue";
import Products from "@/pages/Products.vue";
import ProductDetail from "@/pages/ProductDetail.vue";
import CategoryFilter from "@/pages/CategoryFilter.vue";
import ProductDescription from "@/pages/ProductDescription.vue";
import ProductReview from "@/pages/ProductReview.vue";

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
      components: { default: Products, left: CategoryFilter },
    },
    {
      path: "/cart",
      name: "cart",
      component: Cart,
    },
    {
      path: "/products/:id",
      component: ProductDetail,
      children: [
        {
          path: "",
          name: "ProductDescription",
          component: ProductDescription,
        },
        {
          path: "review",
          name: "ProductReview",
          component: ProductReview,
        },
      ],
    },
  ],
});

export default router;

