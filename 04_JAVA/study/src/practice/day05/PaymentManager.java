package practice.day05;

public class PaymentManager {

    int count=0;
    int total=0;
    int cTotal=0;
    int kTotal=0;

    public void process(Payment payment, int amount){
        if(payment.pay(amount)){
            payment.approve();
            count++;
            total+=amount;
            payment.cancel("테스트 취소");
            if(payment instanceof KakaoPay) {
                kTotal++;
                ((KakaoPay) payment).sendNotification();
            }else {
                cTotal++;
                System.out.println("[알림 서비스 없음]");
            }
        }
        else{
            System.out.println("[결제 실패: 승인/취소 건너뜀]");
            return;
        }

    }
    public void printSummary(){
        System.out.println("✅ 결제 통계 요약");
        System.out.println("총 결제 횟수: "+count+"회");
        System.out.println("총 결제 금액: "+total+"원");
        System.out.println("[CreditCard]: "+cTotal+"건");
        System.out.println("[KakaoPay]: "+kTotal+"건");
    }
}

