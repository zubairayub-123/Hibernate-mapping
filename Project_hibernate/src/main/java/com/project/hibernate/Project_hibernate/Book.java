package com.project.hibernate.Project_hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;

@Entity
public class Book {
	@Id
	@Column(name="book_id")
	private int id;
	
	private String name;
	
	private int pages;
	
	@ManyToMany(mappedBy = "books")
	private List<User> users;
	

	public Book(int id, String name, int pages, List<User> users) {
		super();
		this.id = id;
		this.name = name;
		this.pages = pages;
		this.users = users;
	}


	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPages() {
		return pages;
	}


	public void setPages(int pages) {
		this.pages = pages;
	}


	

	public List<User> getUsers() {
		return users;
	}


	public void setUsers(List<User> users) {
		this.users = users;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id +" : " +this.name+" : "+this.pages;
	}
	
	
	
}
