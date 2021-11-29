package com.example.todo.db;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Session {

	@Id
	private String SessionId;
	private String username;
	public String getSessionId() {
		return SessionId;
	}
	public void setSessionId(String sessionId) {
		SessionId = sessionId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
