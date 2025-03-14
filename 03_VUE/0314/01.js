class Pet {
  constructor(name, species, vaccinations, healthCheckDate) {
    this.name = name;
    this.species = species;
    this.vaccinations = vaccinations;
    this.healthCheckDate = healthCheckDate;
  }
  alerted = false;
  addVaccination(vaccine) {
    for (let i of this.vaccinations) {
      if (i == vaccine) {
        console.log(
          `[예방접종 중복] ${this.name}: ${vaccine}은 이미 등록되어 있습니다.`
        );
        return;
      }
    }
    this.vaccinations.push(vaccine);
    console.log(`[예방접종 추가] ${this.name}: ${vaccine}`);
  }
  updateHealthCheckDate(day) {
    this.healthCheckDate = day;
    console.log(`[건강검진 업데이트] ${this.name}: ${day}`);
  }
}
class PetHealthManager {
  registerPet(pet) {
    this.pet = pet;
    console.log(
      `[등록] ${pet.species} - ${pet.name} (예방접종: ${pet.vaccinations}, 건강검진: ${pet.healthCheckDate})`
    );
  }
  checkHealthStatus() {
    let now = new Date();
    let diffTime = now.getTime() - this.pet.healthCheckDate.getTime();
    let diffDays = diffTime / (1000 * 60 * 60 * 24);
    let timer;
    let cnt = 0;
    new Promise(() => {
      timer = setInterval(() => {
        cnt += 1;
        if (cnt % 3 == 0) {
          if (diffDays >= 365 && !this.pet.alerted) {
            console.log(
              `[건강검진 경고] ${this.pet.name}: 1년 이상 건강검진을 받지 않았습니다!`
            );
            this.pet.alerted = true;
          }
        }
        if (cnt == 10) {
          console.log("[검사종료]");
          clearInterval(timer);
          return;
        }
      }, 1000);
    });
  }
}

// 🐾 시스템 사용 예시
const manager = new PetHealthManager();

// 펫 등록
const pet1 = new Pet("나비", "고양이", ["종합백신"], new Date("2023-03-10"));
manager.registerPet(pet1);

// 예방접종 추가
pet1.addVaccination("광견병");
pet1.addVaccination("광견병"); // 중복 테스트

// 건강 상태 검사 시작
manager.checkHealthStatus();

// 5초 후 건강검진 업데이트 (경고 초기화 테스트)
setTimeout(() => {
  pet1.updateHealthCheckDate(new Date());
}, 5000);
