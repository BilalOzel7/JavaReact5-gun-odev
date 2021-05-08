package RegisterValid.core.concretes;

import RegisterValid.core.abstracts.GoogleService;
import RegisterValid.entities.concretes.User;
import RegisterValid.google.LoginGoogle;

public class GoogleManager implements GoogleService {
	
	private LoginGoogle loginGoogle;

	public GoogleManager(LoginGoogle loginGoogle) {
		super();
		this.loginGoogle = loginGoogle;
	}

	@Override
	public boolean signIn(User user) {
		
		return loginGoogle.sign›n(user);
	}

}
