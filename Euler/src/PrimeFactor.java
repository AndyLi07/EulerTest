public class PrimeFactor {

	public static long lpf(long n) {
		long div = n;
		long factor = 2L;
		long max = 0L;

		while (div != 1) {
			while (div % factor != 0) {
				factor++;
			}
			div = div / factor;
			max = Math.max(max, factor);
			factor = 2L;
		}

		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 600851475143L;
		System.out.println("The largest prime factor of " + n + " is: "
				+ lpf(n));

	}

}
