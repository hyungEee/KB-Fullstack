const fs = require("fs");

// encoding option utf-8 형식으로 변경
const data = fs.readFileSync("./02_NODE/chapter03/sec03/example.txt", "utf-8");
console.log(data);
