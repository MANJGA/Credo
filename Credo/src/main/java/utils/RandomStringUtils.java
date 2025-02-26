package utils;

import java.util.Random;

public class RandomStringUtils {

	   private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

	    public  String getRandomAlphaNumeric(int length) {
	        StringBuilder sb = new StringBuilder(length);
	        Random ran = new Random();
	        for (int i = 0; i < length; i++) {
	            sb.append(CHARACTERS.charAt(ran.nextInt(CHARACTERS.length())));
	        }
	        return sb.toString();
	    }
	    
	    public  String getRandomAlphaNumeric() {
	    	int length =(int) (Math.random() * 20)+1;
	        Random ran = new Random();
	        StringBuilder sb = new StringBuilder(length);
	        for (int i = 0; i < length; i++) {
	            sb.append(CHARACTERS.charAt(ran.nextInt(CHARACTERS.length())));
	        }
	        return sb.toString();
	    }

//		public String getValidUsername(int length) {
//			if (length > 1) {
//				String username = getRandomAlphaNumeric(length - 10);
//				return username + "@gmail.com";
//			} else {
//				throw new IllegalArgumentException("Length must be greater than 10 to include '@gmail.com'");
//			}
//		}

	}



