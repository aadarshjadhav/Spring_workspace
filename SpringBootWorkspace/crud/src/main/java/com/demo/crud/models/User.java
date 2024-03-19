package com.demo.crud.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="user")
public class User {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="fullname")
	private String fullname;
	
	@Column(name="username")
	private String username;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="isadmin")
	private boolean isadmin;

}

/*
 *  "fullname": "Aadarsh Jadhav",
      "username": "aadarshjadhav",
      "email": "aadarshjadhav@gmail.com",
      "password": "aadarsh",
      "isadmin": true*/
