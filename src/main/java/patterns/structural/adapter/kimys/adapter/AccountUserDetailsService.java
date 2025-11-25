package patterns.structural.adapter.kimys.adapter;

import patterns.structural.adapter.kimys.Account;
import patterns.structural.adapter.kimys.AccountService;
import patterns.structural.adapter.kimys.security.UserDetails;
import patterns.structural.adapter.kimys.security.UserDetailsService;

// AccountService --> UserDetailsService 변환하는 adapter
public class AccountUserDetailsService implements UserDetailsService {

    private AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }
}
