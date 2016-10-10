package Secure;

import Hibernate.DataUser;
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
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        DataUser user = service.getUserByEmail(email);
        Set<GrantedAuthority> roles = new HashSet();
        UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(),roles);

        return userDetails;
    }
}
