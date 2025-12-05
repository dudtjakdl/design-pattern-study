package patterns.structural.adapter.chpark;

/**
 * 타겟 인터페이스 (Target Interface)
 * 클라이언트가 사용하는 통합 결제 인터페이스
 */
public interface PaymentProcessor {
    
    /**
     * 결제 처리
     * @param amount 결제 금액
     * @return 결제 성공 여부
     */
    boolean processPayment(int amount);
    
    /**
     * 결제 취소
     * @param transactionId 거래 ID
     * @return 취소 성공 여부
     */
    boolean cancelPayment(String transactionId);
    
    /**
     * 결제 수단 이름 조회
     * @return 결제 수단 이름
     */
    String getPaymentMethod();
}

