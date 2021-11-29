package com.example.todo;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.todo.db.SessionStore;
import com.example.todo.db.ToDo;
import com.example.todo.db.UserPass;
import com.example.todo.db.td;

@Controller
public class ToDoController {

	@Autowired
	td todo;
	@Autowired
	SessionStore store;
	
	@RequestMapping("/home")
	public String home(HttpServletRequest req) {
		HttpSession curr_session = req.getSession(); 
		if(!UserPass.checkLogin(curr_session.getId(), this.store))
		{
			return "redirect:/";
		}
//		String username = UserPass.returnUsername(curr_session.getId(), store); 
//		List<ToDo> tasks = todo.findByUsername(username);
		return "home.jsp";
	}
	
	
}
