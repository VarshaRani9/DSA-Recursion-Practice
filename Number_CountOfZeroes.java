import java.util.Scanner;

public class Number_CountOfZeroes {

//	1. void return type - during stack building
	public static void zeroes1(int num, int count) {
		if(num == 0) {
			System.out.println("Count of zeroes : "+count);
			return;
		}
		if(num%10 == 0)count ++;
		zeroes1(num/10,count);
	}
//	2. int return type - during stack falling
	public static int zeroes2(int num) {
		if(num == 0)return 0;
		int count = zeroes2(num/10);
		if(num%10 == 0)count ++;
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number - ");
		int num = sc.nextInt();
		zeroes1(num,0);
		System.out.println("Count of zeroes : "+zeroes2(num));
		sc.close();
	}

}
