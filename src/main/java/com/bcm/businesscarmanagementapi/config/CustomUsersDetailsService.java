package com.bcm.businesscarmanagementapi.config;

import com.bcm.businesscarmanagementapi.entity.Users;
import com.bcm.businesscarmanagementapi.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class CustomUsersDetailsService implements UserDetailsService {

    private final UsersRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        String userName;
        String password;
        List<GrantedAuthority> authorities;
        Optional<Users> user = userRepository.findByEmail(username);
        if(user.isEmpty()){
            throw  new UsernameNotFoundException("User details not found for the user: " + username);
        } else {
            userName = user.get().getEmail();
            password = user.get().getPassword();
            authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority(user.get().getRole()));
        }
        return new org.springframework.security.core.userdetails.User(username, password, authorities);
    }
}
