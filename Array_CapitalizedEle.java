// Write recursive function that takes an array of words and returns an array containing all words capitalized
// i/p : ["foo", "bar", "world"]
// o/p : ["FOO", "BAR", "WORLD"]

public class Array_CapitalizedEle {

	private static String[] cap(String[] arr,int index) {
		if(index == arr.length) {
			String res[] = new String[arr.length];
			return res;
		}
		String res[] = cap(arr, index+1);
		String str = arr[index];
		str = str.toUpperCase();
		res[index] = str;
		return res;
	}
	public static void main(String[] args) {
		String arr[] = {"Nathan", "Joey", "Herlin", "John", "Heer"};
		String res[] = cap(arr, 0);
		System.out.print("[");
		for(String s : res) {
			System.out.print(s+", ");
		}
		System.out.print("]");
	}

}
