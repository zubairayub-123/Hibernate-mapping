package com.project.hibernate.Project_hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	@Column(name = "user_id")
	private int uid;
	
	private String fname;
	
	private String loc;
	
//	@OneToOne
//	private Book book;
	
	@OneToMany
	private List<Book> books;
	
	

	public User(int uid, String fname, String loc, List<Book> books) {
	super();
	this.uid = uid;
	this.fname = fname;
	this.loc = loc;
	this.books = books;
}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.uid +" : " +this.fname+" : "+this.loc;
	}
	
	
	
}
