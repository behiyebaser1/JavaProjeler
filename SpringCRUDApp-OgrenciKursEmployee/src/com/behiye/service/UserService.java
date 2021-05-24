package com.behiye.service;

import com.behiye.domain.User;

public interface UserService {

	public abstract User validateUserLogin(String email, String password);

}
