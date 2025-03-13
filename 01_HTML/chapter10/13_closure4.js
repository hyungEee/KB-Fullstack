function outcount() {
  var count = 0;

  setInterval(function () {
    count++;
    console.log(count + "초 지남");
  }, 1000);
}
outcount();

// function outer(){
//     let value;
//     이벤트 등록(function(){
//         value 사용;
//     });
// }
