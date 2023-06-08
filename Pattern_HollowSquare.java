import java.util.Scanner;

public class Pattern_HollowSquare {

	static int rows;
	private static void printStarsSpaces(int stars, int row) {
		if(stars==0)return;
		if(row==1 || row == rows)System.out.print(("*"));
		else if(stars == 1 || stars == rows)System.out.print("*");
		else System.out.print(" ");
		printStarsSpaces(stars-1,row);
	}
	private static void printLines(int rows, int stars) {
		if(rows == 0)return;
		printStarsSpaces(stars,rows);
		System.out.println();
		printLines(rows-1,stars);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows for hollow square pattern : ");
		rows = sc.nextInt();
		printLines(rows, rows);
		sc.close();
	}

}
