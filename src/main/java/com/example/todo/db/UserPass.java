package com.example.todo.db;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserPass {

	@Id
	private String username;
	private String password;
	
	public UserPass() {}
	
	public UserPass(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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
	@Override
	public String toString() {
		return "UserPass [username=" + username + ", password=" + password + "]";
	}
	
	public Boolean authenticate(UserPass up, Unap un) {
		
//		Searching for a record in the db with the same username 
		UserPass newUs = un.findById(up.getUsername()).orElse(null);
		
//		If the user is not registered or if the password is wrong
		if(newUs==null || !newUs.getPassword().equals(up.getPassword())) {
			return false;
		}		
		return true;
	}
	
	public static Boolean checkLogin(String SessionId, SessionStore store) {
		Session curr_session = store.findById(SessionId).orElse(null);
		if(curr_session==null) {
			return false;
		}
		return true;
	}
	
	public static String returnUsername(String SessionID, SessionStore store) {
		
		Session curr_session = store.findById(SessionID).orElse(null);
		return curr_session.getUsername();
	}
}
