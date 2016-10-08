package Secure;

import Model.User;
import Service.Service;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by serjd on 06.10.2016.
 */
public class UserDetailsServiceImpl implements UserDetailsService {

    private Service service;
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = service.getUser("serjdyach@gmail.com");
        Set<GrantedAuthority> roles = new HashSet();
        UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(),roles);

        return userDetails;
    }
}
