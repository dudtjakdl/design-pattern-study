package patterns.structural.adapter.chpark;

import java.util.ArrayList;
import java.util.List;

/**
 * 클라이언트 코드
 * PaymentProcessor 인터페이스만 의존하며, 구체적인 결제 수단을 알 필요 없음
 */
public class PaymentDemo {
    
    public static void main(String[] args) {
        // 통합 결제 시스템에 등록된 결제 수단들
        List<PaymentProcessor> paymentMethods = new ArrayList<>();
        
        // 기존 결제 수단 - 이미 PaymentProcessor 인터페이스 구현
        paymentMethods.add(new KakaoPay());
        paymentMethods.add(new NaverPay());
        
        // 새로운 결제 수단 - 어댑터를 통해 추가
        // HyundaiPay는 다른 인터페이스를 가지지만, 어댑터로 감싸서 사용
        HyundaiPay hyundaiPay = new HyundaiPay();
        paymentMethods.add(new HyundaiPayAdapter(hyundaiPay, "USER_001"));
        
        System.out.println("========================================");
        System.out.println("       🛒 통합 결제 시스템 테스트");
        System.out.println("========================================\n");
        
        // 모든 결제 수단으로 동일한 방식으로 결제 처리
        int orderAmount = 50000;
        
        for (PaymentProcessor processor : paymentMethods) {
            System.out.println("▶ " + processor.getPaymentMethod() + "로 결제");
            System.out.println("----------------------------------------");
            
            boolean success = processor.processPayment(orderAmount);
            System.out.println("결제 결과: " + (success ? "✅ 성공" : "❌ 실패"));
            System.out.println();
        }
        
        System.out.println("========================================");
        System.out.println("          💳 결제 취소 테스트");
        System.out.println("========================================\n");
        
        // 결제 취소도 동일한 인터페이스로 처리
        for (PaymentProcessor processor : paymentMethods) {
            System.out.println("▶ " + processor.getPaymentMethod() + " 결제 취소");
            System.out.println("----------------------------------------");
            
            boolean cancelled = processor.cancelPayment("TXN-" + System.currentTimeMillis());
            System.out.println("취소 결과: " + (cancelled ? "✅ 성공" : "❌ 실패"));
            System.out.println();
        }
        
        System.out.println("========================================");
        System.out.println("  어댑터 패턴으로 현대페이가 성공적으로 통합됨!");
        System.out.println("========================================");
    }
}

