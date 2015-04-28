package net.hb.day28;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		System.out.println("Two.java");
		 
		System.out.print("나이입력? ");
		int age=0;
		Scanner aa = new Scanner(System.in);
		age=aa.nextInt();
		
		
		System.out.println("나이=" + age);
		System.out.println("\n영수증출력 10:03");
		aa.close();//추천

	}//main end
}//class END
