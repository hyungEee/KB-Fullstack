const fs = require("fs");

// readFileSync: 현재 파일을 동기적으로 읽는다.(기본적으로 이진 데이터)
const data = fs.readFileSync("./02_NODE/chapter03/sec03/example.txt");
console.log(data);
