const { rejects } = require("assert");
const fs = require("fs");
const { resolve } = require("path");
const filePath = "./02_NODE/0313/logs/checkin.txt";
const data = fs.readFileSync(filePath, (encoding = "utf-8")).split("\r\n");

function check(name) {
  for (let i of data) {
    if (name == i.split(":")[0]) {
      // 출석 기록 존재 시
      console.log(`${name} 회원님은 이미 출석하셨습니다!`);
      return;
    }
  }

  const now = new Date();
  const year = now.getFullYear();
  const month = (now.getMonth() + 1).toString().padStart(2, "0");
  const day = now.getDate().toString().padStart(2, "0");
  const hours = now.getHours();
  const minutes = now.getMinutes();

  const checkinData = `${name}: 출석 완료 (${year}-${month}-${day} ${hours}:${minutes})`;
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve(checkinData);
    }, 1000);
  });
}
async function checkin() {
  if (!fs.existsSync(filePath)) {
    console.log("출석 기록 파일이 없습니다!");
    return;
  }
  console.log("출석 중...");
  const checkinData = await check("이승기");
  if (checkinData) {
    console.log(checkinData);
    fs.appendFile(filePath, "\n" + checkinData, (err) => {
      if (err) {
        console.log(err);
        return;
      }
      console.log("출석 기록이 파일에 저장되었습니다!");
    });
  }
}
checkin();
