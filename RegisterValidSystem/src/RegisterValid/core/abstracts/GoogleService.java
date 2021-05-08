package RegisterValid.core.abstracts;

import RegisterValid.entities.concretes.User;

public interface GoogleService {
	boolean signIn(User user);
}
