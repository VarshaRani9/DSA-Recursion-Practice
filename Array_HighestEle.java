// Find the Highest Element in an Array 

public class Array_HighestEle {

	private static int high(int[] arr, int index) {
		if(index == arr.length) {
			return -1;
		}
		int ele = high(arr, index+1);
		if(arr[index]>ele)ele = arr[index];
		return ele;
	}
	public static void main(String[] args) {
		int arr[] = {12,22,1,189,16,98,45};
		System.out.println("Highest element of array : "+high(arr, 0));
	}

}
