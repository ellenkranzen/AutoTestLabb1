import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestEmployeeSystem {

    @Test
    @DisplayName("Testar hämta ArrayList()")
    public void testGetList() {
        EmployeeSystem testObject = new EmployeeSystem();
        ArrayList<Employee> allEmployees = testObject.getList();
        Assertions.assertTrue(allEmployees.isEmpty());
    }

    @Test
    @DisplayName("Testar lägga till en employee")
    public void testAdd() {
        EmployeeSystem testObject = new EmployeeSystem();
        testObject.addEmployee(new Employee("Jonna Hagberg", 34, 50000.00));
        Assertions.assertTrue(testObject.getList().size() == 1);
    }

    @Test
    @DisplayName("Testar att ta bort en employee")
    public void testDelete() {
        EmployeeSystem testObject = new EmployeeSystem();
        testObject.addEmployee(new Employee("Jonna Hagberg", 34, 50000.00));
        testObject.deleteEmployee(0);
        Assertions.assertTrue(testObject.getList().size() == 0);
    }

    // VG Uppgifter - Jonna

    @Test
    @DisplayName("Testar att höja lönen för alla anställda")
    public void testRaiseSalaryAll() {
        EmployeeSystem testObject = new EmployeeSystem();
        testObject.addEmployee(new Employee("Jonna Hagberg", 34, 50000.00));
        testObject.addEmployee(new Employee("Ellen Kranzén", 30, 70000.00));
        testObject.raiseSalaryAll(50);
        double expected1 = 75000.00;
        double expected2 = 105000.00;
        double actual1 = testObject.getList().get(0).getSalary();
        double actual2 = testObject.getList().get(1).getSalary();
        Assertions.assertEquals(expected1,actual1);
        Assertions.assertEquals(expected2,actual2);

    }

    @Test
    @DisplayName("Testar att höja lönen för en specifik anställd")
    public void testRaiseSalaryEmployee() {
        EmployeeSystem testObject = new EmployeeSystem();
        testObject.addEmployee(new Employee("Vincent Adler", 28, 60000.00));
        testObject.raiseSalaryEmployee(0, 50);
        double expected = 90000.00;
        double actual = testObject.getList().get(0).getSalary();
        Assertions.assertEquals(expected,actual);
    }


}
