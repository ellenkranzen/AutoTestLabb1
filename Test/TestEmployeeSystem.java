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

    @Test
    //TODO lägg till DisplayName
    public void testRaiseIndSalary() {
        EmployeeSystem testSys = new EmployeeSystem();
        testSys.addEmployee(new Employee("Jonna Hagberg", 34, 50000.00));
        double expected = 55000.00;
        testSys.raiseIndSalary(0, 0.10);
        double actual = testSys.get(0).getSalary();
        Assertions.assertEquals(expected, actual);
        testSys.raiseIndSalary(0, 1.10);  //testar att höja med mer än 100%
        Assertions.assertEquals(expected, actual);    // säkerställer att lönen inte har ändrats
    }

    @Test
    //TODO lägg till DispLayName
    public void testRaiseAllSalary() {
        EmployeeSystem testSys = new EmployeeSystem();
        testSys.addEmployee(new Employee("Jonna Hagberg", 34, 50000.00));
        testSys.addEmployee(new Employee("Ellen Kranzén", 29, 45000.00));
        testSys.raiseAllSalary(0.05);
        double expectedEmp1 = 52500.00;
        double expectedEmp2 = 47250.00;
        double actualEmp1 = testSys.get(0).getSalary();
        double actualEmp2 = testSys.get(1).getSalary();
        Assertions.assertEquals(expectedEmp1, actualEmp1);
        Assertions.assertEquals(expectedEmp2, actualEmp2);
        testSys.raiseAllSalary(1.05);                       //testar att försöka höja med mer än 100%
        Assertions.assertEquals(expectedEmp1, actualEmp1);  //säkerställer att lönen inte har ändrats
        Assertions.assertEquals(expectedEmp2, actualEmp2);  // same
    }

}
