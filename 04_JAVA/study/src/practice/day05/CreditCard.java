package practice.day05;

public class CreditCard implements Payment{
    int money;

    @Override
    public boolean pay(int amount) {
        money=amount;
        System.out.println("[신용카드] "+amount+"원 결제 완료");
        Payment.log("결제수단: [CreditCard], 금액: "+amount+"원");
        return true;
    }

    @Override
    public void approve() {
        System.out.println("[신용카드] 카드 승인 완료");
    }

    @Override
    public void cancel(String reason) {
        System.out.println("[신용카드] "+money+"원 결제 취소 - 사유: "+reason);
    }
}
