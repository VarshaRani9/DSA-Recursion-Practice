// Given is an Array of Employee Salary, add the tax 10% in each salary and 
// return the new array which contains (salary + tax).

public class Array_EleUpdation {

	private static double[] salTax(double[] arr, int index) {
		if(index == arr.length) {
			double res[] = new double[arr.length];
			return res;
		}
		double[] res = salTax(arr, index+1);
		res[index] = arr[index]+arr[index]*0.1;
		return res;
	}
	public static void main(String[] args) {
		double arr[] = {200500.00, 270089.50, 340000.25, 48000.00, 920000.50};
		double res[] = salTax(arr, 0);
		for(int i =0;i<res.length; i++) {
			System.out.print(res[i]+", ");
		}
	}

}
