package p99codingbat;

public class String1 {
	public boolean hasBad(String str) {
		  
		  return java.util.regex.Pattern.matches(".?bad.*", str);
		  /*
		  String f1 = "";
		  if (str.length() >= 3) {
		    f1 = str.substring(0, 3);  
		  }
		  
		  
		  String f2 = "";
		  if (str.length() >= 4) {
		    f2 = str.substring(1, 4);  
		  }
		  
		  return f1.equals("bad") || f2.equals("bad");
		  */
	}
	
	public boolean endsLy(String str) {
		  
		  return java.util.regex.Pattern.matches(".*ly", str);
		  
		  /*
		  if (str.length() >= 2) {
		    String end = str.substring(str.length() - 2);
		    return end.equals("ly");
		  }
		  
		  return false;
		  */
	}

}
