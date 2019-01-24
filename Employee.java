package lesson5;


public class Employee {
    private String fullName;
    private String  occupation;
    private String email;
    private String phonenumber;
    private int salary;
    private int age;

    public  Employee (String fullName, String  occupation, String email, String phonenumber, int salary, int age) {
        this.fullName = fullName;
        this.occupation = occupation;
        this.email = email;
        this.phonenumber = phonenumber;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getEmail() {
        return email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void printEmployee () {
        System.out.println("ФИО: " + fullName + " | Должность: " + occupation + " | Email: " + email +" | Номер телефона: " + phonenumber +
                " | Зарплата: " + salary + " | Возраст: " + age);
    }

}
