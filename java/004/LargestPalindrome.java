public class LargestPalindrome {

  public static int largestPalindrome() {
	int largestSoFar = -1;
	for (int i=100; i<=999; i++) {
	  for (int j=100; j<=999; j++) {
		if (isPalindrome(i*j) && i*j > largestSoFar) {
		  largestSoFar = i*j;
		}
	  }
	}
	return largestSoFar;
  }

  public static boolean isPalindrome(int num) {
	String s = ""+num;
	for (int i=0; i<s.length()/2; i++) {
	  if (s.charAt(i) != s.charAt(s.length()-i-1)) {
		return false;
	  }
	}
	return true;
  }

  public static void main(String[] args) {
	int palindrome = largestPalindrome();
	System.out.println("The largest palindrome made by multiplying two 3-digit numbers is: "+palindrome);
  }
}
