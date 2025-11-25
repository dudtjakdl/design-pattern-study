package patterns.structural.adapter.kimys;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

public class AdapterInSpring {

    public static void main(String[] args) {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        // 우리가 작성하는 다양한 형태의 핸들로 코드를 스프링 MVC가 실행할 수 있는 형태로 변환해주는 어댑터용 인터페이스
        HandlerAdapter handlerAdapter = new RequestMappingHandlerAdapter();
    }
}
