package com.example.todo;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.todo.db.Session;
import com.example.todo.db.SessionStore;
import com.example.todo.db.Unap;
import com.example.todo.db.UserPass;

@Controller
public class HomeController {

	@Autowired
	Unap un;
	@Autowired
	SessionStore store;
	
	@RequestMapping("/")
	public String login() {
		return "login.jsp";
	}
	
	@RequestMapping("/register")
	public String register() {
		return "register.jsp";
	}
	
	@RequestMapping("/registered")
	public String registered(UserPass up) {
		un.save(up);
		return "redirect:/";
	}
	
	@RequestMapping("/login")
	public String check_login(UserPass up, HttpSession session) {
		
		Session new_session = new Session();
		session.setAttribute("SessionId", session.getId());
		new_session.setSessionId(session.getId());
		new_session.setUsername(up.getUsername());
		
		if(up.authenticate(up, this.un)) {
			
			this.store.save(new_session);
			return "redirect:/home";
		}
		return "redirect:/";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		
		Session curr_session = store.findById(session.getId()).orElse(null);
		if(curr_session!=null) {
			store.delete(curr_session);
		}
		return "redirect:/";
	}
}
