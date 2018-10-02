import java.util.Scanner;

public class Dff{
	public static void main(String[] args){
		
		int n;
		int tnf;
		
		int[] theater = {1,2,3,4,5,6,7,8,9,10};
		int[] now = {0,0,0,0,0,0,0,0,0,0};
		
		Scanner input = new Scanner(System.in);
		
		while(true){
			System.out.print("좌석을 예약하시겠습니까?(1또는0):");
			tnf = input.nextInt();
			
			if(tnf==0)
				break;
			
			System.out.println("현재의 예약 상태는 다음과 같습니다.");
			
			for(int i:theater)
				System.out.print(i+" ");
			System.out.println();
			for(int i:now)
				System.out.print(i+" ");
			
			System.out.print("몇 번째 좌석을 예약하시겠습니까?:");
			n = input.nextInt();
			
			if(now[n-1]==1)
				System.out.println("이미 예약되었습니다.");
			else{
				now[n-1]=1;
				System.out.println("예약되었습니다.");
			}
		}
	}
}