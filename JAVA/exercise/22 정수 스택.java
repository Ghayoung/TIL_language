package hw7_1;

class IntegerStack{
	
	private int top = -1;
	private int[] array = new int[5];
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean isFull(){
		return (top == 4);
	}
	
	public void push(int item){
		if(isFull()){
			System.out.println("Inserting fail! Array Stack is full!!");
		}
		else{
			array[++top] = item;
		}
	}
	
	public int pop(){
		if(isEmpty()){
			System.out.println("Deleting fail! Array Stack is empty!!");
			return 0;
		}
		else{
			return array[top--];
		}
	}
	
}

public class hw7_1 {

	public static void main(String[] args) {
		
		IntegerStack S = new IntegerStack();
		
		S.push(-1);
		S.push(0);
		S.push(1);
		S.push(2);
		S.push(3);
		S.push(4);
		
		while(!S.isEmpty())
			System.out.print(S.pop()+" ");
		
		System.out.println();
		S.push(10);
		S.push(30);
		S.push(50);
		System.out.println(S.pop());
		S.push(70);
		
		int sum=0;
		
		while(!S.isEmpty())
			sum += S.pop();
		
		System.out.println(sum);
		
	}

}
