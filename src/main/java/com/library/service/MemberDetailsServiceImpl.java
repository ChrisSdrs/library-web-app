package com.library.service;

import com.library.domain.Member;
import com.library.model.LoginResponse;
import com.library.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MemberDetailsServiceImpl implements UserDetailsService {

    @Autowired
    MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // here we would search into the repo for the member.
        // for not we are just going to send always a successful response.
        Member member = memberRepository.findByUsername(username).get();

/*        List<SimpleGrantedAuthority> authorization = Collections.singletonList(new SimpleGrantedAuthority("ADMIN"));
        CharSequence password = "password";*/

        return new LoginResponse(member.getUsername(), member.getPassword(), Arrays.asList(new SimpleGrantedAuthority(member.getRole())));


    }
}
