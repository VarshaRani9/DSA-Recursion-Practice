public class String_PalindromeCheck {

//	1. void return type - during stack building
	public static void palindromeCheck1(String str, int index) {
		if(index == str.length()/2+1) {
			System.out.println(str+ " : Palindrome");
			return;
		}
		if(Character.compare(str.charAt(index), str.charAt(str.length()-1-index)) != 0){
			System.out.println(str + " : Not palindrome");
			return;
		}
		palindromeCheck1(str,index+1);
	}
//	2. String return type - during stack falling
	static boolean flag = false;
	public static boolean palindromeCheck2(String str, int index) {
		if(index == str.length()/2) {
			flag = true;
			return flag;
		}
		if(Character.compare(str.charAt(index), str.charAt(str.length()-1-index)) != 0){
			return false;
		}
		palindromeCheck2(str,index+1);
		return flag;
	}
	public static void main(String[] args) {
		palindromeCheck1("abbawwa",0);
		System.out.println("abbaa :"+ (palindromeCheck2("abcba", 0)?" Palindrome":" Not palindrome"));
	}

}
