package workingOOP;

public class Instructor extends User {
	
	private String biography;
	
	public Instructor() {
		
	}
	
	public Instructor(int id,String name,String email,String biography,String password) {
		this.setId(id);
		this.setFullName(name);
		this.setEmail(email);
		this.setBiography(biography);
		this.setPassword(password);
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}
	
	
	
}
