package hw10_1;

import java.util.Scanner;

class QNode{
	int data;
	QNode link;
}

class Queue{
	QNode front;
	QNode rear;
	
	public Queue(){
		front = null;
		rear = null;
	}
	
	public boolean isEmpty(){
		return (front == null);
	}
	
	public void enQueue(int item){
		QNode node = new QNode();
		node.data = item;
		node.link = null;
		if(isEmpty()){
			front = node;
			rear = node;
		}
		else{
			rear.link = node;
			rear = node;
		}
	}
	
	public int deQueue(){
		if(isEmpty()){
			System.out.println("빈 큐입니다.");
			return 0;
		}
		else{
			int item = front.data;
			front = front.link;
			if(front == null)
				rear = null;
			return item;
		}
	}
}

class Node{ //그래프노드
	int vertex;
	Node link;
}

class UndirectedGraph{
	
	private Node[] list;
	private int n = 0;
	private boolean visited[];
	
	public UndirectedGraph(int n){ //생성자
		list = new Node[n];
		this.n = n;
		visited = new boolean[n];
	}
	
	public void addEdge(int v1, int v2){
		Node newNode = new Node();
		newNode.vertex = v2;
		newNode.link = list[v1];
		list[v1] = newNode;
			
		Node newNode2 = new Node();
		newNode2.vertex = v1;
		newNode2.link = list[v2];
		list[v2] = newNode2;
		
	}
	
	public void printAdjacnetVertecies(int head){ //인접정보
		Node node = new Node();
		node = list[head];
		while(node != null){
			System.out.print(node.vertex+" ");
			node = node.link;
		}
	}
	
	public void initialize(){ //visited 초기화
		for(int i=0; i<n; i++)
			visited[i] = false;
	}
	
	public void depthFirstSearch(int v){ //깊이우선탐색
		Node w = new Node();
		visited[v]=true;
		System.out.print(v+" ");
		w = list[v];
		while(w != null){
			if(visited[w.vertex]==false){
				depthFirstSearch(w.vertex);
			}
			else{ w = w.link; }
		}
		
	}
	
	public void BreadthFirstSearch(int v){ //너비우선탐색
		Node w = new Node();
		Queue q = new Queue();
		visited[v] = true;
		System.out.print(v+" ");
		q.enQueue(v);
		
		while(!q.isEmpty()){
			v = q.deQueue();
			for(w=list[v]; w!=null; w=w.link){
				if(visited[w.vertex] == false){
					visited[w.vertex] = true;
					System.out.print(w.vertex+" ");
					q.enQueue(w.vertex);
				}
			}
		}
	}
	
	public boolean search(int v1, int v2){ //중복검사
		Node node = new Node();
		node = list[v1];
		while(node != null){
			if(node.vertex == v2){
				return true;
			}
			node = node.link;
		}
		return false;
	}
	
}

public class hw10_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n; //정점 수
		int v1; int v2; int head;
		int menu;
		
		System.out.print("정점 수 입력: ");
		n = scan.nextInt();
		UndirectedGraph UG = new UndirectedGraph(n);
		
		while(true){
			System.out.print("\n1:간선삽입 2:인접정보보기 3:깊이우선탐색 4:너비우선탐색 5:종료 -->");
			menu = scan.nextInt();
			if(menu==1){
				while(true){
					System.out.print("삽입할 간선을 입력하세요(정점 번호2개):");
					v1 = scan.nextInt();
					v2 = scan.nextInt();
					if(v1<0 || v1>=n || v2<0 || v2>=n){
						System.out.println("그래프에 없는 정점입니다.");
						System.out.println("다시 입력하세요.");
					}
					else{break;}
				}
				if(UG.search(v1,v2))
					System.out.println("이미 있는 간선입니다.");
				    //모든 간선이 입력된 상태라 빠져나갈 수 없는 경우를 방지해 반복하지 않음
				else
					UG.addEdge(v1,v2);
			}
			else if(menu==2){
				while(true){
					System.out.print("정점 번호를 입력하세요:");
					head = scan.nextInt();
					if(head<0 || head>=n){
						System.out.println("그래프에 없는 정점입니다.");
						System.out.println("다시 입력하세요.");
					}
					else{break;}
				}
				System.out.print(head+"에 인접한 정점 :");
				UG.printAdjacnetVertecies(head);
				System.out.println();
			}
			else if(menu==3){
				System.out.print("깊이우선탐색 :");
				UG.initialize();
				UG.depthFirstSearch(0);
				System.out.println();
			}
			else if(menu==4){
				System.out.print("너비우선탐색 :");
				UG.initialize();
				UG.BreadthFirstSearch(0);
				System.out.println();
			}
			else if(menu==5){break;}
			else{System.out.println("1~5 사이의 숫자를 입력하세요.");}
		}

	}

}
