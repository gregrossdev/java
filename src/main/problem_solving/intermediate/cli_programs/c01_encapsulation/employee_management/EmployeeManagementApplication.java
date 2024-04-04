package main.problem_solving.intermediate.cli_programs.c01_encapsulation.employee_management;

import main.problem_solving.intermediate.cli_programs.c01_encapsulation.employee_management.pojo.Department;
import main.problem_solving.intermediate.cli_programs.c01_encapsulation.employee_management.pojo.Employee;
import main.problem_solving.intermediate.cli_programs.c01_encapsulation.employee_management.pojo.Project;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeManagementApplication {

    private final List<Employee> employees = new ArrayList<>();
    private final List<Department> departments = new ArrayList<>();
    private final Map<String, Project> projects = new HashMap<>();

//  EMPLOYEES
//  ------------------------------------------------

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {
//        Department engineering = departments.get(2);
//        Department marketing = departments.get(0);


        Department engineering = getDepartmentByName("Engineering");
        Department marketing = getDepartmentByName("Marketing");


        // Employee #1 - using no args constructor
        Employee dean = new Employee();
        dean.setEmployeeId(1);
        dean.setFirstName("Dean");
        dean.setLastName("Johnson");
        dean.setEmail("djohnson@teams.com");
        dean.setSalary(Employee.DEFAULT_STARTING_SALARY);
        dean.setDepartment(engineering);
        dean.setHireDate("08/21/2020");

        // Employee #2 - using all args constructor
        Employee angie = new Employee(2, "Angie", "Smith", "asmith@teams.com", engineering, "08/21/2020");
        // Employee #3 - using all args constructor
        Employee margaret = new Employee(3, "Margaret", "Thompson", "mthompson@teams.com", marketing, "08/21/2020");

        employees.add(dean);
        employees.add(angie);
        employees.add(margaret);
    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        for (Employee employee : employees) {
            System.out.println(employee.getFullName() + " (" + currency.format(employee.getSalary()) + ") " + employee.getDepartment().getName());
        }
    }

//  DEPARTMENTS
//  ------------------------------------------------

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {
        Department marketing = new Department(1, "Marketing");
        Department sales = new Department(2, "Sales");
        Department engineering = new Department(3, "Engineering");

        departments.add(marketing);
        departments.add(sales);
        departments.add(engineering);
    }

    private Department getDepartmentByName(String departmentName) {
        for (Department department : departments)
            if (department.getName().equals(departmentName))
                return department;

        return null;
    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        for(Department department : departments)
            System.out.println(department.getName());
    }

//  PROJECTS
//  ------------------------------------------------

    /**
     * Create the engineering project.
     */
    private void createEngineeringProject() {
        // Project #1 - Engineering Project Management
        Project engineering = new Project("Top Secret Project", "Project Management Software", "10/10/2020", "11/10/2020");

        // add all employees where department is engineering to the engineering project
        List<Employee> engineeringTeam = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getDepartment().getName().equals("Engineering")) {
                engineeringTeam.add(employee);
            }
        }
        engineering.setTeamMembers(engineeringTeam);

        // the key should be the name of the project
        projects.put(engineering.getName(), engineering);
    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createMarketingProject() {
        // Project #2 - Marketing Landing Page
        Project marketing = new Project("Marketing Landing Page Project",
                "Lead Capture Landing Page for Marketing",
                "10/10/2020",
                "10/17/2020");


        // add all employees where department is marketing to the landing page project
        List<Employee> marketingTeam = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getDepartment().getName().equals("Marketing")) {
                marketingTeam.add(employee);
            }
        }
        marketing.setTeamMembers(marketingTeam);

        projects.put(marketing.getName(), marketing);
    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");
        for (Map.Entry<String, Project> project : projects.entrySet()) {
            System.out.println(project.getValue().getName() + ": " + project.getValue().getTeamMembers().size());
        }
    }


//  APPLICATION RUN
//  ------------------------------------------------

    /**
     * The main entry point in the application
     */
    public static void main(String[] args) {
        EmployeeManagementApplication app = new EmployeeManagementApplication();
        app.run();
    }

    private void run() {

        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // give GREG a 10% raise, she is doing a great job!
        Employee greg = employees.get(1);
        greg.raiseSalary(10);

        // print all employees
        printEmployees();

        // create the engineering project
        createEngineeringProject();
        // create the Marketing Landing Page Project
        createMarketingProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();

    }


}
