let orderList = {};
function addOrder(menu, quantity) {
  orderList[menu] = quantity;
}
export { orderList, addOrder };
