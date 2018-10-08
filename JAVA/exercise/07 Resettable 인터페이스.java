package hw12_2;

interface Resettable {
	public void reset();
}

class BankAccount implements Resettable{
	
	private int balance; //잔액
	private int i_balance; //initial balance
	
	public BankAccount(int b){
		setBalance(b);
	}
	
	public int getBalance(){
		return balance;
	}
	
	public void setBalance(int b){
		if(b<0){
			System.out.println("error: 올바르지 않은 값");
			b=0;
		}
		else{
			balance = b;
			i_balance = b;
		}
	}
	
	public void deposit(int sum){ //입금
		balance += sum;
	}
	
	public void withdraw(int sum){ //출금
		if(sum>balance)
			System.out.println("error: 잔액이 부족합니다.");
		else
			balance -= sum;
	}
	
	public String toString(){
		return "잔액: " + balance;
	}
	
	public void reset() { //reset 구현
		balance = i_balance;
	}
	
}

class Point implements Resettable{
	
	private double x;
	private double y;
	private double i_x; //initial x
	private double i_y; //initial y
	
	public Point(double xpoint, double ypoint){
		x = xpoint;
		y = ypoint;
		i_x = xpoint;
		i_y = ypoint;
	}
	
	public double getX(){
		return x;
	}
	
	public void setX(double xpoint){
		x = xpoint;
	}
	
	public double getY(){
		return y;
	}
	
	public void setY(double ypoint){
		y = ypoint;
	}
	
	public void move(double xmove, double ymove){
		x += xmove;
		y += ymove;
	}
	
	public String toString(){
		return "(" + x + ", " + y + ")";
	}
	
	public void reset() { //reset 구현
		x = i_x;
		y = i_y;
	}
}


public class driver {

	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount(1000);
		
		account1.deposit(500); //입금
		account1.withdraw(200); //출금
		
		System.out.println(account1.toString());
		
		account1.reset(); //은행계좌 리셋
		
		System.out.println(account1.toString());
		
		System.out.println();
		Point point1 = new Point(1.5, 2.5);
		
		point1.move(2.1, 2.1);
		point1.move(10.0, 10.0);
		
		System.out.println(point1.toString());
		
		point1.reset(); //포인트 리셋
		
		System.out.println(point1.toString());

	}

}
