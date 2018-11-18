package hw11_1;

import java.util.Scanner;

public class hw11_1 {

	public static void main(String[] args) {
		
		System.out.print("�ܾ� �� �Է�:");
		int n; String temp;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		temp = scan.nextLine();
		String[] arr = new String[n];
		
		System.out.println(n+"���� �ܾ� �Է� :");
		for(int i=0; i<n; i++){
			arr[i] = scan.nextLine();
		}
		
		insertionSort(arr, n);
		
		System.out.println("\n������ ��� :");
		for(int i=0; i<n; i++){
			System.out.println(arr[i]);
		}

	}
	
	public static void insertionSort(String a[], int size){
		int i, j;
		String temp;
		for(i=1; i<size; i++){
			temp = a[i];
			j = i;
			while((j>0) && (a[j-1].compareToIgnoreCase(temp)>0)){
				a[j] = a[j-1];
				j--;
			}
			a[j] = temp;
		}
	}

}