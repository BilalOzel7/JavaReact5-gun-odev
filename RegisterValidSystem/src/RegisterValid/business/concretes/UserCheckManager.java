package RegisterValid.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import RegisterValid.business.abstracts.UserCheckService;
import RegisterValid.entities.concretes.User;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean VerificationEMail(String eMail) {
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(eMail);

		if (!matcher.matches()) {
			System.out.println("Lütfen mail formatinda giriniz .");
			return false;
		}
		return true;
	}

	@Override
	public boolean VerificationUser(User user) {
		if(user.getFirstName().length()<2) {
			System.out.println("Kullanici adi en az 2 karakter olmalidir.");
			return false;
		}
		if(user.getLastName().length()<2) {
			System.out.println("Kullanici soyadi en az 2 karakter olmalidir.");
			return false;
		}
		if(user.getPassword().length()<6) {
			System.out.println("Parola en az 6 karakter olmalidir.");
			return false;
		}
		if(!VerificationEMail(user.getePosta())) {
			System.out.println("Lütfen e posta formatinda giriniz.");
			return false;
		}
		return true;
	}

}
