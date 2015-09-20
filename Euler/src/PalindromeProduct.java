/*
 * Problem 4: A palindromic number reads the same both ways. The largest palindrome 
 * made from the product of two 2-digit numbers is 9009 = 91 x 99.  
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class PalindromeProduct {

	public static int lpp() {
		int max = 0;
		int product;

		for (int i = 999; i >= 100; i--) {
			for (int j = 999; j >= 100; j--) {
				product = i * j;
				if (isPalindromic(product)) {
					max = Math.max(product, max);
					break;
				}
			}
		}

		return max;
	}

	public static boolean isPalindromic(int n) {
		StringBuilder s = new StringBuilder("" + n);
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println();

		System.out.println(isPalindromic(91 * 99));

		PalindromeProduct.lpp();

	}

}
