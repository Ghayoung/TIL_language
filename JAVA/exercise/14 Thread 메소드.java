package hw23_1;

import java.util.Random;

public class hw23_1 {
	
	static void print(String message){
		String threadName = Thread.currentThread().getName();
		System.out.format("%s: %s%n",threadName,message);
	}
	
	private static class Thread_0 implements Runnable{
		
		public void run(){
			Random r = new Random();
			String messages[] = {"apple","basket","candy","dog"};
			
			try{
				for(int i=0;i<messages.length;i++){
					print(messages[i]);
					Thread.sleep(r.nextInt(1000)+1);
				}
			}catch (InterruptedException e){
				print("아직 끝나지 않았는데 인터럽트 받았어요.");
			}
		}
	}
	
	private static class Thread_1 implements Runnable{
		
		public void run(){
			Random r = new Random();
			String messages[] = {"사과","바구니","사탕","개"};
			
			try{
				for(int i=0;i<messages.length;i++){
					print(messages[i]);
					Thread.sleep(r.nextInt(1000)+1);
				}
			}catch (InterruptedException e){
				print("아직 끝나지 않았는데 인터럽트 받았어요.");
			}
		}
	}

	public static void main(String[] args) throws InterruptedException{
		
		print("메인 스레드 시작합니다");
		
		Thread t0 = new Thread(new Thread_0()); //스레드1 생성
		Thread t1 = new Thread(new Thread_1()); //스레드2 생성
		
		print("추가 스레드 2개를 시작합니다");
		
		t0.start(); //스레드1 시작
		t1.start(); //스레드2 시작
		
		Random r = new Random();
		String messages[] = {"1000","2000","3000","4000"};
		
		for(int i=0;i<messages.length;i++){
			print(messages[i]);
			Thread.sleep(r.nextInt(1000)+1);
		}
	
		t0.interrupt(); //스레드1 중단
		t1.interrupt(); //스레드2 중단
		t0.join();
		t1.join();
		
		print("메인 스레드 종료!프로그램을 종료합니다.");

	}

}
