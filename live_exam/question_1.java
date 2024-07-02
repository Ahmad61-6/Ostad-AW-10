package live_exam;

public class question_1 {
    public static void main(String[] args) {
        Employee emp_1 = new Employee();

        emp_1.setEmployee_id("1111");
        emp_1.setEmployee_name("Ayman");
        
        emp_1.showEmployeeInfo();
    }
}

class Employee{
    private String employee_id;
    private String employee_name;
    private double employee_salary = 750000.00;

    public String getEmployee_id() {
        return employee_id;
    }
    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }
    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_salary() {
        return String.format("%.2f",employee_salary);
    }
public void showEmployeeInfo(){
    System.out.println("Employee_id: "+getEmployee_id());
    System.out.println("Employee_name: "+getEmployee_name());
    System.out.println("Employee_salary: "+ getEmployee_salary());
}
    
}
