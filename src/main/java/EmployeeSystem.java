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

     public double raiseSalaryAll(double raise) {
          int i = 0;
          employeeList.get(i);
          if(raise <= 0) {

               for(i = 0; i >= 0; i++) {

               }
          }

     }
}

/*
     double newSalary = salary + (raise/100*salary);
     setSalary(newSalary);
            return getSalary();

 */