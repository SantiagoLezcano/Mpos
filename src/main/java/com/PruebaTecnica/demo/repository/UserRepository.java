package com.PruebaTecnica.demo.repository;

import com.PruebaTecnica.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByuserName(String userName);

}
