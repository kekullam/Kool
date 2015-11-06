package praktikum10;

public class FibonacciNumber {

	public static void main(String[] args) {
		int i = 0;
		while (true) {
			System.out.println(i + " - " + fibonacci(i));
			i++;
		}

	}

	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

}
