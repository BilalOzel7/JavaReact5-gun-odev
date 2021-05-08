package RegisterValid.core.concretes;

import java.util.List;

import RegisterValid.core.abstracts.EMailService;
import RegisterValid.entities.concretes.User;

public class ConfirmEMailManager implements EMailService{

	@Override
	public void confirmMessage(User user) {
		System.out.println(user.getePosta() + " adresinize do�rulama mesaj� g�nderilmi�tir");
		
	}

	@Override
	public void confirmMessageCheck(List<User> users, User user) {
		for(User user1 : users) {
			if(user1.getePosta() == user.getePosta()) {
				System.out.println("Adresiniz do�ruland� :" + user1.getePosta() );
				return;
			}else {
				System.out.println("Adresiniz do�rulanamad�");
				return;
			}
		}}
		
}


