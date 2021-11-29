package com.example.todo.db;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ToDo {

	@Id
	private int s_no;
	private String task;
	private Boolean done; 
	private String deadline;
	
	public ToDo() {}

	public ToDo(int s_no, String task, Boolean done, String deadline) {
		super();
		this.s_no = s_no;
		this.task = task;
		this.done = done;
		this.deadline = deadline;
	}

	public int getS_no() {
		return s_no;
	}

	public void setS_no(int s_no) {
		this.s_no = s_no;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Boolean getDone() {
		return done;
	}

	public void setDone(Boolean done) {
		this.done = done;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	@Override
	public String toString() {
		return "ToDo [s_no=" + s_no + ", task=" + task + ", done=" + done + ", deadline=" + deadline + "]";
	}	
}
