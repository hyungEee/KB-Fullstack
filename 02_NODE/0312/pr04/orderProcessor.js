function processOrder(order) {
  return new Promise(function (resolve, reject) {
    if (order) {
      setTimeout(function () {
        resolve(`✅ ${order["menu"]} ${order["quantity"]}인분 주문 처리 완료!`);
      }, 1000);
    }
  });
}
export default processOrder;
