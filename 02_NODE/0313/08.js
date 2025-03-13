const fs = require("fs");
filePath = "./02_NODE/0313/logs/diet.txt";
const data = fs.readFileSync(filePath, (encoding = "utf-8"));

function writeLog(name, calorie) {
  let msg = "";
  if (calorie < 500) {
    msg = `${name}: ${calorie}kcal, 괜찮아요 아직 여유 있어요!`;
  } else {
    msg = `${name}: ${calorie}kcal, 조금 과했어요! 내일은 가볍게 가볼까요?\n${name} 회원님, 오늘 뭐 드셨어요? 칼로리 폭탄인가요?!`;
  }
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve(msg);
    }, 1000);
  });
}

async function diet() {
  if (!fs.existsSync(filePath)) {
    console.log("식단 기록 파일이 어디로 갔죠?");
    return;
  }
  console.log("식단 기록 중... (오늘도 건강한 한 끼!)");
  const name = "최지형";
  const calorie = 1000;
  let msg = await writeLog(name, calorie);
  if (msg) {
    fs.promises.appendFile(filePath, "\n" + msg, (err) => {
      if (err) {
        console.log(err);
        return;
      }
    });
    console.log(`${name} 회원님, 오늘도 건강한 한 끼 감사합니다!`);
    if (calorie >= 500) {
      console.log(`${name} 회원님, 오늘 뭐 드셨어요? 칼로리 폭탄인가요?!`);
    }
    console.log("식단 기록이 맛있게 저장되었습니다!");
  }
}
diet();
