// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************
public class MathUtils {
	// -------------------------------------------------------------
	// Returns the factorial of the argument given
	// -------------------------------------------------------------
	public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("not defined for negative numbers.");
        }
        if (n >= 17) {
            throw new IllegalArgumentException("result is too large for integer");
        }

        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
	}
}