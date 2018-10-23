package idx;

public class idx {

	public static void main(String[] args) {
		
		OperatePoly optPoly = new OperatePoly();
		
		double A1[][] = new double[][]{{3,9},{2,3},{1,5},{0,0}};
		double B1[][] = new double[][]{{4,8},{3,1},{2,-3},{1,2.5},{0,1.8}};
		System.out.print("C1: ");
		optPoly.addPoly(A1, B1);
		
		double A2[][] = new double[][]{{4,3},{3,4},{2,5},{1,6},{0,7}};
		double B2[][] = new double[][]{{4,-3},{3,-4},{2,4},{1,6},{0,0}};
		System.out.print("\nC2: ");
		optPoly.addPoly(A2, B2);
		
		double A3[][] = new double[][]{{6,7},{5,-6},{4,5},{3,4},{2,3},{1,1.5},{0,2.5}};
		double B3[][] = new double[][]{{6,6},{5,3},{4,2},{3,1},{2,0},{1,7},{0,8}};
		System.out.print("\nC3: ");
		optPoly.addPoly(A3,B3);

	}

}

class OperatePoly{
	
	public void addPoly(double[][] A, double[][] B){
		
		int degree_C;
		int degree_A=(int)A[0][0];
		int degree_B=(int)B[0][0];

		int expo_A=degree_A;
		int expo_B=degree_B;
		
		if(degree_A>=degree_B)
			degree_C=degree_A;
		else
			degree_C=degree_B;
		
		double C[][] = new double[degree_C+1][2];
		
		for(int i=0;i<=degree_C;i++){
			C[i][0] = degree_C-i;
		}
		
		
		while(expo_A>=0 && expo_B>=0){
			
			if(expo_A>expo_B){
				C[degree_C-expo_A][1]=A[degree_A-expo_A][1];
				expo_A--;
			}
			else if(expo_A==expo_B){
				C[degree_C-expo_A][1]=A[degree_A-expo_A][1]+B[degree_B-expo_B][1];
				expo_A--;
				expo_B--;
			}
			else{
				C[degree_C-expo_B][1]=B[degree_B-expo_B][1];
				expo_B--;
			}
		}
		
		for(int i=0; i<=degree_C; i++){
			System.out.print(C[i][1]+" ");
		}
	}
}
