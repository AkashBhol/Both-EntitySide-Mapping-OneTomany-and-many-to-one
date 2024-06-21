package com.akash.Service;

import java.util.List;

import com.akash.DTO.User;

public interface IUserService {
	User createUser(User user);

	List<User> filterUser();
}
