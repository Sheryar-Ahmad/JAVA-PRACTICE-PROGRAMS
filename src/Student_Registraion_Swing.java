import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

// Student class with encapsulation
class Student {
    private String name;
    private String rollNo;
    private ArrayList<String> courses;

    public Student(String name, String rollNo, ArrayList<String> courses) {
        this.name = name;
        this.rollNo = rollNo;
        this.courses = courses;
    }
    public String getName() { return name; }
    public String getRollNo() { return rollNo; }
    public ArrayList<String> getCourses() { return courses; }
    // Format student info as a string
    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNo + ", Courses: " + courses;
    }
}

// Optional subclass for graduate students
class GraduateStudent extends Student {
    private String thesisTopic;
    public GraduateStudent(String name, String rollNo, ArrayList<String> courses, String thesisTopic) {
        super(name, rollNo, courses);
        this.thesisTopic = thesisTopic;
    }
    public String getThesisTopic() { return thesisTopic; }
    public void setThesisTopic(String thesisTopic) { this.thesisTopic = thesisTopic; }
}

// Main GUI class
public class Student_Registraion_Swing extends JFrame implements ActionListener {
    private JTextField nameField;
    private JTextField rollField;
    private JCheckBox[] courseChecks;
    private JButton registerButton;
    private JTextArea outputArea;
    private ArrayList<Student> studentList;

    public Student_Registraion_Swing() {
        // Initialize student list
        studentList = new ArrayList<>();

        // Frame setup
        setTitle("Student Registration Form");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Input panel (Name, Roll, Courses)
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Name field
        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        // Roll number field
        inputPanel.add(new JLabel("Roll Number:"));
        rollField = new JTextField();
        inputPanel.add(rollField);

        // Courses checkboxes
        inputPanel.add(new JLabel("Courses:"));
        JPanel coursesPanel = new JPanel(new GridLayout(0, 2));
        String[] courses = {"Math", "Science", "History", "Language"};
        courseChecks = new JCheckBox[courses.length];
        for (int i = 0; i < courses.length; i++) {
            courseChecks[i] = new JCheckBox(courses[i]);
            coursesPanel.add(courseChecks[i]);
        }
        inputPanel.add(coursesPanel);

        add(inputPanel, BorderLayout.NORTH);

        // Register button
        registerButton = new JButton("Register");
        registerButton.addActionListener(this);
        add(registerButton, BorderLayout.CENTER);

        // Output area for registered students
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Registered Students"));
        add(scrollPane, BorderLayout.SOUTH);

        setVisible(true);
    }

    // Handle button click
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            String name = nameField.getText().trim();
            String roll = rollField.getText().trim();
            if (name.isEmpty() || roll.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Name and Roll Number cannot be empty.");
                return;
            }
            ArrayList<String> selectedCourses = new ArrayList<>();
            for (JCheckBox check : courseChecks) {
                if (check.isSelected()) {
                    selectedCourses.add(check.getText());
                }
            }
            if (selectedCourses.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Select at least one course.");
                return;
            }
            // Create Student object and update list/UI
            Student student = new Student(name, roll, selectedCourses);
            studentList.add(student);
            outputArea.append(student.toString() + "\n");
            // Append student details to file
            try (FileWriter writer = new FileWriter("students.txt", true);
                 BufferedWriter bw = new BufferedWriter(writer)) {
                bw.write(name + ", " + roll + ", " + selectedCourses);
                bw.newLine();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            nameField.setText("");
            rollField.setText("");
            for (JCheckBox check : courseChecks) {
                check.setSelected(false);
            }
        }
    }
    public static void main(String[] args) {
        new Student_Registraion_Swing();
    }
}
