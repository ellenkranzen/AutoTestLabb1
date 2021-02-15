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

     public void raiseIndSalary(int index, double raise) {
          if(raise > 0 && raise < 100) {
               Employee emp = employeeList.get(index);
               double currentSal = emp.getSalary();
               double newSal = currentSal + currentSal*raise;
               emp.setSalary(newSal);
          }
     }

     public Employee get(int index) {
          return employeeList.get(index);
     }

     public void raiseAllSalary(double raise) {
          for(int i = 0; i < employeeList.size(); i++) {
               raiseIndSalary(i, raise);
          }
     }
}
