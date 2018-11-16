package hw10_0;

import java.util.Scanner;

class Node{
	int vertex;
	Node link;
}

class UndirectedGraph{
	
	private Node[] list;
	private int n = 0;
	
	public UndirectedGraph(int n){ //������
		list = new Node[n];
		this.n = n;
	}
	
	public void addEdge(int v1, int v2){
		if(v1<0 || v1>=n || v2<0 || v2>=n)
			System.out.println("�׷����� ���� �����Դϴ�.");
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
	
	public void printAdjacnetVertecies(int head){ //��������
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
		int n; //���� ��
		int v1; int v2; int head;
		int menu;
		
		System.out.print("���� �� �Է�: ");
		n = scan.nextInt();
		UndirectedGraph UG = new UndirectedGraph(n);
		
		while(true){
			System.out.print("\n1:�������� 2:������������ 3:���� -->");
			menu = scan.nextInt();
			if(menu==1){
				System.out.print("������ ������ �Է��ϼ���(���� ��ȣ2��):");
				v1 = scan.nextInt();
				v2 = scan.nextInt();
				UG.addEdge(v1,v2);
			}
			else if(menu==2){
				System.out.print("���� ��ȣ�� �Է��ϼ���:");
				head = scan.nextInt();
				System.out.print(head+"�� ������ ���� :");
				UG.printAdjacnetVertecies(head);
				System.out.println();
			}
			else{break;}
		}

	}

}
