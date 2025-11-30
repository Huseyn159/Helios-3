package MentorLessons_3_4.Employee;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public interface EmployeeHandler {

    void processEmployee(List<Employee> a, Predicate<Employee> p, Consumer<Employee> c);
}
