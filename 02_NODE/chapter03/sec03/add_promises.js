const fs = require("fs");
const processFile = async () => {
  try {
    //파일 생성
    await fs.writeFile("./02_NODE/chapter03/sec03/new.txt", "Hello");

    //파일 읽기
    const data = await FileSystem.readFile(
      "./02_NODE/chapter03/sec03/new.txt",
      "utf-8"
    );

    // 파일에 내용 추가
    const content = "new content";
    await fs.appendFile("./02_NODE/chapter03/sec03/new.txt", content);

    //파일 삭제
    await fs.unlink("./02_NODE/chapter03/sec03/new.txt");
  } catch (err) {
    console.log(err);
  }
};
proccessFile();
