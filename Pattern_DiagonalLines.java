import java.util.Scanner;

public class Pattern_DiagonalLines {

	private static void printSpaces(int spaces) {
		if(spaces == 0)return;
		System.out.print(" ");
		printSpaces(spaces-1);
	}
	private static void printLines(int row) {
		if(row == 0)return;
		printLines(row-1);
		printSpaces(row-1);
		System.out.print("*");
		System.out.println();
	}
	private static void printLines2(int row) {
		if(row == 0)return;
		printSpaces(row-1);
		System.out.print("*");
		System.out.println(" ");
		printLines2(row-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows for the pattern : ");
		int rows = sc.nextInt();
		printLines(rows);
		System.out.println();
		printLines2(rows);
		sc.close();

	}

}
