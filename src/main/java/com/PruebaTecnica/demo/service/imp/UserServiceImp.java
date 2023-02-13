package com.PruebaTecnica.demo.service.imp;

import com.PruebaTecnica.demo.model.Rol;
import com.PruebaTecnica.demo.model.User;
import com.PruebaTecnica.demo.repository.UserRepository;
import com.PruebaTecnica.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service("userDetailsService")
public class UserServiceImp implements UserService, UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void desactivateUser(Long id) {
        Optional<User> product= userRepository.findById(id);
        if(product.isPresent()) {
            product.get().setStatus(false);
        }else {
            log.warn("Usuario no encontrado");
        }
    }

    @Override
    public List<User> finAll() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User usuario = userRepository.findByuserName(userName);

        if(usuario == null){
            throw new UsernameNotFoundException(userName);
        }

        List roles = new ArrayList<GrantedAuthority>();//Granted Tipo que necesita springsecurity para implementar el rol

        for(Rol rol: usuario.getRoles()){
            roles.add(new SimpleGrantedAuthority(rol.getName()));
        }

        return new org.springframework.security.core.userdetails.User(usuario.getUserName(), usuario.getPassword(), roles);
    }
}
