package kamp3Odev;

public class StudentManager extends UserManager {
	public void add(User[] user) {
		System.out.println("��renci eklendi " );
	}

	public void delete(User user) {
		System.out.println("��renci silindi");
	}

	public void update(User user) {
		System.out.println("��renci g�ncellendi");
	}

	public void logIn(User user) {
		System.out.println("��renci giri� yapt�");
	}

	public void logOut(User user) {
		System.out.println("��renci ��k�� yapt�");
	}
}
