const fs = require("fs");

const data = fs.readFileSync("./02_NODE/chapter03/sec03/example.txt", "utf-8");

//existSync: 해당 경로에 파일이 있는지 bool값으로 반환
if (fs.existsSync("./02_NODE/chapter03/sec03/text-1.txt")) {
  // 파일 존재 시
  console.log("file already exists");
} else {
  // 파일 존재하지 않을 시
  fs.writeFileSync("./02_NODE/chapter03/sec03/text-1.txt", data);
}
