import java.util.Scanner;

public class Number_Power {

//	1. void return type - during stack building
	public static void power1(int num, int pow, int res) {
		if(pow == 0) {
			System.out.println("Calculated Power is : "+res);
			return;
		}
		res*=num;
		power1(num, pow-1, res);
	}
//	2. int return type - during stack falling
	public static int power2(int num, int pow) {
		if(pow == 0)return 1;
		int res = power2(num, pow-1);
		res*=num;
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number and the power which is to be calculated - ");
		int num = sc.nextInt();
		int pow = sc.nextInt();
		power1(num,pow,1);
		System.out.println("Calculated Power is : "+power2(num,pow));
		sc.close();
	}

}
