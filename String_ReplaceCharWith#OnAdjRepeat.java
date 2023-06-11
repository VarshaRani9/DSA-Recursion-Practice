// Given a String find the adjacent element if it is same as the previous element so replace the element with #.
// e.g "aabbcc" 
// output a#b#c#

public class String_ReplaceCharWith#OnAdjRepeat {

//	1. void return type - during stack building
	public static void replace(String str, int index, String res) {
		if(index == str.length()) {
			System.out.println(res);
			return;
		}
		if(index==0) {
			res+=str.charAt(0);
			index++;
		}
		if(str.charAt(index)==str.charAt(index-1)) res+="#";
		else res+=str.charAt(index);
		replace(str,index+1,res);
	}
//	2. String return type - during stack falling
	public static String replace2(String str, int index) {
		if(index == 0) {
			return str.charAt(0)+"";
		}
		String res = replace2(str,index-1);
		if(str.charAt(index)==str.charAt(index-1)) res+="#";
		else res+=str.charAt(index);
		return res;
	}
	public static void main(String[] args) {
		String s = "aabccdde";
		replace(s,0,"");
		System.out.println(replace2(s,s.length()-1));
	}

}
