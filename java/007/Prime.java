public class Prime {
  private static final int MAX_PRIMES = 100000;
  private static int[] primes = new int[MAX_PRIMES];

  public static int getNthPrime(int num) {
	return primes[num-1];
  }

  public static void generatePrimes(int num) {
	boolean a = true;

	for (int i=0; i<MAX_PRIMES; i++) {
	  primes[i] = -1;
	}

	primes[0] = 2;

	for (int i=1, prime=3; i<=num; prime+=2) {
	  a = true;
	  for (int j=0; primes[j] != -1; j++) {
		if (prime%primes[j] == 0) {
		  a = false;
		}
	  }
	  if (a) {
		primes[i] = prime;
		i++;
	  }
	}
  }

  public static void main(String[] args) {
	generatePrimes(10001);
	int prime = getNthPrime(10001);
	System.out.println("The 10001st prime is: "+prime);
  }
}
