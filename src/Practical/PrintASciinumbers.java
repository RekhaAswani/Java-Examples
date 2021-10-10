package Practical;

public class PrintASciinumbers {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		countasscii2("Acc$1234");
	}

	public static void countasscii2(String str) {

		int accii1 = 0, accii2 = 0, accii3 = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				// consonant++;
				accii1 = ch;
				System.out.println("Ascii value of " +ch+ " character is :" +accii1);
			} else if (ch >= '0' && ch <= '9') {
				// digit++;
				accii2 = ch;
				System.out.println("Ascii value of " +ch+" digit is :" +accii2);
			} else {
				accii3 = ch;
				// speacialChar++;
				System.out.println("Ascii value of " +ch+ "special character is " +accii3);
			}
		}
//		System.out.println("String: " + accii1);
//		System.out.println("Digit: " + accii2);
//		System.out.println("Special character: " + accii3);
	}

	/**
	 * Printing ascii values from A to Z
	 */
	// public static void countasscii(String str) {
	//
	// for (char c = 'a'; c <= 'z'; c++) {
	// int ascii = c;
	//
	// System.out.println(ascii);
	// }
	//
	// }

}
