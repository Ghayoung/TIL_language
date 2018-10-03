package hw12_1;

abstract class Animal{
	
	String name; //이름
	
	public Animal(String n){ //Animal 생성자
		name=n;
	}
	
	public String getName(){ //이름 getter
		return name;
	}
	
	public abstract void sound();
	
	public abstract void newYear();
	
	public String toString(){ //정보 출력
		return name;
	}
}

class Dog extends Animal{

	private double speed; //속도
	
	public Dog(String n, double s){ //Dog 생성자
		super(n);
		setSpeed(s);
	}
	
	public double getSpeed(){
		return speed;
	}
	
	public void setSpeed(double s){
		if(s<0){
			System.out.println("error: 올바르지 않은 값");
			speed=0;
		}
		else
			speed=s;
	}
	
	public String toString(){ //정보 출력
		return name + " 시속" + speed + "km";
	}
	
	public void sound(){ //sound() 구현
		System.out.println("멍멍 " + name);
	}
	
	public void newYear(){ //newYear() 구현
		speed+=5;
	}
}

class Person extends Animal{
	
	private int age; //나이
	
	public Person(String n, int a){ //Person 생성자
		super(n);
		age=a;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int a){
		if(a<=0){
			System.out.println("error: 올바르지 않은 값");
			age=1;
		}
		else
			age=a;
	}
	
	public String toString(){ //정보 출력
		return name + " " + age + "세";
	}
	
	public void sound(){ //sound() 구현
		System.out.println("안녕 " + name);
	}
	
	public void newYear(){ //newYear() 구현
		age++;
	}
}

public class driver {

	public static void main(String[] args) {
		
		int i;
		
		Animal[] arr = new Animal[4];
		
		arr[0] = new Dog("진돌이", 13.5);
		arr[1] = new Dog("진순이", 12.5);
		arr[2] = new Person("홍길동", 20);
		arr[3] = new Person("박길동", 25);
	
		System.out.println();
		
		for(i=0; i<4; i++){
			System.out.println(arr[i].toString());
		}
		
		System.out.println();
		
		for(i=0; i<4; i++){
			arr[i].sound();
		}
		
		//+1년
		for(i=0; i<4; i++){
			arr[i].newYear();
		}
		
		System.out.println();
		System.out.println("------------1년 후-----------");
		
		for(i=0; i<4; i++){
			System.out.println(arr[i].toString());
		}
		
		//+1년
		for(i=0; i<4; i++){
			arr[i].newYear();
		}
		
		System.out.println();
		System.out.println("------------2년 후-----------");
		
		for(i=0; i<4; i++){
			System.out.println(arr[i].toString());
		}

	}

}
