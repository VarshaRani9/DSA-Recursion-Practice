import java.util.Scanner;

public class Pattern_NumPyramid {

	private static void printSpaces(int spaces) {
		if(spaces == 0)return;
		System.out.print(" ");
		printSpaces(spaces-1);
	}
	static int rows;
	private static void printNum(int num,int row) {
		if(num > rows-row+1)return;
		System.out.print(num);
		printNum(num+1, row);
	}
	private static void printNum2(int num) {
		if(num == 0)return;
		System.out.print(num);
		printNum2(num-1);
	}
	private static void printLines(int row) {
		if(row == 0)return;
		printNum(1,row);
		printSpaces(2*(row-1));
		printNum2(rows-row+1);
		System.out.println();
		printLines(row-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows for the pattern : ");
		rows = sc.nextInt();
		printLines(rows);
		sc.close();
	}

}
