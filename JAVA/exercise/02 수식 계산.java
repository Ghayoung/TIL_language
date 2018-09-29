package hw5_2;

import java.util.Scanner;

public class Expression {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		
		System.out.print("x입력:");
		x = input.nextInt();
		System.out.print("y입력:");
		y = input.nextInt();
		System.out.print("z입력:");
		z = input.nextInt();
		
		System.out.println(x!=0); //x는 0이 아니다
		System.out.println(x%2==0); //x는 짝수이다 
		System.out.println((y<=x)&&(z>=x)); //x는 y보다 크고 z보다 작다
		System.out.printf("%d \n", (x%y)); //x를 y로 나눈 나머지
		System.out.printf("%x \n", (x<<y)); //x를 y비트만큼 왼쪽으로 시프트
	}

}
