package hw9_1;

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
	
}
public class hw9_1 {

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
				System.out.println("구현되지 않은 기능입니다.");
			}
			else
				break;
		}

	}

}