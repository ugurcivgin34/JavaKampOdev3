package kamp3Odev;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullan�c� eklendi " + user.getFirstName() + " "+user.getLastName());
	}

	public void delete(User user) {
		System.out.println("Kullan�c� silindi");
	}

	public void update(User user) {
		System.out.println("Kullan�c� g�ncellendi");
	}

	public void logIn(User user) {
		System.out.println("Kullan�c� giri� yapt�");
	}

	public void logOut(User user) {
		System.out.println("Kullan�c� ��k�� yapt�");
	}
}
