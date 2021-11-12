package com.Todo.Assessment.Util;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="seque")
public class SequenceNum {
	
	@Id
	private int id;
	
	private int squenumber;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSquenumber() {
		return squenumber;
	}
	public void setSquenumber(int squenumber) {
		this.squenumber = squenumber;
	}
	
	

}
