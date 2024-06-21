package com.akash.Entity;

import java.util.List;

import org.springframework.data.repository.query.parser.Part.IgnoreCaseType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class UserDo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uId;
	private String name;
	private String city;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<PostDo> posts;

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<PostDo> getPosts() {
		return posts;
	}

	public void setPosts(List<PostDo> posts) {
		this.posts = posts;
	}

	public UserDo(int uId, String name, String city, List<PostDo> posts) {
		super();
		this.uId = uId;
		this.name = name;
		this.city = city;
		this.posts = posts;
	}

	@Override
	public String toString() {
		return "UserDo [uId=" + uId + ", name=" + name + ", city=" + city + ", posts=" + posts + "]";
	}
public UserDo() {
	// TODO Auto-generated constructor stub
}
}
