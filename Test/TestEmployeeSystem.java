import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestEmployeeSystem {


    /*@Test
    public void testCreateArrayList() {
        EmployeeSystem testObject = new EmployeeSystem();
        testObject.createArrayList();
    }*/

    /*@Test
    public void testAddEmployee() {
        EmployeeSystem testObject = new EmployeeSystem();
        Employee testPerson = new Employee("Ellen Kranzén", 29, 30000.00);
        testObject.employeeList.add(testPerson);
        Employee expected = testPerson;
        Employee actual = testObject.employeeList.get(0);
        Assertions.assertEquals(expected, actual);
        Employee testPerson2 = new Employee("Jonna Hagberg", 34, 40000.00);
        testObject.employeeList.add(testPerson2);
        Employee expected2 = testPerson2;
        Employee actual2 = testObject.employeeList.get(1);
        Assertions.assertEquals(expected2, actual2);
    }*/

    @Test
    public void testGetList() {
        EmployeeSystem testObject = new EmployeeSystem();
        ArrayList<Employee> allEmployees = testObject.getList();
        Assertions.assertTrue(allEmployees.isEmpty());
    }

    @Test
    public void testAdd() {
        EmployeeSystem testObject = new EmployeeSystem();
        testObject.addEmployee(new Employee("Jonna Hagberg", 34, 50000.00));
        Assertions.assertTrue(testObject.getList().size() == 1);
    }

    @Test
    public void testDelete() {
        EmployeeSystem testObject = new EmployeeSystem();
        testObject.addEmployee(new Employee("Jonna Hagberg", 34, 50000.00));
        testObject.deleteEmployee(0);
        Assertions.assertTrue(testObject.getList().size() == 0);
    }
}
