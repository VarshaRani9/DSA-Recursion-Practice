import java.util.Scanner;

public class Pattern_RighttHalfPyramid {

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
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows for the pattern : ");
		int row = sc.nextInt();
		printLines(row);
		sc.close();
	}

}
