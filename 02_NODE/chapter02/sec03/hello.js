const hello = (name) => {
  console.log(`${name}님, 안녕하세요?`);
};
//함수 선언과 동시에 내보내기
// exports.hello=(name)=>{
//     console.log(`${name}님, 안녕하세요?`);
// };

module.exports = hello;
