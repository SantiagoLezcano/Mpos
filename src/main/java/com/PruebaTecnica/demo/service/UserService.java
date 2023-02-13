package com.PruebaTecnica.demo.service;

import com.PruebaTecnica.demo.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;


public interface UserService {

    void saveUser(User user);

    void updateUser(User user);

    void desactivateUser(Long id);

    List<User> finAll();

    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException;
}
