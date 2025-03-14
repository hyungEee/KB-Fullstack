const p1 = { name: "john", age: 20 }; // 객체는 참조형 변수
p1.age = 22; // 참조형 변수의 경우 내부 필드는 변경 가능
console.log(p1);

p1 = { name: "lee", age: 25 }; // 객체 자체를 변경 시 typeError 발생
