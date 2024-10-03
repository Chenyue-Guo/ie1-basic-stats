/**
 * A simple class to compute minimum and maximum of st.
 */
public class MinMaxCalculation {
    /**
     * Compute the minimum of an array of numbers.
     */
    public static double min(double ... numbers) {
        double min = Double.MAX_VALUE;
        for (double num : numbers) {
            min = Math.min(min, num);
        }
        return min;
    }

    /**
     * Compute the maximum of an array of numbers.
     */
    public static double max(double ... numbers) {
        double max = Double.NEGATIVE_INFINITY;
        for (double num : numbers) {
            max = Math.max(max, num);
        }
        return max;
    }
    
}
