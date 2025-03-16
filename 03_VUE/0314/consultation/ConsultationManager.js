class ConsultationManager {
  consultLog = [];
  registerConsultation(customer) {
    if (customer.phone.split("-")[0] !== "010") {
      console.log(
        `[상담 등록 오류] ${customer.name}: 잘못된 전화번호 형식입니다.`
      );
      return;
    }
    for (let i of this.consultLog) {
      if (customer.name == i.name) {
        console.log(
          `[상담 중복 오류] ${customer.name}:이미 등록된 상담 기록입니다.`
        );
        return;
      }
    }
    this.consultLog.push(customer);
    console.log(`[상담 등록] ${customer.name} - 선호 펫: ${customer.pet}`);
    new Promise(() => {
      setTimeout(() => {
        console.log(`[저장 완료] ${customer.name} 상담 기록 저장 완료!`);
      }, 1000);
    });
  }

  autoEndConsultation() {
    new Promise(() => {
      setTimeout(() => {
        console.log(`[상담 기록 저장 종료]`);
      }, 5000);
    });
  }
}

export default ConsultationManager;
