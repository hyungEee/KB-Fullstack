import { orderList, addOrder } from "./orderManager.js";
addOrder("삼겹살", "3인분");
addOrder("목살", "2인분");
for (let key in orderList) {
  console.log(`- ${key}: ${orderList[key]}`);
}
