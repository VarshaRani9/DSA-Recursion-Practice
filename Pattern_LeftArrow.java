import java.util.Scanner;

public class Pattern_LeftArrow {
	private static void printSpaces(int spaces) {
		if(spaces == 0)return;
		System.out.print(" ");
		printSpaces(spaces-1);
	}
	private static void printStars(int stars) {
		if(stars == 0)return;
		System.out.print("*");
		printStars(stars-1);
	}
	private static void printLinesUp(int row) {
		if(row == 0)return;
		printSpaces(row-1);
		printStars(row);
		System.out.println();
		printLinesUp(row-1);
	}
	private static void printLinesDown(int row) {
		if(row == 0)return;
		printLinesDown(row-1);
		printSpaces(row-1);
		printStars(row);
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows for the pattern : ");
		int rows = sc.nextInt();
		printLinesUp(rows);
		printLinesDown(rows);
		sc.close();
	}

}
