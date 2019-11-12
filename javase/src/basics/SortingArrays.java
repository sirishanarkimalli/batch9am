package basics;

public class SortingArrays {

	public void bubbleSort(int a[]) {
		int l=a.length;		
		for(int i=0;i<l;i++) {
			for(int j=0;j<l-1;j++) {
				for(int k=j+1;k<l;k++)
				if(a[j]>a[k]) {
					int c=a[j];
					a[j]=a[k];
					a[k]=c;
				}
			}
		}
	}
	
	public void displayArray(int a[]) {
		System.out.println("\nDisplaying Array elements" );
		for(int value :a)
			System.out.print(value+" ");
	}
	public static void main(String[] args) {
		SortingArrays obj =new SortingArrays();
		
		int a[]= {50,40,33,2,90};
		obj.displayArray(a);
		
		obj.bubbleSort(a);
		
		obj.displayArray(a);

	}

}
