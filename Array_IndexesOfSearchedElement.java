

import java.util.Arrays;
import java.util.Scanner;

public class Array_IndexesOfSearchedElement {

//	1. void return type - during stack building
	public static void index1(int[] arr, int ele, int index, int[]res, int k) {
		if(index == arr.length) {
			System.out.print("[ ");
			for(int i =0;i<res.length;i++) {
				if(res[i]==-1)break;
				if(i==0 && res[i]!=-1)System.out.print(res[i]);
				else
				System.out.print(", "+res[i]);
			}
			System.out.println(" ]");
			return;
		}
		if(arr[index]==ele)res[k++]=index;
		index1(arr,ele,index+1,res,k);
		
	}
//	2. int return type - during stack falling
	public static int[] index2(int[] arr, int ele, int index, int[]res, int k) {
			if(index == arr.length) {
				return res;
			}
			res = index2(arr,ele,index+1,res,k);
			if(arr[index]==ele)res[k++]=index;
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
		System.out.println("Enter the element whose indexed are to be calculated - ");
		int ele = sc.nextInt();
		int[] res = new int[arr.length];
		Arrays.fill(res, -1);
		index1(arr,ele,0,res,0);
		res = index2(arr,ele,0,res,0);
		System.out.print("[ ");
		for(int i =0;i<res.length;i++) {
			if(res[i]==-1)break;
			if(i==0 && res[i]!=-1)System.out.print(res[i]);
			else
			System.out.print(", "+res[i]);
		}
		System.out.println(" ]");
		sc.close();
	}

}
