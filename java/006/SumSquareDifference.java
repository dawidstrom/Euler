public class SumSquareDifference {
  public static int sumOfSquares(int num) {
	int sum = 0;
	for (int i=1; i<=num; i++) {
	  sum += i*i;
	}
	return sum;
  }

  public static int squareOfSums(int num) {
	int sum = 0;
	for (int i=1; i<=num; i++) {
	  sum += i;
	}
	return sum*sum;
  }

  public static void main(String[] args) {
	int difference = squareOfSums(100)-sumOfSquares(100);
	System.out.println("The difference between the sum of the square and the square of the sum for (1..100) is: "+difference);
  }
}
