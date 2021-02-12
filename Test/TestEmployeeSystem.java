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
}
