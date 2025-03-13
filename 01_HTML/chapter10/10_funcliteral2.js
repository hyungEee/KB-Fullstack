console.log("2+3=" + add1(2, 3));
console.log("4+5=" + add2(4, 5)); //에러 (익명함수는 정의되기전에 사용하면 에러남)

function add1(a, b) {
  return a + b;
}
var add2 = function (a, b) {
  return a + b;
};
