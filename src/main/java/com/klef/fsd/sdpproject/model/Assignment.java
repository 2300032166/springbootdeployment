package com.klef.fsd.sdpproject.model;

	import jakarta.persistence.*;
	import java.time.LocalDate;

	@Entity
	public class Assignment {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String title;
	    private String description;
	    private LocalDate dueDate;

	    @ManyToOne
	    private Course course;

	    // Getters and Setters
	    public Long getId() 
	    { return id; 
	    }
	    public void setId(Long id) {
	    	this.id = id; 
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
	    public void setDescription(String description) { this.description = description; }

	    public LocalDate getDueDate() { return dueDate; }
	    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

	    public Course getCourse() { return course; }
	    public void setCourse(Course course) { this.course = course; }
	}

