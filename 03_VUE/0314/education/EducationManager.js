import fs from "fs/promises";
class EducationManager {
  programs = [];
  registerProgram(p) {
    this.programs.push({
      title: p.title,
      description: p.description,
      isCompleted: false,
    });
    console.log(`[등록 완료] 교육과정: ${p.title}`);
  }
  completeProgramWithFunction(title) {
    for (let i of this.programs) {
      if (i.title == title) {
        i.isCompleted = true;
        console.log(`[이수 완료 - 일반 함수] ${title}`);
        return;
      }
    }
  }
  completeProgramWithArrowFunction = (title) => {
    for (let i of this.programs) {
      if (i.title == title) {
        i.isCompleted = true;
        console.log(`[이수 완료 - 화살표 함수] ${title}`);
        return;
      }
    }
  };

  saveToFile() {
    fs.writeFile(
      "./KB-Fullstack/03_VUE/0314/education/education_records.json",
      JSON.stringify(this.programs)
    );
    console.log(`[파일 저장 완료] 교육 기록이 파일로 저장되었습니다.`);
  }
}
export default EducationManager;
