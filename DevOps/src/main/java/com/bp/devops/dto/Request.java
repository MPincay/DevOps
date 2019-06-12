package com.bp.devops.dto;

public class Request {

	private String message;
	private String to;
	private String from;
	private int timeToLifeSec;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public int getTimeToLifeSec() {
		return timeToLifeSec;
	}
	public void setTimeToLifeSec(int timeToLifeSec) {
		this.timeToLifeSec = timeToLifeSec;
	}
	
	
}
