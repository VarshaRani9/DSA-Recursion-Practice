public class Number_SeriesSum {

//	1. void return type - during stack building
	public static void series(int num, double res) {
		if(num == 1) {
			System.out.println("Sum of series :"+(res+1));
			return;
		}
		res += 1/Math.pow(num,num-1);
		series(num-1,res);
	}
//	2. double return type - during stack falling
	public static double series1(int num) {
		if(num == 1) return 1;
		double res = series1(num-1);
		res += 1/Math.pow(num,num-1);
		return res;
	}
	public static void main(String[] args) {
		series(7,0);
		System.out.println("Sum of series :"+series1(7));
	}

}
