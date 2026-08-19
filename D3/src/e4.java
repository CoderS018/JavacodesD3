import java.util.Scanner;

class e4 {
	static void validate(int age) {
		if (age < 18) {
		
			throw new ArithmeticException("not elgible for vote");
		} else {
			System.out.println("welcome to the voteing");
		}
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("please enter your age ");
			int n = scanner.nextInt();
			validate(n);
		}
		System.out.println("rest of the code");
	}
}
