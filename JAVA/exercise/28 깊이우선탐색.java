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
			System.out.println("�� ť�Դϴ�.");
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

class Node{ //�׷������
	int vertex;
	Node link;
}

class UndirectedGraph{
	
	private Node[] list;
	private int n = 0;
	private boolean visited[];
	
	public UndirectedGraph(int n){ //������
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
	
	public void printAdjacnetVertecies(int head){ //��������
		Node node = new Node();
		node = list[head];
		while(node != null){
			System.out.print(node.vertex+" ");
			node = node.link;
		}
	}
	
	public void initialize(){ //visited �ʱ�ȭ
		for(int i=0; i<n; i++)
			visited[i] = false;
	}
	
	public void depthFirstSearch(int v){ //���̿켱Ž��
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
	
	public void BreadthFirstSearch(int v){ //�ʺ�켱Ž��
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
	
	public boolean search(int v1, int v2){ //�ߺ��˻�
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
		int n; //���� ��
		int v1; int v2; int head;
		int menu;
		
		System.out.print("���� �� �Է�: ");
		n = scan.nextInt();
		UndirectedGraph UG = new UndirectedGraph(n);
		
		while(true){
			System.out.print("\n1:�������� 2:������������ 3:���̿켱Ž�� 4:�ʺ�켱Ž�� 5:���� -->");
			menu = scan.nextInt();
			if(menu==1){
				while(true){
					System.out.print("������ ������ �Է��ϼ���(���� ��ȣ2��):");
					v1 = scan.nextInt();
					v2 = scan.nextInt();
					if(v1<0 || v1>=n || v2<0 || v2>=n){
						System.out.println("�׷����� ���� �����Դϴ�.");
						System.out.println("�ٽ� �Է��ϼ���.");
					}
					else{break;}
				}
				if(UG.search(v1,v2))
					System.out.println("�̹� �ִ� �����Դϴ�.");
				    //��� ������ �Էµ� ���¶� �������� �� ���� ��츦 ������ �ݺ����� ����
				else
					UG.addEdge(v1,v2);
			}
			else if(menu==2){
				while(true){
					System.out.print("���� ��ȣ�� �Է��ϼ���:");
					head = scan.nextInt();
					if(head<0 || head>=n){
						System.out.println("�׷����� ���� �����Դϴ�.");
						System.out.println("�ٽ� �Է��ϼ���.");
					}
					else{break;}
				}
				System.out.print(head+"�� ������ ���� :");
				UG.printAdjacnetVertecies(head);
				System.out.println();
			}
			else if(menu==3){
				System.out.print("���̿켱Ž�� :");
				UG.initialize();
				UG.depthFirstSearch(0);
				System.out.println();
			}
			else if(menu==4){
				System.out.print("�ʺ�켱Ž�� :");
				UG.initialize();
				UG.BreadthFirstSearch(0);
				System.out.println();
			}
			else if(menu==5){break;}
			else{System.out.println("1~5 ������ ���ڸ� �Է��ϼ���.");}
		}

	}

}
