package hw5_4;

public class hw5_4 {

	public static void main(String[] args) {

		System.out.println("계수 0은 생략한 결과입니다");
		
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
		optPoly.addPoly(A3, B3);

	}

}

class OperatePoly{
	
	public void addPoly(double[][] A, double[][] B){
		
		int degree_C;
		int degree_A=(int)A[0][0];
		int degree_B=(int)B[0][0];
		
		int idx_A=0;
		int idx_B=0;
		
		if(degree_A>=degree_B)
			degree_C=degree_A;
		else
			degree_C=degree_B;
		
		double C[][] = new double[(degree_C+1)+1][2];
		
		for(int i=0;i<=degree_C;i++){
			C[i][0] = degree_C-i;
		}
		
		//중간에 빠진 차수가 있어도(ex)3승,1승,0승) 결과가 나오도록 작성
		while(idx_A<A.length && idx_B<B.length){
			
			if(A[idx_A][0]>B[idx_B][0]){
				C[degree_C-(int)A[idx_A][0]][1]=A[idx_A][1];
				idx_A++;
				
			}
			else if(A[idx_A][0]==B[idx_B][0]){
				C[degree_C-(int)A[idx_A][0]][1]=A[idx_A][1]+B[idx_B][1];
				idx_A++;
				idx_B++;
			}
			else{
				C[degree_C-(int)B[idx_B][0]][1]=B[idx_B][1];
				idx_B++;
			}
		}
		
		
		//A의 나머지 항들을 C에 복사
		if(A[A.length-1][0]<B[B.length-1][0]){
			for(int i=idx_A; i<A.length; i++){
				C[degree_C-(int)A[i][0]][1] = A[i][1];
			}
		}
		//B의 나머지 항들을 C에 복사
		else{
			for(int i=idx_B; i<B.length; i++){
				C[degree_C-(int)B[i][0]][1] = B[i][1];
			}
		}
		
		
		//계수 0 삭제
		for(int k=0; k<=degree_C; k++){
			if(C[k][1]==0){
				for(int l=k; l<=degree_C; l++){
					C[l][0]=C[l+1][0];
					C[l][1]=C[l+1][1];
				}
				degree_C--;
				k--;
			}
		}
		
		
		//C의 내용 출력
		for(int k=0; k<=degree_C; k++){
			System.out.print(C[k][1]+" ");
		}
	}
}
