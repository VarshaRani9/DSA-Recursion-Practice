package recursion;

import java.util.Scanner;

public class A_Convert_DecimalToOctal {

	private static String octalEq(String num) {
		int n = Integer.parseInt(num);
//		if(n==0)return "0";
		if(n==0)return "";
		String res = octalEq(n/8+"");
		res+=n%8;
		return res+"";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal number ");
		String num = sc.next();
		System.out.println("Octal Equivalent : "+octalEq(num));
		sc.close();
	}

}
