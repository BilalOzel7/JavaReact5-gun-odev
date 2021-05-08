package RegisterValid.core.concretes;

import java.util.List;

import RegisterValid.core.abstracts.EMailService;
import RegisterValid.entities.concretes.User;

public class ConfirmEMailManager implements EMailService{

	@Override
	public void confirmMessage(User user) {
		System.out.println(user.getePosta() + " adresinize doðrulama mesajý gönderilmiþtir");
		
	}

	@Override
	public void confirmMessageCheck(List<User> users, User user) {
		for(User user1 : users) {
			if(user1.getePosta() == user.getePosta()) {
				System.out.println("Adresiniz doðrulandý :" + user1.getePosta() );
				return;
			}else {
				System.out.println("Adresiniz doðrulanamadý");
				return;
			}
		}}
		
}


