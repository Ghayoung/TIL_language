package hw20_0;

import java.util.*;

public class hw20_0 {

	public static void main(String[] args) {

		System.out.println(Math.PI*1.5*1.5);
		System.out.println(Math.pow(3, 10));
		System.out.println(Math.sqrt(8));
		System.out.println(Math.random());
		
		Scanner str = new Scanner(System.in);
		String ssn;
		
		System.out.println();
		
		System.out.println("주민등록번호 입력(-포함) :");
		ssn=str.nextLine();
		
		StringTokenizer st = new StringTokenizer(ssn,"-");
		String ssn1 = st.nextToken();
		String ssn2 = st.nextToken();
		
		System.out.println("앞자리 = "+ssn1);
		System.out.println("뒷자리 = "+ssn2);
		
		int i_ssn1 = Integer.parseInt(ssn1);
		int i_ssn2 = Integer.parseInt(ssn2);
		
		System.out.printf("합 = %d", i_ssn1+i_ssn2);
		
	}

}
