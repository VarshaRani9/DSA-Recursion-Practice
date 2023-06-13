import java.util.Scanner;

public class A_17_HollowDiamond {

	private static void printSpaces(int spaces) {
		if(spaces == 0)return;
		System.out.print(" ");
		printSpaces(spaces-1);
	}
	static int rows;
	private static void printStars(int stars,int row) {
		if(stars == 0)return;
		System.out.print("*");
		printStars(stars-1, row);
	}
	private static void printLinesInv(int row) {
		if(row == 0)return;
		printStars(row, row);
		printSpaces((rows-row)*2);
		printStars(row, row);
		System.out.println();
		printLinesInv(row-1);
	}
	private static void printLines(int row) {
		if(row == 0)return;
		printLines(row-1);
		printStars(row, row);
		printSpaces((rows-row)*2);
		printStars(row, row);
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows for the pattern : ");
		rows = sc.nextInt();
		printLinesInv(rows);
		printLines(rows);
		sc.close();
	}

}
