package com.Todo.Assessment.Util;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

@Document(collection= "tasks123")
public class Tasks {
	
	@Id
	private Integer id;
	
	@NonNull
	private String desc;
	
	private Boolean isDone;

	
	public Tasks(Integer id, String desc, Boolean isDone) {
		super();
		this.id = id;
		this.desc = desc;
		this.isDone = isDone;
	}

	public static final int SEQUENCE_NAME = 0;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Boolean getIsDone() {
		return isDone;
	}

	public void setIsDone(boolean b) {
		this.isDone = b;
	}

	
	@Override
	public String toString() {
		return "Tasks [id=" + id + ", desc=" + desc + ", isDone=" + isDone + "]";
	}
	
}