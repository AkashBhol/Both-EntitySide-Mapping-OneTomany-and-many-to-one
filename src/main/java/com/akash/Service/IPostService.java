package com.akash.Service;

import java.util.List;

import com.akash.DTO.Post;

public interface IPostService {
Post createPost(Integer uId,Post post);

List<Post> filterPost();
}
