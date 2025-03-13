const fs = require("fs");

// readFile: 콜백함수를 받아서 파일을 비동기로 읽어온다.
fs.readFile("./02_NODE/chapter03/sec03/example.txt", "utf-8", (err, data) => {
  if (err) {
    console.log(err);
    return;
  }
  console.log(data);
});
