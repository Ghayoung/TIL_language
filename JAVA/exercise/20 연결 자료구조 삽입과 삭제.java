package hw6_1;

import java.util.*;

class IntegerLinkedList{
	
	private ListNode head;
	
	public IntegerLinkedList () {
		head = null;
	}
	
	public void insertMiddleNode(ListNode pre, int data){ //삽입
		ListNode newNode = new ListNode(data);
		newNode.link = pre.link;
		pre.link = newNode;
	}
	
	public void insertLastNode(int data){ //맨뒤 삽입
		ListNode newNode = new ListNode(data);
		
		if(head==null){
			this.head = newNode;
		}
		else{
			ListNode temp = head;
			
			while(temp.link != null){
				temp = temp.link;
			}
			temp.link = newNode;
		}
	}
	
	public void deleteNode(int data){ //값 삭제
		ListNode pre, temp;
		pre = head;
		temp = head.link;
		
		if(head.getData() == data)
			head = head.link;
		
		while(temp != null){
			if(data == temp.getData()){
				pre.link = temp.link;
				break;
			}
			else{
				pre = temp;
				temp = temp.link;
			}
		}
	}
	
	public ListNode searchNode(int data){ //값 검색
		ListNode temp = this.head;
		while(temp != null){
			if(data == temp.getData())
				return temp;
			else temp = temp.link;
		}
		return temp;
	}
	
	public void printList(){ //리스트 출력
		System.out.print("내용 = ");
		ListNode temp = this.head;
		while(temp != null){
			System.out.print(temp.getData()+" ");
			temp = temp.link;
		}
	}
}

class ListNode{
	
	private int data;
	public ListNode link;
	
	public ListNode(){
		this.data = 0;
		this.link = null;
	}
	
	public ListNode(int data){
		this.data = data;
		this.link = null;
	}
	
	public ListNode(int data, ListNode link){
		this.data = data;
		this.link = link;
	}
	
	public int getData(){
		return this.data;
	}
	
	
}
public class hw6_1 {

	public static void main(String[] args) {
	
		IntegerLinkedList L = new IntegerLinkedList();
		Scanner scan = new Scanner(System.in);
		int len=0;
		int nod;
		int num;
		
		for(int i=0; i<10; i++){
			L.insertLastNode(i*11);
			len++;
		}
		
		System.out.println("\n초기 리스트");
		System.out.println("길이 = "+len);
		L.printList();
		
		System.out.println("\n\n새로운 값을 삽입합니다.");
		System.out.print("삽입할 위치(선행 노드의 값) 입력: ");
		nod=scan.nextInt();
		System.out.print("삽입할 정수값 입력: ");
		num=scan.nextInt();
		
		ListNode pre = L.searchNode(nod);
		if(pre == null)
			System.out.println("잘못된 위치입니다.");
		else{
			L.insertMiddleNode(pre, num);
			len++;
			System.out.println("\n삽입 후 리스트");
			System.out.println("길이 = "+len);
			L.printList();
		}
		
		System.out.print("\n삭제할 값 입력: ");
		num=scan.nextInt();
		
		pre = L.searchNode(num);
		if(pre == null)
			System.out.println("잘못된 값입니다.");
		else{
			L.deleteNode(num);
			len--;
			System.out.println("\n삭제 후 리스트");
			System.out.println("길이 = "+len);
			L.printList();
		}
		
	}

}
