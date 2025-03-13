const fs = require("fs");
const { resolve } = require("path");
const filePath = "./02_NODE/0313/logs/reservations.txt";
const data = fs.readFileSync(filePath, (encoding = "utf-8")).split("\r\n");

function reserve(name, category) {
  for (let i of data) {
    if (name == i.split(":")[0]) {
      // 예약 기록 존재 시
      console.log(`${name} 회원님은 이미 예약되어 있습니다.`);
      return;
    }
  }
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve(`${name}: ${category}`);
    }, 2000);
  });
}

async function reservation() {
  if (!fs.existsSync(filePath)) {
    console.log("예약 기록 파일이 없습니다!");
    return;
  }
  console.log("예약 처리 중...");
  const name = "유재석";
  const category = "스피닝";
  const reserveData = await reserve(name, category);
  if (reserveData) {
    console.log(`${name} 회원님의 ${category} 예약이 완료되었습니다!`);
    fs.appendFile(filePath, "\n" + reserveData, (err) => {
      if (err) {
        console.log(err);
        return;
      }
      console.log("예약 기록이 파일에 저장되었습니다!");
    });
  }
}
reservation();
