package A01WorkingWithAbstraction.E03StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentsByName;

    public StudentSystem() {
        this.studentsByName = new HashMap<>();
    }

    public Map<String, Student> getStudentsByName() {
        return this.studentsByName;
    }

    public String parseCommand(String[] args) {

        String output = null;

        String commands = args[0];

        if (commands.equals("Create")) {
         addStudent(createNewStudent(args));

        } else if (commands.equals("Show")) {
                output = getStudentsInfo(args[1]);
            }
        
        return output;
    }

    private String getStudentsInfo(String name) {
        if (contains(name)) {
            return studentsByName.get(name).toString();
        }
        return null;
    }

    private Student createNewStudent(String[] args) {
        String name = args[1];
        int age = Integer.parseInt(args[2]);
        double grade = Double.parseDouble(args[3]);

        return new Student(name, age, grade);
    }

    private boolean contains(String name) {
        return this.studentsByName.containsKey(name);
    }

    public void addStudent(Student student) {
        if (!contains(student.getName())) {
            studentsByName.put(student.getName(), student);
        }
    }
}
