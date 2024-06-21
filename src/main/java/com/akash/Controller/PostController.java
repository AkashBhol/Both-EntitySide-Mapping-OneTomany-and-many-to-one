package com.akash.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akash.DTO.Post;
import com.akash.Service.IPostService;

@RestController
@RequestMapping("/api/v3")
public class PostController {
	@Autowired
	private IPostService service;

	@PostMapping("/post/{id}")
	public ResponseEntity<Post> craetePost(@PathVariable int id, @RequestBody Post post) {
		Post createPost = this.service.createPost(id, post);
		return new ResponseEntity<Post>(createPost, HttpStatus.OK);
	}

	@GetMapping("/get/post")
	public ResponseEntity<List<Post>> filterPost() {
		List<Post> filterPost = this.service.filterPost();
		return new ResponseEntity<List<Post>>(filterPost, HttpStatus.OK);
	}
}
