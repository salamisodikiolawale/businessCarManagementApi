package com.bcm.businesscarmanagementapi.service;

import com.bcm.businesscarmanagementapi.entity.User;
import com.bcm.businesscarmanagementapi.repository.UserRepository;
import com.bcm.businesscarmanagementapi.security.ApplicationUser;
import com.bcm.businesscarmanagementapi.security.ApplicationUserDAO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService{

    private final UserRepository userRepository;
    private final ApplicationUserDAO applicationUserDAO;

    @Autowired
    public UserService(@Qualifier("fake") ApplicationUserDAO applicationUserDAO, UserRepository userRepository) {
        this.applicationUserDAO = applicationUserDAO;
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        ApplicationUser applicationUser = applicationUserDAO.selectApplicationUserByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException(String.format("Username %s not found", username)));
        return applicationUser;
    }
}
