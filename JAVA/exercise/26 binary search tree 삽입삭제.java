package hw9_2;

import java.util.Scanner;

class TreeNode{
	private int data; //키
	private int freq; //빈도
	private TreeNode left;
	private TreeNode right;
	
	public int getData(){return data;}
	public int getFreq(){return freq;}
	public TreeNode getLeft(){return left;}
	public TreeNode getRight(){return right;}
	
	public void setData(int i){data = i;}
	public void setFreq(int i){freq = i;}
	public void setLeft(TreeNode t){left = t;}
	public void setRight(TreeNode t){right = t;}
	
	public void addFreq(){freq++;} //빈도 증가메소드
}

class BinarySearchTree{
	
	TreeNode root;
	
	public void inorder(TreeNode root){ //중위순회
		if(root != null){
			inorder(root.getLeft());
			System.out.print("<"+root.getData()+", "+root.getFreq()+">");
			inorder(root.getRight());
		}
	}
	
	public int searchBST(int x){ //노드검색
		TreeNode p = root;
		while(p != null){
			if(x < p.getData()) p = p.getLeft();
			else if (x > p.getData()) p = p.getRight();
			else return p.getFreq();
		}
		return 0;
	}
	
	public TreeNode insertKey(TreeNode root, int x){ //노드삽입
		TreeNode p = root;
		TreeNode newNode = new TreeNode();
		newNode.setData(x);
		newNode.setLeft(null);
		newNode.setRight(null);
		newNode.setFreq(1);
		if(p == null)
			return newNode;
		else if(newNode.getData() < p.getData()){
			p.setLeft(insertKey(p.getLeft(), x));
			return p;
		}
		else if(newNode.getData() > p.getData()){
			p.setRight(insertKey(p.getRight(), x));
			return p;
		}
		else return p;
	}
	
	public void insertBST(int x){
		TreeNode p = root;
		while(p != null){
			if(x < p.getData()) p = p.getLeft();
			else if (x > p.getData()) p = p.getRight();
			else{p.addFreq(); return;}
		}
		root = insertKey(root, x);
	}
	
	public void deleteKey(TreeNode p, TreeNode parent, int x){ //노드삭제
		
		if(p.getLeft() == null && p.getRight() == null){ //단말 노드
			if(parent == null){ //루트 노드일 경우
				root = null;
				return;
			}
			if(parent.getLeft() == p) parent.setLeft(null);
			else parent.setRight(null);
		}
		
		else if(p.getLeft() == null || p.getRight() == null){ //자식노드가 하나
			if(p.getLeft() != null){ //자식노드가 왼쪽
				if(parent == null){ //루트 노드일 경우
					root = p.getLeft();
					return;
				}
				if(parent.getLeft() == p){ parent.setLeft(p.getLeft());}
				else{ parent.setRight(p.getLeft());}
			}
			else{ //자식노드가 오른쪽
				if(parent == null){ //루트 노드일 경우
					root = p.getRight();
					return;
				}
				if(parent.getLeft() == p){ parent.setLeft(p.getRight());}
				else{ parent.setRight(p.getRight());}
			}
		}
		
		else{ //자식노드가 둘
			TreeNode q = p.getLeft();
			while(q.getRight() != null){ //q=왼쪽 서브드리에서 가장 큰 키 값
				q = q.getRight();
			}
			deleteBST(q.getData());
			p.setData(q.getData());
			p.setFreq(q.getFreq());
		}
	}
	
	public void deleteBST(int x){
		TreeNode p = root;
		TreeNode parent;
		
		if(p.getData() == x){ //삭제노드=루트노드
			deleteKey(p,null,x);
			return;
		}
		
		while(p != null){
			parent = p;
			if(x < parent.getData()){
				p = parent.getLeft();
				if(p==null){ System.out.println("존재하지 않는 노드입니다"); break; }
				if(p.getData() == x){
					deleteKey(p,parent,x);
					return;
				}
				else{}
			}
			else{
				p = parent.getRight();
				if(p==null){ System.out.println("존재하지 않는 노드입니다"); break; }
				if(p.getData() == x){
					deleteKey(p,parent,x);
					return;
				}
			}
		}
	}
}

public class hw9_2 {

	public static void main(String[] args) {
		
		BinarySearchTree bsT = new BinarySearchTree();
		Scanner scan = new Scanner(System.in);
		int num;
		int data;
		
		while(true){
			System.out.print("\n1:삽입 2:검색 3:중위순회 4:삭제 5:종료 -->");
			num = scan.nextInt();
			
			if(num==1){
				System.out.print("삽입할 키값 입력: ");
				data = scan.nextInt();
				bsT.insertBST(data);
			}
			else if(num==2){
				System.out.print("검색 키값 입력: ");
				data = scan.nextInt();
				System.out.println("빈도 = "+bsT.searchBST(data));
			}
			else if(num==3){
				System.out.print("중위순회결과 =");
				bsT.inorder(bsT.root);
				System.out.println();
			}
			else if(num==4){
				System.out.print("삭제할 키값 입력: ");
				data = scan.nextInt();
				bsT.deleteBST(data);
			}
			else
				break;
		}

	}
	
}