const fs = require("fs");
const { resolve } = require("path");
const mrList = fs
  .readFileSync(
    "./KB-Fullstack/02_NODE/0313/logs/memberRoutine.txt",
    (encoding = "utf-8")
  )
  .split("\n");
const upper = ["벤치프레스 3세트", "어깨프레스 3세트", "팔굽혀펴기 50개"];
const lower = ["스쿼트 5세트", "런지 3세트", "레그프레스 4세트"];
let recList = [];

for (let i of mrList) {
  let name = i.split(": ")[0];
  let uplow = i.split(": ")[1];
  let routine = "";
  console.log(`운동 루틴 추천 중... (${name})`);
  new Promise(() => {
    setTimeout(() => {
      for (let i of recList) {
        if (name == i.name) {
          console.log(`${name} 회원님은 이미 추천을 받으셨습니다!`);
        }
      }
      let randNum = Math.floor(Math.random() * 3);
      if (uplow == "상체") {
        routine = upper[randNum];
      } else {
        routine = lower[randNum];
      }
      console.log(
        `${name} 회원님, 오늘의 ${uplow} 추천 루틴은 '${routine}'입니다! 화이팅!`
      );
      recList.push({ name: name, uplow: uplow, routine: routine });
    });
  }, 1000);
  fs.promises.appendFile(
    "./KB-Fullstack/02_NODE/0313/logs/routine.txt",
    `${name} (${uplow}): ${routine}\n`
  );
  console.log(`추천 루틴이 기록되었습니다!`);
}
