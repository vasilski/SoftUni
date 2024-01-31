package A03Encapsulation.E03ValidationData;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.trim().length() < 3) {
            throw new IllegalStateException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.trim().length() < 3) {
            throw new IllegalStateException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalStateException("Age cannot be zero or negative integer.");
        }
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalStateException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void increaseSalary(double bonus) {
        if (this.getAge() < 30) {
            this.salary = this.salary * (1 + bonus / 200);
        } else {
            this.salary = this.salary * (1 + bonus / 100);
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %f leva",
                getFirstName(),
                getLastName(),
                getSalary());
    }
}
