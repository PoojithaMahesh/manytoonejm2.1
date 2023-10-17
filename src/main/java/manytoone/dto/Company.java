package manytoone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {
	
	@Id
	private int id;
	private String name;
	
	
//	getters and setterss
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + "]";
	}


	

}
