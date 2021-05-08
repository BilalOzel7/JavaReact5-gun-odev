package RegisterValid.business.abstracts;

import RegisterValid.entities.concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	void login(User user);
}
