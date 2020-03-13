package com.ayudantia.demo.Autentificacion.Modelos;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


public class MyUserDetails implements UserDetails {

    private String userName;
    private String password;

    public MyUserDetails(User user){
        this.userName = user.getUserName();
        this.password = user.getPassword();
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return this.password;
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return this.userName;
    }
    
}