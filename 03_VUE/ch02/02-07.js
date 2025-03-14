//네개 중 앞의 세개의 값만 구조분해 할당 가능
let arr = [10, 20, 30, 40];
let [a1, a2, a3] = arr;
console.log(a1, a2, a3);

let p1 = { name: "홍길동", age: 20, gender: "M" };
// : 뒤에 원하는 이름으로 변경 가능
let { name: n, age: a, gender } = p1;
// key 값에 접근하면 value 값이 나온다
console.log(n, a, gender);
