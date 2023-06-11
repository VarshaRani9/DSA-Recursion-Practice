// Given an Array find the element and replace the value with given value, search and replace all occurrences.

import java.util.Scanner;

public class Array_ReplaceXwithY {

//	1. void return type - during stack building
	public static void replace(int[] arr, int ele, int rep, int index) {
		if(index == arr.length) {
			System.out.print("[");
			for(int i =0;i<arr.length;i++) {
				if(i==0)
				System.out.print(arr[i]);
				else
				System.out.print(", "+arr[i]);
			}
			System.out.print("]");
			return;
		}
		if(arr[index]==ele)arr[index]=rep;
		replace(arr, ele, rep, index+1);
	}
//	2. int return type - during stack falling
	public static int[] replace1(int[] arr, int ele, int rep, int index) {
		if(index == arr.length) {
			return arr;
		}
		arr = replace1(arr, ele, rep, index+1);
		if(arr[index]==ele)arr[index]=rep;
		return arr;
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
		System.out.println("Enter the element to be replace & by which element - ");
		int ele = sc.nextInt();
		int rep = sc.nextInt();
		
//		replace(arr, ele, rep, 0);
		
		replace1(arr,ele, rep, 0);
		System.out.print("[");
		for(int i =0;i<arr.length;i++) {
			if(i==0)
			System.out.print(arr[i]);
			else
			System.out.print(", "+arr[i]);
		}
		System.out.print("]");
		sc.close();
	}

}
