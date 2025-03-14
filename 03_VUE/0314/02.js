class Item {
  constructor(name, type, stock) {
    this.name = name;
    this.type = type;
    this.stock = stock;
  }
  alreadyWarned = false;
}
class InventoryManager {
  addItem(item) {
    this.item = item;
    console.log(`[추가] ${item.type} - ${item.name} (재고: ${item.stock}개)`);
  }
  updateStock(name, stock) {
    if (stock < 0) {
      console.log(`[업데이트 오류] 재고는 0 이상이어야 합니다.`);
      return;
    }
    this.item.stock = stock;
    console.log(`[업데이트] ${name} 재고: ${stock}개`);
    if (stock < 5) {
      console.log(`[재고 부족 경고] ${name}: 재고가 5개 미만입니다!`);
    }
  }
  checkStock() {
    let timer;
    let cnt = 0;
    new Promise(() => {
      timer = setInterval(() => {
        cnt += 1;

        if (this.item.stock < 5 && !this.item.alreadyWarned) {
          console.log(`[자동 경고] ${this.item.name}: 재고가 5개 미만입니다!`);
          this.item.alreadyWarned = true;
        }
        if (cnt == 5) {
          console.log("[재고 검사 종료]");
          clearInterval(timer);
          return;
        }
      }, 1000);
    });
  }
}
// 🐾 시스템 사용 예시
const inventory = new InventoryManager();

// 아이템 등록
const item1 = new Item("고급 고양이 사료", "사료", 10);
inventory.addItem(item1);

// 재고 업데이트
inventory.updateStock("고급 고양이 사료", 4); // 5개 미만 → 경고 발생
inventory.updateStock("고급 고양이 사료", -1); // 음수 입력 → 오류 발생

// 재고 상태 검사 시작 (5초 후 종료)
inventory.checkStock();
