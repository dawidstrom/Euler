public class PythagoreanTriplet {
  public static int pythagoreanTriplet(int bound) {
	int a,b,c;

	for (a=1; a<bound; a++) {
	  for (b=a+1; b<bound; b++) {
		c=bound-a-b;
		if (a*a+b*b==c*c) {
		  return a*b*c;
		}
	  }
	}
	return -1;
  }

  public static void main(String[] args) {
	int product = pythagoreanTriplet(1000);
	System.out.println("The largest pythagorean triplet which sum is equal to 1000 is: "+product);
  }
}
