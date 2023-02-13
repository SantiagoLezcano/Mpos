package com.PruebaTecnica.demo.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Encrypt {
    public static void main(String[] args) {

        String password = "456";
        System.out.println("password: " + password);
        System.out.println("password encriptado:" + encriptarPassword(password));
    }

    public static String encriptarPassword(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}
