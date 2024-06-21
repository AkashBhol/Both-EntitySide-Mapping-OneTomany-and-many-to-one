package com.akash.Entity;

import java.util.Date;

import javax.xml.crypto.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "posts")
public class PostDo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pId;
	private String title;
	private String description;
	private Date date;

	@ManyToOne
	@JoinColumn(name = "")
	private UserDo user;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public UserDo getUser() {
		return user;
	}

	public void setUser(UserDo user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "PostDo [pId=" + pId + ", title=" + title + ", description=" + description + ", date=" + date + ", user="
				+ user + "]";
	}

	public PostDo(int pId, String title, String description, Date date, UserDo user) {
		super();
		this.pId = pId;
		this.title = title;
		this.description = description;
		this.date = date;
		this.user = user;
	}

	public PostDo() {
		// TODO Auto-generated constructor stub
	}

}
