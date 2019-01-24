package lesson5;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] arrEmpl = new Employee[5];
        arrEmpl[0] = new Employee("Ivanov Ivan", "engineer", "ivan.ivanov@gmail.com", "89274385847", 50000, 48);
        arrEmpl[1] = new Employee("Petrov Vadim", "CEO", "vadim.petrov@gmail.com", "89374562389", 100000, 42);
        arrEmpl[2] = new Employee("Kharitonov Alexandr", "IT manager", "alexandr.kharitonov@gmail.com", "89374527389", 80000, 35);
        arrEmpl[3] = new Employee("Sarbayeva Natalia", "bookkeeper", "natalia.sarbayeva@gmail.com", "89274562230", 80000, 37);
        arrEmpl[4] = new Employee("Kondratjev Vladislav", "project manager", "vladislav.kondratjev@gmail.com", "89373957089", 90000, 47);

        for (int i = 0; i < arrEmpl.length; i++) {
            if (arrEmpl[i].getAge() > 40) {
                arrEmpl[i].printEmployee();

//                ещё вариант реализации
//                System.out.println(arrEmpl[i].getFullName() + " | " + arrEmpl[i].getOccupation() + " | " + arrEmpl[i].getEmail() + " | " +
//                        arrEmpl[i].getPhonenumber() + " | " + arrEmpl[i].getSalary());
            }
        }
    }
}
