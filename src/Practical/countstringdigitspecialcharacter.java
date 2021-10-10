package Practical;

public class countstringdigitspecialcharacter {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Rekha@1234";
		countcharacterType(name);
	}

	public static void countcharacterType(String str) {
		int speacialChar = 0, digit = 0, consonant = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				consonant++;
			} else if (ch >= '0' && ch <= '9')
				digit++;
			else {
				speacialChar++;
			}
		}

		System.out.println("String: " + consonant);
		System.out.println("Digit: " + digit);
		System.out.println("Special character: " + speacialChar);
	}

}
