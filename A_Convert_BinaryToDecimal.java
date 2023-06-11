package recursion;

import java.util.Scanner;

public class A_Convert_BinaryToDecimal {

	static int count = -1;
	private static int decimalEq(String num) {
		int n = Integer.parseInt(num);
		if(n==0)return 0;
		count++;
		int res = decimalEq(n/10+"");
		res += (int) Math.pow(2,count--)*(n%10);
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Binary number ");
		String num = sc.next();
		System.out.println("Decimal Equivalent : "+decimalEq(num));
		sc.close();
	}

}
