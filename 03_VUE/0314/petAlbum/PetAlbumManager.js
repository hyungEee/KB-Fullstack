import fs from "fs/promises";
class PetAlbumManager {
  album = [];
  addRecord(record) {
    if (record.type == "Photo") {
      for (let i of this.album) {
        if (i.photoPath == record.photoPath) {
          console.log(`[등록 오류] ${record.name}: 중복된 사진입니다.`);
          return;
        }
      }
    } else {
      for (let i of this.album) {
        if (i.recordDate == record.recordDate) {
          console.log(`[등록 오류] ${record.name}: 중복된 성장 기록입니다.`);
          return;
        }
      }
    }
    this.album.push(record);
    console.log(`[등록 완료] ${record.name}: ${record.type}가 등록되었습니다.`);
    fs.writeFile(
      "./KB-Fullstack/03_VUE/0314/petAlbum/pet_album.json",
      JSON.stringify(this.album)
    );
    console.log(`[파일 저장 완료] 앨범 기록이 파일로 저장되었습니다.`);
  }
}
export default PetAlbumManager;
