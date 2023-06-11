// Array Search the Element From the Last. (lastIndexOf)

import java.util.Scanner;

public class Array_LastIndexOf {

//	1. void return type - during stack building
	public static void indexfromLast1(int[] arr, int index, int ele, int res) {
		if(index == arr.length) {
			System.out.println((res>=0)?"Element found at index :"+res : "Element not found");
			return;
		}
		if(arr[index] == ele)res = index;
		indexfromLast1(arr, index+1, ele, res);
	}
//	2. int return type - during stack falling
	public static int indexfromLast2(int[] arr, int index, int ele) {
			if(index == arr.length)return -1;
			int res = indexfromLast2(arr, index+1, ele);
			if(arr[index] == ele)res = index;
			return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements for array - ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter the elements for array - ");
		for(int i =0;i<num;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element which is to be searcged in the array - ");
		int ele = sc.nextInt();
		indexfromLast1(arr, 0, ele, -1);
		int index = indexfromLast2(arr, 0, ele);
		System.out.println(index>=0?"Element found at index :"+index:"Element not found");
		sc.close();
	}

}
