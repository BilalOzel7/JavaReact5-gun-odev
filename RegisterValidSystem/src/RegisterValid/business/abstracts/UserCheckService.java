package RegisterValid.business.abstracts;

import RegisterValid.entities.concretes.User;

public interface UserCheckService {
	boolean VerificationEMail(String eMail);
	boolean VerificationUser(User user);

}
