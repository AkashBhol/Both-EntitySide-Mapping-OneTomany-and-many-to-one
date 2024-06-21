package com.akash.DTO;

public class Post {
	private String pId;
	private String title;
	private String description;
	private String date;
	private User user;
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Post [pId=" + pId + ", title=" + title + ", description=" + description + ", date=" + date + ", user="
				+ user + "]";
	}
	public Post(String pId, String title, String description, String date, User user) {
		super();
		this.pId = pId;
		this.title = title;
		this.description = description;
		this.date = date;
		this.user = user;
	}
	public Post() {
		// TODO Auto-generated constructor stub
	}
}
