package p99codingbat.warmup01;

public class posNeg {
	public boolean posNeg(int a, int b, boolean negative) {
		  if(((a>0&&b<0)||(a<0&&b>0))&&(negative==false)){
		    return true;
		  }else if((negative==true)&&(a<0&&b<0)){
		    return true;
		  }else return false;
		}

public static void main(String[] args) {
	boolean a;
	System.out.println(a);
}
}
