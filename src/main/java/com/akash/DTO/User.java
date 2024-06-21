package com.akash.DTO;

import java.util.List;

public class User {
private int uId;
private String name;
private String city;

//private List<Post> posts;

public User(int uId, String name, String city, List<Post> posts) {
	super();
	this.uId = uId;
	this.name = name;
	this.city = city;
	//this.posts = posts;
}

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

//public List<Post> getPosts() {
//	return posts;
//}
//
//public void setPosts(List<Post> posts) {
//	this.posts = posts;
//}

@Override
public String toString() {
	return "User [uId=" + uId + ", name=" + name + ", city=" + city + "]";
}
public User() {
	// TODO Auto-generated constructor stub
}

}
