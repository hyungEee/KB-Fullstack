package practice.day05;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        PaymentManager manager=new PaymentManager();
        while(true){
            System.out.println("\n=== 유니페이 결제 시스템 ===\n[1] 신용카드\n[2] 카카오페이\n[0] 종료");
            System.out.print("결제 수단을 선택하세요: ");
            int select=sc.nextInt();
            if(select==0) break;

            Payment p=null;
            if (select==1){
                p=new CreditCard();
            }
            if(select==2){
                p=new KakaoPay();
                sc.nextLine();
                System.out.println("[카카오페이 사용자 인증을 진행하시겠습니까? (y/n)]");
                if(sc.nextLine().equals("y")) {
                    ((KakaoPay)p).authenticate();
                }
            }
            if(p.beforePay()){
                System.out.print("결제 금액을 입력하세요: ");
                int amount=sc.nextInt();
                manager.process(p,amount);
            }else{
                System.out.println("[결제 실패: 준비 단계에서 중단]");
            }
        }
        manager.printSummary();

    }

}

