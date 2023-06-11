package recursion;

import java.util.Scanner;

public class A_Convert_HexaToBinary {

	private static String decimalToBinaryEq(String num) {
		int n = Integer.parseInt(num);
//		if(n==0)return "0";
		if(n==0)return "";
		String res = decimalToBinaryEq(n/2+"");
		res+=n%2;
		return res+"";
	}
	static int count = -1;
	private static int hexaToDecimalEq(String num) {
		int n = Integer.parseInt(num);
		if(n==0)return 0;
		count++;
		int res = hexaToDecimalEq(n/10+"");
		res += (int) Math.pow(16,count--)*(n%10);
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Hexadecimal number ");
		String num = sc.next();
		int dec = hexaToDecimalEq(num);
		System.out.println("Binary Equivalent : "+decimalToBinaryEq(dec+""));
		sc.close();
	}

}
