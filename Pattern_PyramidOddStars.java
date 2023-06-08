import java.util.Scanner;

public class Pattern_PyramidOddStars {

	private static void printSpaces(int spaces) {
		if(spaces == 0)return;
		System.out.print(" ");
		printSpaces(spaces-1);
	}
	static int rows;
	private static void printStars(int stars) {
		if(stars == 0)return;
		System.out.print("*");
		printStars(stars-1);
	}
	private static void printLines(int row) {
		if(row == 0)return;
		printLines(row-1);// Upward
		printSpaces(rows-row);
		printStars(2*row-1);
		System.out.println();
//		printLines(row-1);// Inverted
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows for the pattern : ");
		rows = sc.nextInt();
		printLines(rows);
		sc.close();
	}

}
