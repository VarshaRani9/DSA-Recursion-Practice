import java.util.Scanner;

public class Pattern_CrossDiagLine {

	static int rows;
	private static void printStars(int stars,int row) {
		if(stars == 0)return;
		if(stars == row || stars+row == rows+1)
			System.out.print("*");
		else 
			System.out.print(" ");
		System.out.print(" ");
		printStars(stars-1,row);
	}
	private static void printLines(int row) {
		if(row <= 0)return;
		printLines(row-1);
		printStars(rows, row);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows for the pattern : ");
		 rows = sc.nextInt();
		printLines(rows);
		sc.close();

	}

}
