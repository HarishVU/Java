package OWN;

public class TwoMatrices {

	public TwoMatrices(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		int i,j;
		int[][] a = {{1,2,3},{3,4,5}};
		int[][] b = {{1,2,3},{3,4,5}};
		
		int[][] c =new int[2][3];
		
		for(i=0;i<2;i++) {
			for(j=0;j<3;j++) {
				c[i][j] = a[i][j]+b[i][j];
				System.out.println(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
