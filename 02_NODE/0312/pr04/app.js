import processOrder from "./orderProcessor.js";
const orderList = [
  { menu: "삼겹살", quantity: "2" },
  { menu: "목살", quantity: "3" },
  { menu: "갈비", quantity: "1" },
];
async function processOrders() {
  for (let i = 0; i < orderList.length; i++) {
    let res = await processOrder(orderList[i]);
    console.log(res);
  }
  console.log("🍽️ 모든 주문 처리 완료! 식사 시작!");
}
processOrders();
