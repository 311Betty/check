import static sun.java2d.cmm.ColorTransform.In;

/**
 * @program: check
 * @description: Employee
 * @author: 白靖
 * * @create: 2019-11-06 20:50
 **/
public class Employee {
    public String name;
    private int salary;
    protected int age;

    public Employee(String name) {
        this.name = name;
    }
    public int setSalary(int setSalary){
        salary=setSalary;
        return salary;
    }
    public void getMessage(){
        System.out.println("姓名： "+name);
        System.out.println("薪水： "+salary);
    }
    public static void main(String[] args) {
        Employee employee = new Employee("tommy");
        employee.setSalary(100);
        employee.getMessage();

    }
}
