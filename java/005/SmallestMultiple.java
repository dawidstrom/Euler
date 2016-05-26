public class SmallestMultiple {
  public static final int MAX_PRIMES = 999;

  public static long smallestMultiple(int num) {
	long smallest = 1;
	int primes[] = reduceToPrimes(num);
	for (int i=0; primes[i] != -1; i++) {
	  smallest *= primes[i];
	}
	return smallest;
  }

  public static int[] reduceToPrimes(int num) {
	int[] primes = getPrimesLessThan(num);
	int[] reduction = new int[MAX_PRIMES];

	for (int i=0; i<MAX_PRIMES; i++) {
	  reduction[i] = -1;
	}

	for (int i=0, k=0; primes[i] != -1; i++) {
	  for (int j=primes[i]; j<=num; k++, j*=primes[i]) {
		reduction[k] = primes[i];
	  }
	}

	return reduction;
  }

  public static int[] getPrimesLessThan(int num) {
	int[] primes = new int[MAX_PRIMES];

	for (int i=0; i<MAX_PRIMES; i++) {
	  primes[i] = -1;
	}

	boolean isPrime;
	for (int i=0, prime=2; prime <= num; prime++) {
	  isPrime = true;
	  for (int k=0; primes[k] != -1; k++) {
		if (prime%primes[k]==0) {
		  isPrime = false;
		}
	  }
	  if (isPrime) {
		primes[i] = prime;
		i++;
	  }
	}

	return primes;
  }

  public static void main(String[] args) {
	long num = smallestMultiple(20);
	System.out.println("The smallest number which is divisible by all numbers 1..20 is: "+num);
  }
}
