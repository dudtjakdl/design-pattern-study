package patterns.structural.adapter.kimys.adapter;

import patterns.structural.adapter.kimys.Account;
import patterns.structural.adapter.kimys.security.UserDetails;

// Account --> UserDetails 변환하는 adapter
public class AccountUserDetails implements UserDetails {

    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return this.account.getName();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }
}
