// Count all Occurrence of Search Element 

import java.util.Scanner;

public class Array_CountOfParticularElement {
	
//	1. void return type - during stack building
	public static void count1(int[] arr, int ele, int index, int count) {
		if(index == arr.length) {
			System.out.println("Count : "+count);
			return;
		}
		if(arr[index]==ele)count++;
		count1(arr,ele,index+1,count);
	}
//	2. int return type - during stack falling
	public static int count2(int[] arr, int ele, int index) {
			if(index == arr.length)return 0;
			int count = count2(arr,ele,index+1);
			if(arr[index]==ele)count++;
			return count;
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
		System.out.println("Enter the element whom count is to be calculated - ");
		int ele = sc.nextInt();
		count1(arr,ele,0,0);
		System.out.println("Count : "+count2(arr,ele,0));
		sc.close();
	}

}
