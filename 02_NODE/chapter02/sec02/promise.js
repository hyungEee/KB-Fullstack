let likePizza = true;
const pizza = new Promise((resolve, reject) => {
  if (likePizza) {
    resolve("피자를 주문합니다."); // 성공시
  } else {
    reject("피자를 주문하지 않습니다."); // 실패시
  }
});
// then으로 resolve 매개변수 받아오기
pizza.then((result) => console.log(result)).catch((err) => console.log(err));
