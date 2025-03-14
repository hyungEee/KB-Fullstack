// const jihyung = {
//   firstName: "jihyung",
//   lastName: "choi",
//   getFullName: function () {
//     return `${this.firstName} ${this.lastName}`;
//   },
// };

// // 일반 함수에서 this는 호출한 객체(jihyung)
// console.log(jihyung.getFullName());

// 생성자 함수
function User(first, last) {
  this.firstName = first;
  this.lastName = last;
}

// 프로토타입에 추가된 함수는 객체 전체가 공유한다.
User.prototype.getFullName = function () {
  return `${this.firstName} ${this.lastName}`;
};

const jihyung = new User("jihyung", "choi");
const lou = new User("lou", "leed");
console.log(jihyung.getFullName());
console.log(lou.getFullName());
