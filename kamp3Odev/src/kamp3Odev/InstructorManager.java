package kamp3Odev;

public class InstructorManager extends UserManager {
	public void add(User user) {
		System.out.println("E�itmen eklendi " + user.getFirstName() + " " + user.getLastName());
	}

	public void delete(User user) {
		System.out.println("E�itmen silindi");
	}

	public void update(User user) {
		System.out.println("E�itmen g�ncellendi");
	}

	public void logIn(User user) {
		System.out.println("E�itmen giri� yapt�");
	}

	public void logOut(User user) {
		System.out.println("E�itmen ��k�� yapt�");
	}
}
