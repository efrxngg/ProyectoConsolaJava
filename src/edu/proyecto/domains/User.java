package edu.proyecto.domains;

public class User extends Person{
	private Integer id;
	
	public User() {}
	
	public User(Integer id, String name, String last_name) {
		super(name, last_name);
		this.id = id;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String getData() {
		// TODO Auto-generated method stub
		return getId()+" "+getName()+" "+getLast_name();
	}
	
}
