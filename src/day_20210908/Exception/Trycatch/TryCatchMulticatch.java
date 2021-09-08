package day_20210908.Exception.Trycatch;

public class TryCatchMulticatch {
public static void main(String[] args) {
	
	//${string_prompt}
	try {
	String data1 = args[0];
	String data2 = args[1];
	
	//문자를 코드로 바꾸는 코딩이니까 외우면 좋다~
	int var1 = Integer.parseInt(data1);
	int var2 = Integer.parseInt(data2);
	System.out.println(var1 + var2);
	
	//또다른 에러발생시켜보자
	String str = null;
	str.charAt(0);
	
	 //여기에 exception 들어가면 실행매개값 2개 ~ 만 나오고 아래는 안나오겟지!
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("실행 매개값을 2개 띄어쓰기 형태로 전달하세요");
	}catch(NumberFormatException e) {
		System.out.println("실행 매개값을 반드시 숫자로 전달하세요");
	}catch(Exception e) { //모든 예외의 부모예외클래스!
		System.out.println("기타 예외입니다");
	} //여기 finally도 사용 가능
	
	//ctrl t누르면 모든예외 확인가능
}
}