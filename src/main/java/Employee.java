public class Employee {
    private String name;
    private int age;
    private double salary;
    private static int noOfEmployees = 0;
    private int employeeID;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        noOfEmployees++;
        this.employeeID = noOfEmployees;
    }

    public Employee() {

    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary; 
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double raiseSalary(double raise) {
        if(raise <= 0) {
            return salary;
        } else {
            double newSalary = salary + (raise/100*salary);
            setSalary(newSalary);
            return getSalary();
        }
    }
}
