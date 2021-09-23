package p99codingbat;

public class String2 {
	public boolean endOther(String a, String b) {
		String al = a.toLowerCase();
		String bl = b.toLowerCase();

		return al.endsWith(bl) || bl.endsWith(al);
	}

	public int countCode(String str) {

		int count = 0;
		for (int i = 0; i < str.length() - 3; i++) {
			String sub = str.substring(i, i + 4);
			if (java.util.regex.Pattern.matches("co.e", sub)) {
				count++;
			}
		}
		return count;

	}

	public boolean bobThere(String str) {
		/*
		 * return java.util.regex.Pattern.matches(".*b.b.*", str);
		 */

		for (int i = 0; i < str.length() - 2; i++) {
			String sub = str.substring(i, i + 3);

			if (sub.charAt(0) == 'b' && sub.charAt(2) == 'b') {
				return true;
			}
		}

		return false;
	}

	public boolean catDog(String str) {
		int catCnt = 0;
		int dogCnt = 0;

		for (int i = 0; i < str.length() - 2; i++) {
			String sub = str.substring(i, i + 3);

			if (sub.equals("cat")) {
				catCnt++;
			}

			if (sub.equals("dog")) {
				dogCnt++;
			}
		}

		return catCnt == dogCnt;
	}

	public int countHi(String str) {
		int count = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			String sub = str.substring(i, i + 2);
			if (sub.equals("hi")) {
				count++;
			}
		}

		return count;
	}

	public String doubleChar(String str) {

		String result = "";
		int len = str.length();

		for (int i = 0; i < len; i++) {
			result += str.charAt(i);
			result += str.charAt(i);
		}

		return result;
	}

}
