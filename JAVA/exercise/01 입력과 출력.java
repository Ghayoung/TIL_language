package hw5_1;

import java.util.Scanner;

public class BirthDate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int RRN1; //주민번호 앞자리
		int RRN2;  //주민번호 뒷자리
		
		int Year; //연도
		int Month; //월
		int Date; //일
		
		System.out.println("hw5_1: 홍길동");
		
		System.out.print("주민등록번호 앞자리 입력:");
		RRN1=input.nextInt();
		
		System.out.print("주민등록번호 뒷자리 입력:");
		RRN2=input.nextInt();
		
		Year=RRN1/10000;
		Year=RRN2/1000000==1||RRN2/1000000==2?Year+1900:Year+2000;
		
		Month=(RRN1%10000)/100;
		Date=(RRN1%10000)%100;
		
		System.out.println("생년월일은 다음과 같습니다.");
		System.out.println(Year);
		System.out.println(Month);
		System.out.println(Date);

	}
	}
