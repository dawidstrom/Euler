public class EvenFibonacci {
  public static int evenFibonacci(int bound) {
	int sum = 0;
	int prev = 1;
	int num = 1;
	int tmp;
	while (num<= bound) {
	  if (num%2==0) {
		sum += num;
	  }
	  tmp = prev;
	  prev = num;
	  num += tmp;
	}
	return sum;
  }

  public static void main(String[] args) {
	int sum = evenFibonacci(4000000);
	System.out.println("Sum of even numbered fibonacci lower than 4 000 000: "+sum);
  }
}
