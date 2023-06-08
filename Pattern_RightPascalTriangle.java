import java.util.Scanner;

public class Pattern_RightPascalTriangle {

	private static void printStars(int stars) {
		if(stars == 0)return;
		System.out.print("*");
		printStars(stars-1);
	}
	private static void printLines(int rows) {
		if(rows == 0)return;
		printLines(rows-1);
		printStars(rows);
		System.out.println();
	}
	private static void printLinesInv(int rows) {
		if(rows == 0)return;
		printStars(rows);
		System.out.println();
		printLinesInv(rows-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows for the pattern : ");
	    int rows = sc.nextInt();
		printLines(rows);
		printLinesInv(rows-1);
		sc.close();
	}

}
