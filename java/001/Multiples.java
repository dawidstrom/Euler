public class Multiples {
  public static int sumOfMultiples(int multiple, int bound) {
	int sum = 0;
	for (int i=0; i<bound; i++) {
	  if (i%multiple == 0) {
		sum += i;
	  }
	}
	return sum;
  }

  public static void main(String[] args) {
	int sum = sumOfMultiples(3,1000)+sumOfMultiples(5,1000)-sumOfMultiples(15,1000);
	System.out.println("Sum of multiples of 3 and/or 5 up to 1000: "+sum);
  }
}
