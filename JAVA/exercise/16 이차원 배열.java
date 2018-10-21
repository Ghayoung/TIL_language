package hw3_4;

import java.util.Scanner;

public class hw3_4 {

	public static void main(String[] args) {
		
		int[][] arr = {{36,37,35,38},
					   {42,40,41},
				       {30,28,29,31,32}};
		
		Scanner scan = new Scanner(System.in);
		
		int grade;
		while(true){
			
			System.out.print("학년을 입력하세요(1~3):");
			grade = scan.nextInt();
			
			if(grade<1||grade>3)
				System.out.println("잘못된 입력입니다");
			else
				break;
		}
		
		int sum=0;
		
		for(int i=0;i<arr[grade-1].length;i++){
			
			sum += arr[grade-1][i];
		}
		
		int sum2=0;
		
		for(int j=0;j<3;j++){
			for(int k=0;k<arr[j].length;k++){
				sum2 += arr[j][k];
			}
		}
		
		System.out.println(grade+"학년 학생 수는 "+sum);
		System.out.println("전교 학생 수는 "+sum2);

	}

}
