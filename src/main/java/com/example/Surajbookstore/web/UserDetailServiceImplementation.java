package com.example.Surajbookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.Surajbookstore.domain.User;
import com.example.Surajbookstore.domain.UserRepository;

@Service
public class UserDetailServiceImplementation implements UserDetailsService {
	
	private final UserRepository repository; 
	
	@Autowired
	public UserDetailServiceImplementation(UserRepository userRepository) {
		this.repository = userRepository;
	}
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User curruser = repository.findByUsername(username);
        UserDetails user = new org.springframework.security.core.userdetails.User(username, curruser.getPasswordHash(), 
        		AuthorityUtils.createAuthorityList(curruser.getRole()));
        return user;
	}

}
