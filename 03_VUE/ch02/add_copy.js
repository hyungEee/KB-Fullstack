import _ from "lodash";
const teacher = {
  name: "jihyung",
  age: 25,
  email: ["jihyung@test.com"],
};

//const copyTeacher = teacher; => 주소값이 복사돼서 같이 변경됨!

// 해결방법 1. Object.assign 이용해서 target 객체에 출처 객체를 복사
// const copyTeacher = Object.assign({}, teacher);

// 해결방법 2. 전개 연산자 이용해서 객체 생성 => 객체 내 참조 데이터(배열 등)는 얕은복사로 이루어짐(한계)
// const copyTeacher = { ...teacher };

// 해결방법 3. lodash 모듈을 활용
const copyTeacher = _.cloneDeep(teacher);
console.log(copyTeacher === teacher);

teacher.age = 100;
teacher.email.push("jihyung@aaa.com");

console.log(teacher);
console.log(copyTeacher);
console.log(teacher.email == copyTeacher.email);
