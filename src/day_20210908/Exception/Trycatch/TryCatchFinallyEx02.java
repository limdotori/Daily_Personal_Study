package day_20210908.Exception.Trycatch;

public class TryCatchFinallyEx02 {
	public static void main(String[] args) {
		
		String[] arr = {"홍길동","홍길자","이순신"};
		int i = 0;
		while(i <4) {
			try {
				System.out.println(arr[i]);
				
			} catch (Exception e) {
				System.out.println("배열의 참조범위를 벗어났습니다");
			}finally {
				System.out.println("예외여부와 상관없이 무조건 실행");
			}
			i++;
		}
	}
}