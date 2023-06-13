import java.util.Scanner;

public class Pattern_HollowInvPy {

	private static void printSpaces(int spaces) {
		if(spaces == 0)return;
		System.out.print(" ");
		printSpaces(spaces-1);
	}
	static int rows;
	private static void printStars(int stars,int row) {
		if(stars == 0)return;
		if(row==1 || row == rows || stars == 2*row-1) {
		System.out.print("*");
		printStars(stars-1,row);
		}
		else {
			printSpaces(2*row-3);
			System.out.print("*");
			printStars(stars-stars, row);
		}
	}
	private static void printLines(int row) {
		if(row == 0)return;
		printSpaces(rows-row);
		printStars(2*row-1, row);
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
