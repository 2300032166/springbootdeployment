package com.klef.fsd.sdpproject.model;

	import jakarta.persistence.*;

	@Entity
	@Table(name = "faculty_table")
	public class Faculty {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "faculty_id")
	    private int id;

	    @Column(length = 50, nullable = false)
	    private String name;

	    @Column(length = 50, nullable = false, unique = true)
	    private String email;

	    @Column(length = 50, nullable = false, unique = true)
	    private String username;

	    @Column(length = 50, nullable = false)
	    private String password;

	    @Column(length = 15, nullable = false, unique = true)
	    private String mobile;

	    // Getters and Setters
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

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getMobile() {
	        return mobile;
	    }

	    public void setMobile(String mobile) {
	        this.mobile = mobile;
	    }
	}


