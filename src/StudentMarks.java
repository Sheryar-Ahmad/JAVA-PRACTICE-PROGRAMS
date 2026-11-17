import java.util.HashMap;
import java.util.Map;

// enum practice
enum Grade {
    PASS, FAIL
}

public class StudentMarks {
    public static void main(String[] args) {
        
        // storing marks
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Ali", 85);
        marks.put("Sara", 42);
        marks.put("Zain", 74);
        marks.put("Ayesha", 38);

        System.out.println("Results:");

        // check pass/fail
        marks.forEach((name, score) -> {
            Grade res = (score >= 50) ? Grade.PASS : Grade.FAIL;
            System.out.println(name + " - " + score + " (" + res + ")");
        });

        // count passed
        long passed = marks.values().stream()
                .filter(s -> s >= 50)
                .count();

        System.out.println("\nPassed: " + passed);
    }
}
