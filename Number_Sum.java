import java.util.Scanner;

public class Number_Sum {
//	1. void return type
	public static void sum1(int num,int res) {
		if(num == 0) {
			System.out.println("Sum of numbers using void return type is : "+res);
			return;
		}
		res += num;
		sum1(num-1, res);
	}
//	2. int return type
	public static int sum2(int num) {
		if(num == 0) {
			return 0;
		}
		int res = sum2(num-1);
		res += num;
		return res;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number upto which sum is to be calculated - ");
		int num = sc.nextInt();
		sum1(num,0);
		System.out.println("Sum of numbers using int return type is : "+sum2(num));
		sc.close();
	}

}
