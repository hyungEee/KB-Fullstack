let orderStatus = {
  samgyeopsal: "주문 대기",
  galbi: "주문 대기",
};
function updateStatus(menu, status) {
  const st = new Promise((resolve, reject) => {
    {
      orderStatus[menu] = status;
      setTimeout(function () {
        resolve(`🔄 ${menu} 상태가 ${status}로 변경되었습니다.`);
      }, 1000);
    }
  });
  return st;
}
export { orderStatus, updateStatus };
