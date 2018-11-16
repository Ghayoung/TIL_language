package hw10_0;

import java.util.Scanner;

class Node{
	int vertex;
	Node link;
}

class UndirectedGraph{
	
	private Node[] list;
	private int n = 0;
	
	public UndirectedGraph(int n){ //생성자
		list = new Node[n];
		this.n = n;
	}
	
	public void addEdge(int v1, int v2){
		if(v1<0 || v1>=n || v2<0 || v2>=n)
			System.out.println("그래프에 없는 정점입니다.");
		else{
			Node newNode = new Node();
			newNode.vertex = v2;
			newNode.link = list[v1];
			list[v1] = newNode;
			
			Node newNode2 = new Node();
			newNode2.vertex = v1;
			newNode2.link = list[v2];
			list[v2] = newNode2;
			
		}
	}
	
	public void printAdjacnetVertecies(int head){ //인접정보
		Node node = new Node();
		node = list[head];
		while(node != null){
			System.out.print(node.vertex+" ");
			node = node.link;
		}
	}
}

public class hw10_0 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n; //정점 수
		int v1; int v2; int head;
		int menu;
		
		System.out.print("정점 수 입력: ");
		n = scan.nextInt();
		UndirectedGraph UG = new UndirectedGraph(n);
		
		while(true){
			System.out.print("\n1:간선삽입 2:인접정보보기 3:종료 -->");
			menu = scan.nextInt();
			if(menu==1){
				System.out.print("삽입할 간선을 입력하세요(정점 번호2개):");
				v1 = scan.nextInt();
				v2 = scan.nextInt();
				UG.addEdge(v1,v2);
			}
			else if(menu==2){
				System.out.print("정점 번호를 입력하세요:");
				head = scan.nextInt();
				System.out.print(head+"에 인접한 정점 :");
				UG.printAdjacnetVertecies(head);
				System.out.println();
			}
			else{break;}
		}

	}

}
