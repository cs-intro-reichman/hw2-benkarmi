// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int repeat = Integer.parseInt(args[0]);
		double sum = 0.0;
		double term = 1.0;

		for (int i = 0; i < repeat; i++) {
			double upper = 2.0 * i + 1.0;
			double lower = term * (1.0/upper);
			sum = sum + lower;
			term = -term;
		}
		double piAprox = sum * 4.0;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + piAprox);
	}
}
