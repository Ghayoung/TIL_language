package hw20_1;

public class hw20_1 {

	public static void main(String[] args) {
		
		char i;
		int j;
		int k=0;
		
		String temp = new String();
		String str = new String();
		StringBuffer sb = new StringBuffer();
		
		long t1;
		long t2;
		long time;
		
		t1=System.nanoTime(); //반복문 시작
		for(i='a';i<='z';i++){
			
			k++;
			
			for(j=0;j<k;j++){
				
				temp = Character.toString(i);
				str = str.concat(temp);
			}
		}
		t2=System.nanoTime(); //반복문 끝
		time=t2-t1; //걸린 시간
		
		System.out.println(str);
		System.out.println("String 걸린시간: "+time);
		
		k=0;
		
		t1=System.nanoTime(); //반복문 시작
		for(i='a';i<='z';i++){
			
			k++;
			
			for(j=0;j<k;j++){
				
				sb.append(i);
			}
		}
		t2=System.nanoTime(); //반복문 끝
		time=t2-t1; //걸린 시간
		
		System.out.println(sb);
		System.out.println("StringBuffer 걸린시간: "+time);

	}

}
