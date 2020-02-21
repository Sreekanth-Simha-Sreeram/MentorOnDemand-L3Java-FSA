package com.mentor.hibernate.service;

import com.mentor.hibernate.model.User;

public interface LoginService {
	
	 public void signUp(User user);
     public boolean signIn(String username,String password);

}
