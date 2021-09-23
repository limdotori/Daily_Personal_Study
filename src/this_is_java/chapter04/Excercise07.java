package this_is_java.chapter04;

import java.util.Scanner;

public class Excercise07 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		
		Scanner scan = new Scanner(System.in);
		while(run) {
			System.out.println("--------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("--------------------");
			System.out.print("선택>");
			int a = scan.nextInt();
			if(a==1) {
			System.out.print("예금액>");
			int aa=scan.nextInt();
			balance+=aa;
			System.out.println();
			}
			if(a==2) {
			System.out.print("출금액>");				
			int bb=scan.nextInt();
			balance-=bb;
			System.out.println();
			}
			if(a==3) {
			System.out.print("잔고>");								
			System.out.println(balance);
			System.out.println();
			}
			if(a==4) {
				System.out.println();	
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
