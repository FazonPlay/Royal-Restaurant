import java.time.LocalTime;

public class Employee {
    private int idEmployee;
    private String name;
    private String surname;
    private String role;
    private LocalTime hireDate;
    private double salary;

    public Employee(int idEmployee, String name, String surname, String role, String hireDate, double salary) {
        this.idEmployee = idEmployee;
        this.name = name;
        this.surname = surname;
        this.role = role;
        this.hireDate = LocalTime.parse(hireDate);
        this.salary = salary;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getRole() {
        return role;
    }

    public LocalTime getHireDate() {
        return hireDate;
    }

    public double getSalary() {
        return salary;
    }


    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = LocalTime.parse(hireDate);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", role='" + role + '\'' +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                '}';
    }
}



