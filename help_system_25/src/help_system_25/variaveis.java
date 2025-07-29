package help_system_25;

public class variaveis {
	
	private Integer User;
	private String Password;
	private String Email;
	private String Name;
	private String Type;
	
	public variaveis(Integer User, String Password, String Email, String Name, String Type) {
		
		this.setUser(User);
		this.setPassword(Password);
		this.setEmail(Email);
		this.setName(Name);
		this.setType(Type);
		
		
		
		
		
	}

	public Integer getUser() {
		return User;
	}

	public void setUser(Integer user) {
		User = user;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}
	

}
