package com.klef.fsd.sdpproject.dto;
	import java.time.LocalDate;

	public class AssignmentDTO {
	    private Long courseId;
	    private String title;
	    private String description;
	    private LocalDate dueDate;

	    // Getters and Setters
	    public Long getCourseId() { return courseId; }
	    public void setCourseId(Long courseId) { this.courseId = courseId; }

	    public String getTitle() { return title; }
	    public void setTitle(String title) { this.title = title; }

	    public String getDescription() { return description; }
	    public void setDescription(String description) { this.description = description; }

	    public LocalDate getDueDate() { return dueDate; }
	    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }
	}

