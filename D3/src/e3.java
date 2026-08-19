class e3 {
	public static void main(String[] args) {
		System.out.println("anand");
		System.out.println("anand3");

		try {
			System.out.println(10 / 0);
			System.out.println("vivek");
		} catch (ArithmeticException e) {
			System.out.println("arithmetic error handled");
		} finally {
			System.out.println("finally block");
		} 

		System.out.println("rest of the code");
	}
}
