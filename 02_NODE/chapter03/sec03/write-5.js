const fs = require("fs");

let content = `
=================================
새로운 내용을 추가해 보겠습니다.
=================================
`;

// appendingFile: 비동기로 기존 파일 내용에 새로운 내용을 추가
fs.appendFile("./02_NODE/chapter03/sec03/text-1.txt", content, (err) => {
  if (err) {
    console.log(err);
  }
  console.log("appending to file");
});
