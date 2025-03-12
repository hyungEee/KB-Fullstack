function grillMeat(menu) {
  return new Promise(function (resolve, reject) {
    if (menu) {
      setTimeout(function () {
        resolve(`🔥 ${menu}가 다 구워졌습니다!`);
      }, 2000);
    } else {
      reject(`고기 없음`);
    }
  });
}
export default grillMeat;
