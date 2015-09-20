public class Fibonacci {

	// 2. Sum of Even valued Fibonacci
	public static void FibonacciSum() {
		int[] fib = new int[3];
		int sum = 0;

		fib[0] = 1;
		fib[1] = 2;

		while (true) {
			fib[2] = fib[0] + fib[1];
			fib[0] = fib[1];
			fib[1] = fib[2];
			if (fib[2] > 4000000) {
				break;
			}
			if (fib[2] % 2 == 0) {
				sum += fib[2];
			}
		}
		sum = sum + 2; // f(1) = 2

		System.out.print("Sum is: " + sum);
		System.out.println();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci.FibonacciSum();
	}

}
