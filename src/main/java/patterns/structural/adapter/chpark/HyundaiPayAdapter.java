package patterns.structural.adapter.chpark;

/**
 * 어댑터 (Adapter)
 * HyundaiPay를 PaymentProcessor 인터페이스에 맞게 변환하는 어댑터
 * 
 * - 클라이언트는 PaymentProcessor 인터페이스만 알면 됨
 * - HyundaiPay의 복잡한 API를 내부적으로 처리
 */
public class HyundaiPayAdapter implements PaymentProcessor {
    
    // Adaptee를 내부에 포함 (객체 어댑터 패턴)
    private final HyundaiPay hyundaiPay;
    private final String defaultUserId;
    
    public HyundaiPayAdapter(HyundaiPay hyundaiPay) {
        this.hyundaiPay = hyundaiPay;
        this.defaultUserId = "GUEST";
    }
    
    public HyundaiPayAdapter(HyundaiPay hyundaiPay, String userId) {
        this.hyundaiPay = hyundaiPay;
        this.defaultUserId = userId;
    }
    
    @Override
    public boolean processPayment(int amount) {
        // int → long 변환 및 추가 파라미터(userId) 처리
        hyundaiPay.makePayment(amount, defaultUserId);
        return true;
    }
    
    @Override
    public boolean cancelPayment(String transactionId) {
        // 기본 취소 사유를 설정하여 호출
        return hyundaiPay.refund(transactionId, "고객 요청에 의한 취소");
    }
    
    @Override
    public String getPaymentMethod() {
        // 서비스명을 한글로 변환
        return "현대페이";
    }
}

