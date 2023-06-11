import java.util.Scanner;

public class Pattern_NumChar {

	static int count = 1;
	private static void printNum(int numCount) {
		if(numCount == 0)return;
		System.out.print(count+" ");
		count++;
		printNum(numCount-1);
	} 
	private static void printLines(int row) {
		if(row == 0)return;
		printLines(row-1);
		printNum(row);
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows for the pattern : ");
		int rows = sc.nextInt();
		printLines(rows);
		sc.close();
	}

}
