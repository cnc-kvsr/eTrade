package eTrade.core.concretes;

import eTrade.core.abstracts.ValidationService;

public class EmailValidatorManager implements ValidationService{

	@Override
	public void sendMail() {
		System.out.println("Doğrulama maili hesabınıza gönderildi!");
		
	}

}
