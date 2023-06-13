import java.util.Scanner;

public class Pattern_Heart {

	private static void printSpaces(int spaces) {
		if(spaces == 0)return;
		System.out.print(" ");
		printSpaces(spaces-1);
	}
	static int rows;
	private static void printStars(int stars, int row) {
		if(stars == 0 || row<=rows/2)return;
		System.out.print("*");
		printStars(stars-1, row);
	}
	private static void printStarsDown(int stars) {
		if(stars == 0)return;
		System.out.print("*");
		printStarsDown(stars-1);
	}
	private static void printLines(int row) {
		if(row == 0)return;
		printLines(row-1);
		printSpaces(rows-row);
		printStars(2*row-1,row);
		printSpaces(2*(rows-row));
		printStars(2*row-1, row);
		System.out.println();
	}
	private static void printLinesDown(int row) {
		if(row == 0)return;
		printSpaces(2*(rows-row));
		printStarsDown(2*(2*row-1));
		System.out.println();
		printLinesDown(row-1);// Inverted
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows for the pattern : ");
		rows = sc.nextInt();
		printLines(rows);
		printLinesDown(rows);
		sc.close();
	}

}
