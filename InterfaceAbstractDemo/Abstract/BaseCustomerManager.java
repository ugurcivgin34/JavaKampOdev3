
public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) throws Exception {
		System.out.println("Saved to db :" + customer.getFirstName());

	}

	// save kodlar� ayn� oldu�undan �al��acak kodlar ayn� ama �ncesinde yap�lacak
	// i�ler farkl�, interfacelerde kod �al��t�ram�yoruz sadece imza. Ama base
	// abstract classda base olarak �al��acak ayn� kodlar� "Dont Repeat Yourself"
	// kural�na da uyarak gayet g�zel �al��t�rabiliyoruz. Yani t�m kahveciler i�in
	// managerlarda dbye kaydetme kodlar� yazmak yerine base managerda yaz�p t�m
	// kahveciler i�in base managerdaki methodu �a�r�nca tek bir yerden y�netmi�
	// olduk.

}
