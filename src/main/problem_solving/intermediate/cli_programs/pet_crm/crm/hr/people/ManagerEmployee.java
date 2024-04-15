package main.problem_solving.intermediate.cli_programs.pet_crm.crm.hr.people;


import main.problem_solving.intermediate.cli_programs.pet_crm.crm.hr.Department;

public class ManagerEmployee extends Employee {

    public ManagerEmployee(String firstName, String lastName, String title, double salary, Department department) {
        super(firstName, lastName, title, salary);
        setDepartment(department); // Set the department when creating the ManagerEmployee
    }

    public Employee hireEmployee(String first, String last, String title, double salary) {
        Employee newEmployee = new Employee(first,last,title,salary);
        newEmployee.setEmail( first.substring(0,1).toLowerCase() + last.toLowerCase() + "@petelevator.com");
        newEmployee.setDepartment(this.getDepartment());
        newEmployee.getDepartment().getDepartmentEmployees().add(newEmployee);

        return newEmployee;
    }
}