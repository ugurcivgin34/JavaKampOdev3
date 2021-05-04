package Business.Concrete;

import Business.Abstract.CheckIfRealPerson;
import Business.Abstract.UserService;
import Entities.Concrete.User;

public class UserManager implements UserService{

	CheckIfRealPerson checkIfRealPerson;
	
	public UserManager(CheckIfRealPerson checkIfRealPerson) {
		this.checkIfRealPerson=checkIfRealPerson;
	}
	@Override
	public void add(User user) throws Exception {
		if(checkIfRealPerson.checkIfRealPerson(user)) {
		System.out.println(" Kullan�c� eklendi " + user.getFirstName());
		} else {
			System.out.println("Kullan�c� E devlet sisteminde olmad��� i�in eklenemez");
		}
	}

	@Override
	public void update(User user) {
		System.out.println("Kullan�c� g�ncellendi" + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullan�c� silindi" + user.getFirstName());
		
	}

}
