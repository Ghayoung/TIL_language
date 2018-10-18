package hw22_1;

import java.util.*;

class Car implements Comparable<Car>{
	
	private int speed;
	
	public Car(int s){
		speed=s;
	}
	
	public String toString(){
		return speed+"";
	}
	
	public int compareTo(Car c){
		return speed - c.speed;
	}
}

public class hw22_1 {

	public static void main(String[] args) {
		
		ArrayList<Car> list = new ArrayList<Car>();
		
		list.add(0, new Car(100));
		list.add(1, new Car(80));
		list.add(2, new Car(70));
		list.add(3, new Car(40));
		list.add(4, new Car(10));
		
		System.out.println("초기 리스트:");
		System.out.println(list+"\n");
		
		int n;
		Scanner scan = new Scanner(System.in);
		
		
		while(true){
			System.out.println("어느 위치에 삽입합니까?");
			System.out.print("인덱스 번호(0~5)를 입력하세요:");
			n = scan.nextInt();
			
			if(n>=0 && n<=5)
				break;
			else
				System.out.println("0에서 5까지의 숫자를 입력하세요\n");
			}
			
			list.add(n, new Car(80));
			System.out.println(list+"\n");
		
			
		while(true){
			System.out.println("어느 자동차의 정보를 출력합니까?");
			System.out.print("인덱스 번호(0~5)를 입력하세요:");
			n = scan.nextInt();
			
			if(n>=0 && n<=5)
				break;
			else
				System.out.println("0에서 5까지의 숫자를 입력하세요\n");
			}
		
		System.out.println("속도: "+list.get(n));
		
		
		System.out.println("\n랜덤하게 섞은 결과:");
		Collections.shuffle(list);
		System.out.println(list);
		
		System.out.println("\n속도 순으로 정렬한 결과:");
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
	}

}
