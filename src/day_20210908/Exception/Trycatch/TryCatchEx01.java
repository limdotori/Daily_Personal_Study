package day_20210908.Exception.Trycatch;

public class TryCatchEx01 {
public static void main(String[] args) {
	int i =10;
	int j=0;

	System.out.println(i+j);
	try{
		System.out.println(i/j);
		System.out.println("이 텍스트는 출력되지 않습니다");
	}
	//예외 발생시에 해당 예외를 처리할 수 있는 예외의 클래스 타입이
	//Catch뒤에 선언됩니다. Exception은 모든 예외의 처리가 가능합니다. (포괄적)
	catch(Exception e){System.out.println("0으로 나눌 수 없습니다");}
	System.out.println(i*j);
}
}
