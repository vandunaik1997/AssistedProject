package SingleAndMultiDimensionalArray;

public class SingleAndMultiDimensionalArray {

	public static void main(String[] args) {
System.out.println("one dimenstion array is");
		
		int  number[] = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100} ;
		for(int i = 0; i < number.length; i++)
            System.out.println(number[i]);
		
		System.out.println("multidimenstion array is");
	
			int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
		
			for(int i=0;i<3;i++){  
			 for(int j=0;j<3;j++){  
			   System.out.print(+arr[i][j]+" ");  
			 } 
			 
			 System.out.println(" ");  
			}  




	}

}
