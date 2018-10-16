package hw21_2;

import java.util.*;

class NegativeBalanceException extends Exception{
	
	public NegativeBalanceException(){}
}

class BankAccount{
	
	private int balance; //잔액
	
	public BankAccount(){ //생성자
		balance=0;
	}
	
	public void deposit(int b){ //입금
		
		balance+=b;
	}
	
	public void withdraw(int b) throws NegativeBalanceException{ //출금
		
		if(balance>=b)
			balance-=b;
		else
			throw new NegativeBalanceException();
			
	}
	
	public void getBalance(){ //잔액조회
		
		System.out.println("잔액: " + balance + "원");
		
	}
}
public class driver {

	public static void main(String[] args) {
		
		int n;
		int d; //입금액
		int w; //출금액
		int total_d=0; //입금총액
		int total_w=0; //출금총액
		BankAccount account = new BankAccount();
		
		outer_loop:
		while(true){
			
			System.out.println("1:입금 2:출금 3:잔액조회 4:종료");
			System.out.print("입력: ");
			Scanner scan = new Scanner(System.in);
			n=scan.nextInt();
			
			switch(n){
			
			case 1: //입금
				System.out.print("입금액을 입력하세요: ");
				d=scan.nextInt();
				account.deposit(d);
				total_d+=d;
				break;
			case 2: //출금
				System.out.print("출금액을 입력하세요: ");
				w=scan.nextInt();
				try{
				account.withdraw(w);
				}
				catch (NegativeBalanceException e)
				{
					System.out.println("실패: 출금액이 잔액보다 큽니다.");
					break;
				}
				total_w+=w;
				break;
			case 3: //잔액조회
				account.getBalance();
				break;
			case 4: //종료
				System.out.println("종료합니다.");
				break outer_loop;
			default:
				System.out.println("다시 입력하세요.");
			}
			
		}
		
		System.out.println();
		System.out.println("입금 총액: "+total_d+"원");
		System.out.println("출금 총액: "+total_w+"원");

	}

}
