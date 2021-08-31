package workingOOP;

public class UserManager {
	public void login(User user) {
		System.out.println(user.getFullName()+ ": giriþ yaptý.");
	};
	
	public void logout(User user) {
		System.out.println(user.getFullName()+ ": çýkýþ yaptý.");
	};
}
