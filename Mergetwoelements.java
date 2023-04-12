package Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		 // create two arrays
		int[] arr1= {1,2,3,4};
		int[] arr2= {5,6,7,8};
		
		//create merge array to store the elements of arr2 and arr2
		int mergeLength= arr1.length+arr2.length;
		
		//create a array to store the mergerd element
		int[] mergeArray=new int[mergeLength];
		
//		to store value of arr1 to mergearray
		for(int i=0;i<arr1.length;i++)
		{
		
		mergeArray[i]=arr1[i];
		}
		// Copy elements from arr2 to mergeArray
        for (int i = 0; i < arr2.length; i++) {
            mergeArray[arr1.length + i] = arr2[i];
        }

        // Print the merge array
        System.out.println("Merged Array:");
        for (int i = 0; i < mergeArray.length; i++) {
            System.out.print(mergeArray[i] + " ");
        }

	}

}
