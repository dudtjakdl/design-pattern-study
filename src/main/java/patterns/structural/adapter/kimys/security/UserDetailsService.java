package patterns.structural.adapter.kimys.security;

// target
public interface UserDetailsService {

    UserDetails loadUser(String username);

}
