package hw12_0;

abstract class Animal{
	
	String name;
	
	public Animal(String n){
		name=n;
	}
	
	public String GetName(){
		return name;
	}
	
	public abstract void sound();
}

class Dog extends Animal{
	
	public Dog(String n){
		super(n);
	}

	public void sound() {
		System.out.println("멍멍 "+name);
	}
}

class Person extends Animal{
	
	public Person(String n){
		super(n);
	}
	
	public void sound() {
		System.out.println("안녕 "+name);
	}
}
public class driver {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("진돌이");
		Person person1 = new Person("홍길동");
		
		dog1.sound();
		person1.sound();
	}

}