import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestEmployee {

    @Test
    @DisplayName("Testar konstruktorn för Employee")
    public void testEmployeeConstructor () {
        Employee testObject = new Employee("Jonna Hagberg", 34, 40000.00);
        Employee testObject2 = new Employee("Jonna Hagberg", 34, 40000.00);
        String expectedName = "Jonna Hagberg";
        String actualName = testObject.getName();
        Assertions.assertEquals(expectedName, actualName);
        int expectedAge = 34;
        int actualAge = testObject.getAge();
        Assertions.assertEquals(expectedAge,actualAge);
        double expectedSalary = 40000.00;
        double actualSalary = testObject.getSalary();
        Assertions.assertEquals(expectedSalary, actualSalary);
        int expectedID = 1;
        int actualID = testObject.getEmployeeID();
        Assertions.assertEquals(expectedID, actualID);
        Assertions.assertNotEquals(testObject.getEmployeeID(), testObject2.getEmployeeID());
    }

    @Test
    @DisplayName("Testar setName() och getName()")
    public void testSetName() {
        Employee testObject = new Employee();
        testObject.setName("Jonna Hagberg");
        String expected = "Jonna Hagberg";
        String actual = testObject.getName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Testar setAge() och getAge()")
    public void testSetAge() {
        Employee testObject = new Employee();
        testObject.setAge(34);
        int expected = 34;
        int actual = testObject.getAge();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Testar setSalary() och getSalary()")
    public void testSetSalary() {
        Employee testObject = new Employee();
        testObject.setSalary(50000.00);
        double expected = 50000.00;
        double actual = testObject.getSalary();
        Assertions.assertEquals(expected, actual);
    }

    // VG Uppgifter - Jonna

    @Test
    public void testRaiseSalary() {
        Employee testObject = new Employee("Jonna Hagberg", 34, 40000.00);
        testObject.raiseSalary(5);
        double expected = 42000;
        double actual = testObject.getSalary();
        Assertions.assertEquals(expected,actual);
    }

}
