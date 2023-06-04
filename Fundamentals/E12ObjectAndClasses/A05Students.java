package E12ObjectAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A05Students {

    static class Student {
        private String firstName;
        private String secondName;
        private int age;
        private String city;

        public Student() {
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getSecondName() {
            return secondName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        List<Student> students = new ArrayList<>();

        while (!("end").equalsIgnoreCase(input)) {
            String[] studentLine = input.split(" ");

            String firstName = studentLine[0];
            String secondName = studentLine[1];
            int age = Integer.parseInt(studentLine[2]);
            String city = studentLine[3];

            Student student = new Student();
            student.setFirstName(firstName);
            student.setSecondName(secondName);
            student.setAge(age);
            student.setCity(city);

            students.add(student);
            input = scan.nextLine();
        }
        String fromCity = scan.nextLine();

        for(Student student : students){
            if (fromCity.equalsIgnoreCase(student.city)){
                System.out.printf("%s %s is %d years old%n",student.getFirstName(),student.getSecondName(),student.getAge());
            }
        }
    }
}
