const user = require("./user");
const hello = require("./hello");

console.log(user);
console.log(hello);

hello(user); //모듈에서 가져온 user와 hello 모두 사용하기
