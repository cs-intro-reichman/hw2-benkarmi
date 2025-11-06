// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);
		String mode = args[1];
		boolean verbose = mode.equals("v");

		for (int i = 1 ; i <= N ; i++) {
			long j = i;
			int count  = 1;

			if (verbose) {
				System.out.print(j);
			}
			while( true ) {
				if ( j % 2 == 0) {
					j = j / 2;
				} else {
				j = (3 * j) + 1;
				}
				count++;
				if (verbose) {
					System.out.print(" " + j);
				}
				if (j == 1 ) {
					break;
				}
			}
			if (verbose) {
				System.out.println(" (" + count + ")");
			}
		}
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}
