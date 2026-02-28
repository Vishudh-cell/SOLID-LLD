class Employee {
    String name;
    int id;
    private int salary;

    Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public int getSalary() {
        if(salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class encapsulation {
    public static void main(String[] args) {

        Employee emp = new Employee("John Doe", 123, 50000);
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}