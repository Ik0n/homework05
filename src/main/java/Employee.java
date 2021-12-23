public class Employee {

    private String firstName;
    private String lastName;
    private String secondName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }

    Employee(String firstName, String lastName, String secondName, String position, String email, String phoneNumber, int salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    Employee(String firstName, String lastName, String secondName, String position, String email, String phoneNumber, int salary) {
        this(firstName, lastName, secondName, position, email, phoneNumber, salary, 18);
    }

    Employee(String firstName, String lastName, String secondName, String position, String email, String phoneNumber) {
        this(firstName, lastName, secondName, position, email, phoneNumber, 20000, 18);
    }

    Employee(String firstName, String lastName, String secondName, String position, String email) {
        this(firstName, lastName, secondName, position, email, "8-888-888-88-88", 20000, 18);
    }

    Employee(String firstName, String lastName, String secondName, String position) {
        this(firstName, lastName, secondName, position, "email@example.com", "8-888-888-88-88", 20000, 18);
    }

    Employee(String firstName, String lastName, String secondName) {
        this(firstName, lastName, secondName, "Программист", "email@example.com", "8-888-888-88-88", 20000, 18);
    }

    Employee(String firstName, String lastName) {
        this(firstName, lastName, "Петрович", "Программист", "email@example.com", "8-888-888-88-88", 20000, 18);
    }

    Employee(String firstName) {
        this(firstName, "Петров", "Петрович", "Программист", "email@example.com", "8-888-888-88-88", 20000, 18);
    }

    Employee() {
        this("Пётр", "Петров", "Петрович", "Программист", "email@example.com", "8-888-888-88-88", 20000, 18);
    }

    public void showInfo() {
        System.out.println(this.lastName + " " + this.firstName + " " + this.secondName);
        System.out.println("Должонсть: " + this.position);
        System.out.println("Email: " + this.email);
        System.out.println("Номер телефона: " + this.phoneNumber);
        System.out.println("Заработная плата: " + this.salary);
        System.out.println("Возраст: " + this.age);
    }



}
