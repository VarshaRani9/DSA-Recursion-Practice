package recursion;

import java.util.Scanner;

public class A_Convert_DecimalToHexa {

	private static String hexEq(String num) {
		int n = Integer.parseInt(num);
//		if(n==0)return "0";
		if(n==0)return "";
		String res = hexEq(n/16+"");
		int n1 = n%16;
		if(n1>9)res+=(char)(n1+55)+"";
		else
		res+=n1;
		return res+"";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal number ");
		String num = sc.next();
		System.out.println("HexaDecimal Equivalent : "+hexEq(num));
		sc.close();
	}

}
