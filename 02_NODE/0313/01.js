const path = require("path");
const fs = require("fs");

const fullPath = path.join("02_NODE", "0313", "members", "choi_ji_hyung.txt");
const content = "최지형, 나이:25, 키:160cm, 체중:비밀";
fs.writeFileSync(fullPath, content, { flag: "a" });

console.log("파일 생성 완료!");
console.log(`디렉터리 경로: ${path.dirname(fullPath)}`);
console.log(`파일 이름: ${path.basename("./choi_ji_hyung.txt")}`);
console.log(`파일 확장자: ${path.extname("./choi_ji_hyung.txt")}`);
console.log(
  `파일 이름(확장자 제외): ${path.basename("./choi_ji_hyung.txt", ".txt")}`
);
