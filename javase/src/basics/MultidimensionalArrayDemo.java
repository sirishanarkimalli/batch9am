package basics;

public class MultidimensionalArrayDemo {

	public static void main(String[] args) {
		int b[][]= new int[2][2];
		
		int c[][]=new int[3][];
		c[0]=new int[1];
		c[1]=new int[2];
		c[2]=new int[3];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				b[i][j]=j+1;
			}
		}
		
		//displaying first array
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();
		}
		
		
//		System.out.println(c[0].length);

		//assigning values into asymmetric array
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				c[i][j]=j+1;
			}
		}
		
		//displaying second array
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
