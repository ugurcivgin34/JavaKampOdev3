package Odev.business.concretes;

import java.util.ArrayList;
import java.util.List;

import Odev.business.abstracts.UserService;
import Odev.core.CheckVerification;
import Odev.core.SendEMail;
import Odev.core.Adapter.AuthService;
import Odev.core.utils.EmailCheckUtils;
import Odev.dataAccess.abstracts.UserDao;
import Odev.entitites.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private AuthService authService;
	

	public UserManager(UserDao userDao,AuthService authService) {
		this.userDao = userDao;
		this.authService=authService;
		
	}

	@Override
	public void register(User user) {
		if (user.getFirstName().length() < 2 && user.getLastName().length() < 2) {
			System.out.println("Kullan�c� ad� ile soyad 2 harften az olamaz");
			return;
		}
		if (user.getPassword().length() < 6) {
			System.out.println("�ifre 6 haneden az olamaz");
			return;

		}
		if (!EmailCheckUtils.isEmailValid(user.getEmail())) {
			System.err.println("Email do�ru formatta de�il");
			return;
		}

		if (userDao.getEmail(user.getEmail()) != null) {
			System.out.println("Bu e posta kullan�lmaktad�r.");
			return;
		}
		
		SendEMail.sendEmail(user.getEmail());
		userDao.add(user);
		CheckVerification.checkVerification(true);
		System.out.println(user.getFirstName() + " "+ user.getLastName());
		this.authService.registerToGoole(user + "Google hesab� ile eklendi");
		
		
		
	}

	@Override
	public void login(User user) {
		ArrayList<User> users = userDao.getAll();
		for (User user2 : users) {
			if(user.getEmail()==user2.getEmail()) {
				System.out.println("Giri� ba�ar�l�");
				return;
			}else {
				System.out.println("Giri� ba�ar�s�z");
				return;
			}
		}
		

	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
