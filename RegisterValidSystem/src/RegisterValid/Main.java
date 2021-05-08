package RegisterValid;



import RegisterValid.business.concretes.UserCheckManager;
import RegisterValid.business.concretes.UserManager;
import RegisterValid.core.abstracts.GoogleService;
import RegisterValid.core.concretes.GoogleManager;
import RegisterValid.dataAccess.concretes.HibernateUserDao;
import RegisterValid.entities.concretes.User;
import RegisterValid.google.LoginGoogle;

public class Main {

	public static void main(String[] args) {
		User user = new User("Bilal","Özel","mbozel@gmail.com","mbhoy55");
		User user1=new User("Engin","Demirog","e.demirog.com","demir124");
		
		UserManager manager=new UserManager(new UserCheckManager(), new HibernateUserDao()); 
			
			manager.add(user);
			manager.login(user);
			manager.delete(user);

	GoogleService google=new GoogleManager(new LoginGoogle());
	google.signIn(user1);
	}
}
