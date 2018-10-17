package hw22_0;

class Couple<X,Y>{
	
	private X x;
	private Y y;
	
	public Couple(X x, Y y){
		this.x=x;
		this.y=y;
	}
	
	public X getX(){return x;}
	public Y getY(){return y;}
	
	public void setX(X x){
		this.x=x;
	}
	public void setY(Y y){
		this.y=y;
	}
	public String toString(){
		return "Couple "+"[x="+x+", y="+y+"]";
	}
	
}
public class driver {

	public static void main(String[] args) {
		
		Couple<String,String> couple1 = new Couple("kim","park");
		System.out.println(couple1);
		
		couple1.setX("lee");
		System.out.println(couple1);
		
		System.out.println(couple1.getY()+"\n");
		
		Couple<Double,Double> couple2 = new Couple(1.5,3.5);
		System.out.println(couple2);
		
		couple2.setY(100.5);
		System.out.println(couple2);
		
		System.out.println(couple2.getX());

	}

}
