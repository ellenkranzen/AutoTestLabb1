import java.util.ArrayList;

public class EmployeeSystem {
     private ArrayList<Employee> employeeList = new ArrayList<Employee>();

     public ArrayList<Employee> getList() {
          return employeeList;
     }

     public void addEmployee(Employee employee) {
          employeeList.add(employee);
     }

     public void deleteEmployee(int place) {
          employeeList.remove(place);
     }
}
