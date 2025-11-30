package MentorLessons_3_4.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Huseyn","IT",23));
        employees.add(new Employee("Behruz","HR",18));
        employees.add(new Employee("Firuz","HR",52));
        employees.add(new Employee("Hesen","IT",19));

        Predicate<Employee> employeePredicate = a -> a.getAge() >20;
        Consumer<Employee> employeeConsumer = System.out::println;

        EmployeeHandler handler = (a, p, c) -> { for (Employee e : employees){
            if(employeePredicate.test(e)){
                employeeConsumer.accept(e);
            }
        }};

        handler.processEmployee(employees,employeePredicate,employeeConsumer);
    }
}
