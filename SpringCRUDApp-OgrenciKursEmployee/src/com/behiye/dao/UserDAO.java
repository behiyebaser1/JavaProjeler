package com.behiye.dao;

import com.behiye.domain.User;

public interface UserDAO {

	public User validateUserLogin(String email, String password);

}
