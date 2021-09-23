package p99codingbat.warmup01;

public class startHi {
	public boolean startHi(String str) {
		String start = str.substring(0,2);
		if(str.length()<2){
			return false;
		}
		if(str.length()>=2) {
			if(start.equals("hi")){
				return true;
			}else return false;
			
		}
			
		}
	
//	if (str.length() < 2) return false;
//	 String firstTwo = str.substring(0, 2);
//	 if (firstTwo.equals("hi")) {
//	    return true;
//	  } else {
//	    return false;
//	  }

}
