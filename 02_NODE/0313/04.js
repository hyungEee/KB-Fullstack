const fs = require("fs");

const rs = fs.createReadStream("./02_NODE/0313/logs/workout_log.txt", "utf-8");
const ws = fs.createWriteStream("./02_NODE/0313/logs/backup_log.txt");

rs.on("error", (error) => {
  console.log("백업 중 오류가 발생했습니다.");
  console.log(error);
})
  .pipe(ws)
  .on("finish", () => {
    console.log("백업이 완료되었습니다.");
  })
  .on("error", (error) => {
    console.log(error);
  });
