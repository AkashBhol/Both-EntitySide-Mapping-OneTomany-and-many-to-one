package com.akash.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.DTO.Post;
import com.akash.Entity.PostDo;
import com.akash.Entity.UserDo;
import com.akash.Repo.PostRepo;
import com.akash.Repo.UserRepo;
import com.akash.Service.IPostService;

@Service
public class PostServiceImpl implements IPostService {
	@Autowired
	private PostRepo repo;

	@Autowired
	private UserRepo repo1;

	@Autowired
	private ModelMapper mapper;

	@Autowired
	private static final Logger logInfo = LoggerFactory.getLogger(PostServiceImpl.class);

	@Override
	public Post createPost(Integer uId, Post post) {
		
		UserDo userDo = this.repo1.findById(uId).get();
		PostDo postDo = this.mapper.map(post,PostDo.class);
		postDo.setUser(userDo);
		PostDo save = this.repo.save(postDo);
		Post map = this.mapper.map(save, Post.class);
		return map;
	}

	@Override
	public List<Post> filterPost() {
		List<PostDo> findAll = this.repo.findAll();
		logInfo.info("The all post are",findAll);
		 List<Post> collect = findAll.stream().map((i)->this.mapper.map(i,Post.class)).collect(Collectors.toList());
		return collect;
	}
}
