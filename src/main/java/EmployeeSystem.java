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

     public void raiseSalaryAll(double raise) {
          ArrayList<Employee> list = getList();
          if(raise > 0 && raise < 100) {
               for(int i = 0; i < list.size(); i++) {
                    double employeeSalary = list.get(i).getSalary();
                    double newSalary = employeeSalary + (raise/100*employeeSalary);
                    list.get(i).setSalary(newSalary);
               }
          }
     }

     public void raiseSalaryEmployee(int empID, double raise) {
          ArrayList<Employee> list = getList();
          if(raise > 0 && raise < 100) {
               for(int i = 0; i < list.size(); i++) {
                    empID = list.get(i).getEmployeeID();
                    raiseSalaryAll(raise);
               }
          }
     }
}
