package com.akash.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.DTO.User;
import com.akash.Entity.UserDo;
import com.akash.Repo.UserRepo;
import com.akash.Service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
@Autowired
private UserRepo repo;

@Autowired
private ModelMapper modelMapper;

@Autowired
private static final Logger logInfo=LoggerFactory.getLogger(UserServiceImpl.class);
@Override
public User createUser(User user) {
	// TODO Auto-generated method stub
	UserDo map = this.modelMapper.map(user, UserDo.class);
	UserDo save = this.repo.save(map);
	User map2 = this.modelMapper.map(save, User.class);
	return map2;
}

@Override
public List<User> filterUser() {
	List<UserDo> findAll = this.repo.findAll();
	logInfo.info("The all records Are",findAll);
	 List<User> collect = findAll.stream().map((p)->this.modelMapper.map(p, User.class)).collect(Collectors.toList());
	return collect;
}
}
