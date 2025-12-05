package patterns.structural.adapter.chpark;

/**
 * Adaptee (적응 대상자)
 * 새롭게 추가된 현대페이 - 기존 인터페이스와 다른 API를 가진 외부 시스템
 * 
 * 현대페이는 자체적인 메서드 시그니처를 가지고 있어
 * PaymentProcessor 인터페이스와 호환되지 않음
 */
public class HyundaiPay {
    
    /**
     * 현대페이 고유의 결제 메서드
     * 기존 인터페이스의 processPayment(int)와 다른 시그니처
     */
    public void makePayment(long amountInWon, String userId) {
        System.out.println("[현대페이] 사용자 " + userId + "의 " + amountInWon + "원 결제 시작");
        System.out.println("[현대페이] 현대카드 포인트 적립 중...");
        System.out.println("[현대페이] H-Point 0.5% 적립!");
        System.out.println("[현대페이] 결제 승인 완료!");
    }
    
    /**
     * 현대페이 고유의 결제 취소 메서드
     * 거래 ID와 취소 사유를 함께 받음
     */
    public boolean refund(String txId, String reason) {
        System.out.println("[현대페이] 거래 " + txId + " 환불 처리");
        System.out.println("[현대페이] 환불 사유: " + reason);
        System.out.println("[현대페이] H-Point 차감 후 환불 완료!");
        return true;
    }
    
    /**
     * 현대페이 서비스명 조회
     */
    public String getServiceName() {
        return "Hyundai Pay";
    }
}

