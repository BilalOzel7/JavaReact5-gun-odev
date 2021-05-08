package RegisterValid.dataAccess.abstracts;



import RegisterValid.entities.concretes.User;

public interface UserDao {
	
	public void add(User user);
	public void delete(User user);
	public void update(User user);
	boolean eMailCheck(String eMail);
	public void login(User user);
	
}
