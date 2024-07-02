package live_exam;

public class question_1 {
    public static void main(String[] args) {
        //Employee objects...using constructor to set the employee info
        Employee employee_1 = new Employee(1, "Ayman", 75000.00);
        Employee employee_2 = new Employee(2, "Ahmad", 82000.00);
        
        // accessing the information through getter method
        System.out.println("Employee ID: " + employee_1.getEmployeeId());
        System.out.println("Employee Name: " + employee_1.getEmployeeName());
        System.out.println("Employee Salary: $" + employee_1.getEmployeeSalary());

        System.out.println("Employee ID: " + employee_2.getEmployeeId());
        System.out.println("Employee Name: " + employee_2.getEmployeeName());
        System.out.println("Employee Salary: " + employee_2.getEmployeeSalary()+" BDT");

        // using setter method to modify the employee info
        employee_1.setEmployeeId(3);
        employee_1.setEmployeeName("Alice Smith");

        // Accessing employee details through getter method
        System.out.println("Modified Employee ID: " + employee_1.getEmployeeId());
        System.out.println("Modified Employee Name: " + employee_1.getEmployeeName());
        System.out.println("Employee Salary: " + employee_1.getEmployeeSalary()+"BDT");
    }
}

 class Employee {
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    public Employee(int id, String name, double salary) {
        this.employee_id = id;
        this.employee_name = name;
        this.employee_salary = salary;
    }

    public int getEmployeeId() {
        return employee_id;
    }

    public void setEmployeeId(int employee_id) {
        this.employee_id = employee_id;
    }
    public String getEmployeeName() {
        return employee_name;
    }

    public void setEmployeeName(String employee_name) {
        this.employee_name = employee_name;
    }
    public String getEmployeeSalary() {
        return String.format("%.2f", employee_salary);
    }
}

