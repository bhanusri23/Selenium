import java.util.Scanner;

public class ScannerDemo {

			public static void main(String[] args){
				System.out.println("Enter size of array: ");
				Scanner s = new Scanner(System.in);
				int size = s.nextInt();
				int [] a = new int[size];
				System.out.println("Enter values into an array");
				
				//filling array
				for(int i = 0;i<size;i++){
					 a[i] = s.nextInt();
					
				}
				
				// Display values from an array
				
				for(int j = 0;j < size; j++){
					System.out.println("a[j]");
					
				}
				
				// to find largest in an array
				
				int largest = a[0];
				for(int k = 0; k <size; k++){
					if(a[k]>largest)
						largest = a[k];
					System.out.println("The largest value is :"+largest);
					
				}
				
				// To find smallest in array
				
				int smallest = a[0];
				for(int l =0; l<size;l++){
					if(a[l]<smallest)
						smallest = a[l];
					System.out.println("the smallest value is :"+smallest);
				}
	
						
			}
}

