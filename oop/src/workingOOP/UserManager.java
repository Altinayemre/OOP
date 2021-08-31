package workingOOP;

public class UserManager {
	public void login(User user) {
		System.out.println(user.getFullName()+ ": giris yapti.");
	};
	
	public void logout(User user) {
		System.out.println(user.getFullName()+ ": çikis yapti.");
	};
}
