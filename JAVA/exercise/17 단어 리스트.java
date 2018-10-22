package hw5_3;

import java.util.*;

class StringList{
	 
	private int count=0; //문자열 갯수
	private String strinfo; //문자열 저장
	
	public void insert(String[] arr, String str){ //삽입
		arr[count] = str;
		count++;
	}
	
	public void idx_insert(String[] arr, int idx, String str){ //인덱스로 삽입
		for(int i=count-1;i>=idx;i--){
			arr[i+1]=arr[i];
		}
		arr[idx] = str;
		count++;
	}
	
	public void delete(String[] arr, String str){ //삭제
		for(int i=0;i<count;i++){
			if(arr[i].equals(str)){
				for(int j=i;j<count;j++)
					arr[j] = arr[j+1];
				count--;
				i--;
			}
		}
	}
	
	public void idx_print(String[] arr, int idx){ //인덱스로 조회
		System.out.println("인덱스 "+idx+"의 원소: "+arr[idx]);
	}
	
	public int list_length(){ //리스트 길이 리턴
		return count;
	}
	
	public void strInfo(String[] arr){
		strinfo=arr[0];
		for(int i=1;i<count;i++){
			strinfo = strinfo.concat(arr[i]);
		}
	}
	
	public String toString(){ //문자열 리턴
		return strinfo;
	}
	
}


public class hw5_3 {

	public static void main(String[] args) {
		
		String[] arr = new String[99];
		int n; int idx;
		String temp;
		String str;
		
		StringList list = new StringList();
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("\n1 : 맨뒤삽입");
			System.out.println("2 : 인덱스로삽입");
			System.out.println("3 : 삭제");
			System.out.println("4 : 인덱스로조회");
			System.out.println("5 : 전체출력");
			System.out.println("6 : 종료");
			System.out.print("\n숫자를 입력하세요 : ");
			n = scan.nextInt();
			
			if(n>=1 && n<=5){
				
				if(n==1){
					System.out.print("\n삽입할 단어를 입력하세요: ");
					temp = scan.nextLine();
					str = scan.nextLine();
					list.insert(arr, str);
				}
				
				else if(n==2){
					while(true){
						System.out.print("\n인덱스를 입력하세요: ");
						idx = scan.nextInt();
						if(idx>=0 && idx<=list.list_length())
							break;
						else
							System.out.println("다시 입력하세요");
					}
					
					System.out.print("삽입할 단어를 입력하세요: ");
					temp = scan.nextLine();
					str = scan.nextLine();
					list.idx_insert(arr, idx, str);
				}
				
				else if(n==3){
					System.out.print("\n삭제할 단어를 입력하세요: ");
					temp = scan.nextLine();
					str = scan.nextLine();
					list.delete(arr, str);
				}
				
				else if(n==4){
					while(true){
						System.out.print("\n인덱스를 입력하세요: ");
						idx = scan.nextInt();
						if(idx>=0 && idx<=list.list_length()-1)
							break;
						else
							System.out.println("다시 입력하세요");
					}
					
					list.idx_print(arr, idx);
				}
				
				else{
					System.out.println("현재 리스트의 길이: "+list.list_length());
					list.strInfo(arr);
					System.out.println("내용: "+list.toString());
				}
			}
			else if(n==6){
				System.out.println("종료합니다");
				break;
			}
			else
				System.out.println("다시 입력하세요");
		}
		
	}

}
