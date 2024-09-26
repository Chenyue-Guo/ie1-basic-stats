/**
 * A simple class to compute basic, descriptive statistics.
 */
public class MinMaxCalculation {
    /**
     * Compute the mean of an array of numbers.
     */
    public static double min(double ... numbers) {
        double min = Double.MAX_VALUE;
        for (double num : numbers) {
            min = Math.min(min, num);
        }
        return min;
    }
}
