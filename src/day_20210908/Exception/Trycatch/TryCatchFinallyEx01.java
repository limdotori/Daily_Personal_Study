package day_20210908.Exception.Trycatch;

public class TryCatchFinallyEx01{
public static void main(String[] args) {
	//finally
	String[] arr = {"홍길동","홍길자","이순신"};
	
	try {
		System.out.println(arr[4]);	}
	catch (Exception e) {
		System.out.println("배열의 범위를 벗어났습니다");}
	finally {System.out.println("예외 여부와 관계없이 무조건 실행되는 부분");}
	
}
}
