package test;

public class Palindrome {

	public static void main(String[] args) {		// TODO Auto-generated method stub

		String pal = "AXA";
		
		if(isPanindrome(pal))
		{
			System.out.println(pal + "est un palindrole");
		}
		else{
			System.out.println(pal + "n'est pas un palindrole");
		}
	}

	private static boolean isPanindrome(String pal) {
		String tmp = "";
		
		for(int i=pal.length(); i>0; i--){
			tmp = tmp + String.valueOf(pal.charAt(i-1));
		}
		
		return tmp.equals(pal);
	}

}
