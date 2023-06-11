// Given a String find the adjacent element if it is same as the previous element so add the star in between
// e.g "aabbcc"
// output a*ab*bc*c


public class String_Insert*OnAdjRepeat {

//	1. void return type - during stack building
	public static void insert(String str, int index, String res) {
		if(index == str.length()) {
			System.out.println(res);
			return;
		}
		if(index == 0)res+=str.charAt(0);
		else if(str.charAt(index)==str.charAt(index-1))res+="*"+str.charAt(index);
		else res+=str.charAt(index);
		insert(str, index+1, res);
	}
//	2. String return type - during stack falling
	public static String insert2(String str, int index) {
		if(index == 0) {
			return str.charAt(0)+"";
		}
		String res = insert2(str, index-1);
		if(index == 0)res+=str.charAt(0);
		else if(str.charAt(index)==str.charAt(index-1))res+="*"+str.charAt(index);
		else res+=str.charAt(index);
		return res;
	}
	public static void main(String[] args) {
		String s = "aabccdde";
		insert(s,0,"");
		System.out.println(insert2(s,s.length()-1));
	}

}
