package RegisterValid.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import RegisterValid.dataAccess.abstracts.UserDao;
import RegisterValid.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	private List<User> userList;

	public HibernateUserDao() {
	
		this.userList = new ArrayList<User>();
	}

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi :" + user.getFirstName());
		
	}

	@Override
	public void login(User user) {
		for (User u : userList) {
			if(user.getePosta().equals(u.getePosta())&user.getPassword().equals(u.getPassword())) {
				System.out.println("Giris yapildi : "+user.getePosta());
				
			}
			else {
				System.out.println("Email veya sifre hatalý giris");
				
				
			}}
		
	}
	@Override
	public boolean eMailCheck(String eMail) {
		boolean check = false;
		for (User user: userList ) {
			if (eMail.equals(user.getePosta())) {
				System.out.println("Bu ePosta sisteme zaten kayýtlý :" + eMail);
			} else {
				check=true;
			}		
		}
		return check;
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	
	

}
