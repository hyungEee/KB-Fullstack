let obj = { result: 0 };

obj.add = function (x, y) {
  function inner() {
    // 일반 함수기 때문에 호출시 this가 결정, this=>window
    this.result = x + y;
  }
  inner();
};

obj.add(3, 4);
// obj 객체는 변하지 않고 전역 객체가 변경된다.
console.log(obj); // {result:0}
console.log(result); // 7
