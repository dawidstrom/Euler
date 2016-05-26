public class SumOfPrimes {
  private static final int MAX_PRIMES = 99999999;
  private static boolean[] primes = new boolean[MAX_PRIMES];

  public static void generatePrimes() {
	for (int i=2; i<MAX_PRIMES; i++) {
	  primes[i] = true;
	}

	primes[0] = false;
	primes[1] = false;

	factor(2);
	factor(3);
	int i=5;

	while(i<MAX_PRIMES) {
	  if (primes[i] == false) {
		i+=2;
	  } else {
		factor(i);
		i+=2;
	  }
	}
  }

  public static void factor(int num) {
	for (int i=num+num; i<MAX_PRIMES; i+=num) {
	  primes[i] = false;
	}
  }

  public static long sumOfPrimes(int num) {
	long sum = 2+3;

	for (int i=5; i<=num;) {
	  if (primes[i]) {
		sum += i;
	  }
	  i+=2;
	}

	return sum;
  }

  public static void main(String[] args) {
	generatePrimes();
	long sum = sumOfPrimes(2000000);
	System.out.println("The sum of all primes below two million is: "+sum);
  }
}
