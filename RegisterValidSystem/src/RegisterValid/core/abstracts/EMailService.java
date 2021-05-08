package RegisterValid.core.abstracts;

import java.util.List;

import RegisterValid.entities.concretes.User;

public interface EMailService {
	public void confirmMessage(User user);
	public void confirmMessageCheck(List<User> users ,User user);

}
