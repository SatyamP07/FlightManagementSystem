package com.example.application.utility;

public class Encryption {

	public static String passwordEncryptor(String password) {
		int key = 7;
		long encryptedNumber = 0;
		for(int i = 0; i < password.length(); i++) {
			encryptedNumber += (int)password.charAt(i) * key;
		}
		return "" + encryptedNumber;
	}
}
