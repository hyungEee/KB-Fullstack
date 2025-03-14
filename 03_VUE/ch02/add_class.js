// ES6부터 클래스 개념 도입
// 사실 얘네도 까보면 prototype 처럼 되어있음.
class User {
  constructor(first, last) {
    this.firstName = first;
    this.lastName = last;
  }
  getFullName() {
    return `${this.firstName} ${this.lastName}`;
  }
}
