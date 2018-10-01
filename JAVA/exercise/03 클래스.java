package hw8_1;

class Circle {
	private double rad; //반지름
	private double x; //x좌표
	private double y; //y좌표
	
	public double getRad() {	//반지름 getter
		return rad;
	}
	
	public void setRad(double r) {	//반지름 setter
		if(r<=0)
			rad = 1.0;
		else
			rad = r;
	}
	
	public double getX() {	//x getter
		return x;
	}
	
	public void setX(double xpoint) {	//x setter
		x = xpoint;
	}
	
	public double getY() {	//y getter
		return y;
	}
	
	public void setY(double ypoint) {	//y setter
		y = ypoint;
	}
	
	public double area() {
		return rad*rad*3.14;
	}
	
	public void move(double xmove, double ymove) {
		x += xmove;
		y += ymove;
	}
}
public class CircleTest {

	public static void main(String[] args) {
		
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		
		circle1.setRad(1.2);
		circle1.setX(3);
		circle1.setY(4);
		
		circle2.setRad(-1.2);
		circle2.setX(-3);
		circle2.setY(-4);
		
		circle1.move(10, 20);
		circle2.move(10, 20);
		
		System.out.println("circle1의 좌표: ("+circle1.getX()+" ,"+circle1.getY()+") 반지름: "+circle1.area());
		System.out.println("circle2의 좌표: ("+circle2.getX()+" ,"+circle2.getY()+") 반지름: "+circle2.area());
	}
}
