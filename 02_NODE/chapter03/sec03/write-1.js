const fs = require("fs");

const data = fs.readFileSync("./02_NODE/chapter03/sec03/example.txt", "utf-8");
// fs.writeFileSync: 넣어준 내용으로 새로운 파일을 쓴다(동기)
fs.writeFileSync("./02_NODE/chapter03/sec03/text-1.txt", data);
