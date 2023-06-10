import java.util.Scanner;

public class Number_PrimeCheck {
	
//	1. void return type - during stack building
	public static void primeCheck1(int num, int i) {
		if(i==num) {
			System.out.println(num+" is Prime");
			return;
		}
		if(num%i==0) {
			System.out.println(num+" is not prime");
			return;
		}
		primeCheck1(num,i+1);
	}
//	2. boolean return type - during stack falling
	static boolean flag = false;
	public static boolean primeCheck2(int num, int i) {
		if(i==num) {
			flag = true;
			return flag;
		}
		if(num%i==0) {
			return false;
		}
		primeCheck2(num,i+1);
		return flag;
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked for prime - ");
		int num = sc.nextInt();
		primeCheck1(num, 2);
		System.out.println(num+" is "+(primeCheck2(num, 2)?"Prime":"Not Prime"));
		sc.close();
	}

}
