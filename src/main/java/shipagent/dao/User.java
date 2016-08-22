package shipagent.dao;

import com.alibaba.fastjson.annotation.JSONField;

public class User {
	@JSONField(ordinal =1)
	private int id;
	
	@JSONField(ordinal =2)
	private String name;
	
	@JSONField(ordinal =3)
	private int age;
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
}
