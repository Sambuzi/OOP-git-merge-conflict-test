public final class HelloWorld {

	private static final String AUTHOR = "Danilo Pianini";

	public static void main(final String[] args) {

		System.out.println("This program is running in a PC with " + procNumber() + " logic processors!");
                System.out.println("this program has been realized by " + AUTHOR);
}

	public static int procNumber() {
		return Runtime.getRuntime().availableProcessors();

	}


}

