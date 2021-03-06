/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ncs.masterAuto.security;

import com.ncs.masterAuto.domain.bean.UserAccount;
import com.ncs.masterAuto.domain.model.Service.AccountService;
import java.util.ArrayList;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author wadie
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private AccountService accountService;

    @Override
    public UserDetails loadUserByUsername(String adresseMail) throws UsernameNotFoundException {
        UserAccount userAccount = accountService.loadUserByAdresseMail(adresseMail);
        if (userAccount == null) {
            throw new UsernameNotFoundException("User non  trouvé");
        }
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        userAccount.getRoles().forEach(r -> {
            authorities.add(new SimpleGrantedAuthority(r.getRolename()));
        });

        return new org.springframework.security.core.userdetails.User(userAccount.getAdresseMail(), userAccount.getPassword(), authorities);
    }
}
