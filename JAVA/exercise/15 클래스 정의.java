package hw3_3;

class Point{
	
	private double x;
	private double y;
	
	public Point(double x, double y){ //생성자
		
		this.x=x;
		this.y=y;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public void move(double x, double y){ //좌표 이동
		
		this.x += x;
		this.y += y;
	}
	
	public boolean equals(Object obj){ //비교
		
		if(x==((Point)obj).x && y==((Point)obj).y)
			return true;
		else
			return false;
	}
}


public class hw3_3 {

	public static void main(String[] args) {
		
		Point p1 = new Point(3.5, 2.1);
		Point p2 = new Point(3.5, 2.1);
		Point p3 = new Point(-3.5, 2.1);
		
		boolean b1 = p1.equals(p2);
		if(b1==true){
			System.out.println("첫번째 점과 두번째 점은 동일합니다");
		}
		else{
			System.out.println("첫번째 점과 두번째 점은 다릅니다");
		}
		
		boolean b2 = p1.equals(p3);
		if(b2==true){
			System.out.println("첫번째 점과 세번째 점은 동일합니다");
		}
		else{
			System.out.println("첫번째 점과 세번째 점은 다릅니다");
		}
		
		p1.move(1, 1);
		p2.move(1, 1);
		p3.move(1, 1);
		
		System.out.printf("첫번째: (%f, %f)", p1.getX(), p1.getY());
		System.out.printf("\n두번째: (%f, %f)", p2.getX(), p2.getY());
		System.out.printf("\n세번째: (%f, %f)", p3.getX(), p3.getY());

	}

}
