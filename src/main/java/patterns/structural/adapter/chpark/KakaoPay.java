package patterns.structural.adapter.chpark;

/**
 * 기존 결제 시스템 - 카카오페이
 * 이미 PaymentProcessor 인터페이스를 구현하고 있음
 */
public class KakaoPay implements PaymentProcessor {
    
    @Override
    public boolean processPayment(int amount) {
        System.out.println("[카카오페이] " + amount + "원 결제 요청");
        System.out.println("[카카오페이] 카카오톡 인증 진행 중...");
        System.out.println("[카카오페이] 결제 완료!");
        return true;
    }
    
    @Override
    public boolean cancelPayment(String transactionId) {
        System.out.println("[카카오페이] 거래 ID: " + transactionId + " 결제 취소 요청");
        System.out.println("[카카오페이] 결제 취소 완료!");
        return true;
    }
    
    @Override
    public String getPaymentMethod() {
        return "카카오페이";
    }
}

