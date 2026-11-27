import java.util.Arrays;

public class ArrayReport {

    static String grade(int score) {
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        if (score >= 70) return "C";
        if (score >= 60) return "D";
        return "F";
    }

    static void printReport(String[] students, int[] scores) {
        if (students.length != scores.length) {
            throw new IllegalArgumentException("Students and scores length mismatch");
        }

        System.out.println("| Student   | Score | Grade |");
    
        for (int i = 0; i < students.length; i++) {
            System.out.printf("| %-9s | %5d | %5s |%n",
                    students[i], scores[i], grade(scores[i]));
        }

        System.out.println("-------------------------");

        int total = 0;
        int highest = scores[0];
        int lowest = scores[0];

        for (int score : scores) {
            total += score;
            if (score > highest) highest = score;
            if (score < lowest) lowest = score;
        }

        double average = (double) total / scores.length;

        System.out.println("\nClass Statistics");
        System.out.println("----------------");
        System.out.println("Average: " + String.format("%.2f", average));
        System.out.println("Highest: " + highest);
        System.out.println("Lowest:  " + lowest);
        System.out.println("Sorted:  " + Arrays.toString(sortedCopy(scores)));
    }

    static int[] sortedCopy(int[] arr) {
        int[] copy = arr.clone();
        Arrays.sort(copy);
        return copy;
    }

    public static void main(String[] args) {
        String[] students = {"Ali", "Sara", "John", "Mia", "Zara"};
        int[] scores = {85, 92, 67, 78, 95};

        printReport(students, scores);
    }
}
