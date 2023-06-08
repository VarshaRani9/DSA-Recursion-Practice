import java.util.Scanner;

public class Pattern_Square {

	private static void printStars(int stars) {
		if(stars == 0)return;
		System.out.print("*");
		printStars(stars-1);
	}
	private static void printLines(int rows,int stars) {
		if(rows == 0)return;
		printStars(stars);
		System.out.println();
		printLines(rows-1,stars);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows for square pattern : ");
		int row = sc.nextInt();
		printLines(row, row);
		sc.close();
	}

}
