package patterns.structural.adapter.kimys;

import patterns.structural.adapter.kimys.adapter.AccountUserDetailsService;
import patterns.structural.adapter.kimys.security.LoginHandler;
import patterns.structural.adapter.kimys.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        // 어댑터 패턴 : 기존 코드를 클라이언트가 사용하는 인터페이스의 구현체로 바꿔주는 패턴
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("kimys", "kimys");
        System.out.println(login);
    }
}
