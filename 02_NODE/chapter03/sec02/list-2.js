const fs = require("fs");
// readdir: 현재 폴더에 있는 파일들 목록 보여주기(비동기)
let files = fs.readdir("./", (err, files) => {
  // 예외 발생시 출력해주고 리턴
  if (err) {
    console.log(err);
    return;
  }
  console.log(files);
});
