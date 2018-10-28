package hw7_2;

import java.util.*;

class IntegerStack{
	
	private int top = -1;
	private int[] array = new int[100];
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean isFull(){
		return (top == 99);
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
	
	public void printStack(){
		if(isEmpty())
			System.out.println("Array Stack is empty!!");
		else
			for(int i=0; i<=top; i++)
				System.out.print(array[i] + " ");
	}
	
}

class OptExp2{
	private StringTokenizer exp;
	
	public int evalPostfix(String postfix){
		IntegerStack S = new IntegerStack();
		exp = new StringTokenizer(postfix);
		int opr1, opr2, value;
		String testSt;
		while(exp.hasMoreTokens()){
			testSt = exp.nextToken();
			if(!testSt.equals("+") && !testSt.equals("-") && !testSt.equals("*") && !testSt.equals("/")){
				value = Integer.parseInt(testSt);
				S.push(value);
				S.printStack(); //내용 출력
				System.out.println();
			}
			
			else{
				opr2 = S.pop();
				opr1 = S.pop();
				if(testSt.equals("+"))
					S.push(opr1 + opr2);
				else if(testSt.equals("-"))
					S.push(opr1 - opr2);
				else if(testSt.equals("*"))
					S.push(opr1 * opr2);
				else
					S.push(opr1 / opr2);
				S.printStack(); //내용 출력
				System.out.println();
			}
		}
		return S.pop();
	}
}

public class hw7_2 {

	public static void main(String[] args) {);
		
		Scanner scan = new Scanner(System.in);
		String exp;
		System.out.print("정수 후위 수식 입력:");
		exp = scan.nextLine();
		
		
		//////////수식 형식 판별
		StringTokenizer st = new StringTokenizer(exp);
		String str; int num=0; int num2=0; int error=0;
		
		if(st.countTokens()<3){ //원소 2개 이하
			error++;
		}
		
		while(true){
			if(error!=0)
				break;
			str = st.nextToken();
			if(!str.equals("+") && !str.equals("-") && !str.equals("*") && !str.equals("/")){
				num++;
			}
			else{
				num2++;
				break;
			}
			if(num>2){ //피연산자가 연속으로 3개이상
				error++;
				break;
			}		
		}
		
		if(num==0) //수식이 연산자로 시작할 경우
			error++;
		
		if(num%2==1) //첫 번째 연산자 전의 피연산자가 홀수 개일 경우
			error++;
		
		num=0;
		while(st.hasMoreTokens()){
			str = st.nextToken();
			if(!str.equals("+") && !str.equals("-") && !str.equals("*") && !str.equals("/")){
				if(num2==num)
					num=0;
				num2=0;
				num++;
				if(num==3){ //피연산자가 연속으로 3개 이상
					error++;
					break;
				}
			}
			else{
				num2++;
				if(num2>num){ //앞서 피연산자 갯수보다 연산자가 많을 경우
					error++;
					break;
				}
			}
		}
		
		if(num2==0) //수식이 피연산자로 끝날 경우
			error++;
		if(num>num2) //연산자 갯수가 부족할 경우
			error++;
		
		////////수식 형식 판별 끝
		
		if(error!=0)
			System.out.println("잘못된 수식입니다.");
		
		else{
			OptExp2 opt = new OptExp2();
			int result;
			result = opt.evalPostfix(exp);
		
			System.out.println("계산 결과 = " + result);
		}
	}
}