import java.lang.Math;

public class LargestPrime {
  public static final long NUM = 600851475143L;

  public static long largestPrime(long num) {
	for (int i=2; i<num; i++) {
	  if (num%i==0) {
		num /= i;
	  }
	}
	return num;
  }

  public static void main(String[] args) {
	long prime = largestPrime(NUM);
	System.out.println("The largest prime factor of "+NUM+" is: "+prime);
  }
}
