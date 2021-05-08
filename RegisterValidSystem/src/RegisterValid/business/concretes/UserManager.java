package RegisterValid.business.concretes;

import RegisterValid.business.abstracts.UserCheckService;
import RegisterValid.business.abstracts.UserService;
import RegisterValid.dataAccess.abstracts.UserDao;
import RegisterValid.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserCheckService userCheck;
	private UserDao hibernate;

	public UserManager(UserCheckService userCheck, UserDao hibernate) {
		super();
		this.userCheck = userCheck;
		this.hibernate = hibernate;
	}

	@Override
	public void add(User user) {
		if (userCheck.VerificationUser(user)) {
			hibernate.add(user);
			return;
		}
		System.out.println("L�tefen kullan�c� bilgilerinin do�ru oldu�unu kontrol edin.");
		
	}

	@Override
	public void delete(User user) {
		hibernate.delete(user);
		
	}

	@Override
	public void update(User user) {
		hibernate.update(user);
	}

	@Override
	public void login(User user) {
		hibernate.login(user);
		
	}

}
