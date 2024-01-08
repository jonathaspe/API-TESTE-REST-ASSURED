package com.santos.resources.exceptions;

public class StandardError {

	private Integer stats;
	private Long timestamp;
	private String message;
	
	
	
	public StandardError() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public StandardError(Integer stats, Long timestamp, String message) {
		super();
		this.stats = stats;
		this.timestamp = timestamp;
		this.message = message;
	}
	
	
	public Integer getStats() {
		return stats;
	}
	
	public void setStats(Integer stats) {
		this.stats = stats;
	}
	
	public Long getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
