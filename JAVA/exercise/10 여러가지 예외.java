package hw21_1;

import java.util.Scanner;

public class FriendListTest {
  public static void main(String[] args) {
  
	  Scanner scan = new Scanner(System.in);
	  FriendList friendList = new FriendList();
	  
	  System.out.print("번호 입력: ");
	  
	  try{
		  
	  int number = scan.nextInt();
	  String name = friendList.get(number);
	  System.out.println(number + "번에 등록된 친구는 " + name);
	  
	  } catch (java.lang.ArrayIndexOutOfBoundsException e){
		  System.out.println("입력한 번호가 범위를 벗어났습니다.");
		  
	  } catch (java.util.InputMismatchException e){
		  System.out.println("번호로 정수값을 입력해야 합니다.");
		  
	  }
	  
  }
}

class FriendList {
	
	private String[] list = {"kim", "park", "lee"};
	public String get(int number) {
	return list[number-1];
	
	}
}