public class ArrayStatistics {

    static int sum(int[] arr) {
        int total = 0;
        for (int value : arr) total += value;
        return total;
    }

    static double average(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    static int min(int[] arr) {
        int m = arr[0];
        for (int value : arr) if (value < m) m = value;
        return m;
    }

    static int max(int[] arr) {
        int m = arr[0];
        for (int value : arr) if (value > m) m = value;
        return m;
    }

    static double variance(int[] arr) {
        double avg = average(arr);
        double total = 0;
        for (int value : arr) {
            total += Math.pow(value - avg, 2);
        }
        return total / arr.length;
    }

    static double standardDeviation(int[] arr) {
        return Math.sqrt(variance(arr));
    }

    static double median(int[] arr) {
        int[] sorted = arr.clone();
        java.util.Arrays.sort(sorted);
        int n = sorted.length;
        if (n % 2 == 1) {
            return sorted[n / 2];
        }
        return (sorted[n / 2 - 1] + sorted[n / 2]) / 2.0;
    }

    public static void main(String[] args) {
        int[] data = {12, 7, 19, 4, 25, 8, 15};

        System.out.println("Sum:       " + sum(data));
        System.out.println("Average:   " + average(data));
        System.out.println("Min:       " + min(data));
        System.out.println("Max:       " + max(data));
        System.out.println("Variance:  " + variance(data));
        System.out.println("Std Dev:   " + standardDeviation(data));
        System.out.println("Median:    " + median(data));
    }
}b
