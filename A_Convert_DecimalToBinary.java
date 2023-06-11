package recursion;

import java.util.Scanner;

public class A_Convert_DecimalToBinary {

	private static String binaryEq(String num) {
		int n = Integer.parseInt(num);
//		if(n==0)return "0";
		if(n==0)return "";
		String res = binaryEq(n/2+"");
		res+=n%2;
		return res+"";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal number ");
		String num = sc.next();
		System.out.println("Binary Equivalent : "+binaryEq(num));
		sc.close();
	}

}
