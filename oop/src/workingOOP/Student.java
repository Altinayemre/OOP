package workingOOP;

public class Student extends User{
	
	private String country;
	private String city;
	
	public Student() {
		
	}
	
	public Student(int id,String name,String email,String country,String city,String password) {
		this.setId(id);
		this.setFullName(name);
		this.setEmail(email);
		this.setCountry(country);
		this.setCity(city);
		this.setPassword(password);
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	

	
	
}
