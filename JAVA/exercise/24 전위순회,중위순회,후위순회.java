package hw9_0;

import java.util.*;

public class hw9_0 {
	
	public static void preorder(int i, int[] tree){
		if(tree[i-1] != 0){
			System.out.print(tree[i-1]+" ");
			preorder(2*(i),tree);
			preorder(2*(i)+1,tree);
		}
	}
	
	public static void inorder(int i, int[] tree){
		if(tree[i-1] != 0){
			inorder(2*(i),tree);
			System.out.print(tree[i-1]+" ");
			inorder(2*(i)+1,tree);
		}
	}
	
	public static void postorder(int i, int[] tree){
		if(tree[i-1] != 0){
			postorder(2*(i),tree);
			postorder(2*(i)+1,tree);
			System.out.print(tree[i-1]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] tree = new int[20];

		System.out.println("\n정수들 입력하세요.");
		
		for(int i=0; i<9; i++){
			tree[i] = scan.nextInt();
		}
		
		System.out.println("\n전위순회");
		preorder(1,tree);
		
		System.out.println("\n\n중위순회");
		inorder(1,tree);
		
		System.out.println("\n\n후위순회");
		postorder(1,tree);

	}
}