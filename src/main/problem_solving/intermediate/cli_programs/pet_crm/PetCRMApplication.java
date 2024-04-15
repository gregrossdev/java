package main.problem_solving.intermediate.cli_programs.pet_crm;

import main.problem_solving.intermediate.cli_programs.pet_crm.crm.Pet;
import main.problem_solving.intermediate.cli_programs.pet_crm.crm.hr.Department;
import main.problem_solving.intermediate.cli_programs.pet_crm.crm.hr.people.CustomerPerson;
import main.problem_solving.intermediate.cli_programs.pet_crm.crm.hr.people.Employee;
import main.problem_solving.intermediate.cli_programs.pet_crm.crm.hr.people.ManagerEmployee;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class PetCRMApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a pet
        System.out.println("Enter pet name:");
        String petName = scanner.nextLine();
        System.out.println("Enter pet species:");
        String petSpecies = scanner.nextLine();
        Pet pet = new Pet(petName, petSpecies);

        // Create a department
        System.out.println("Enter department name:");
        String departmentName = scanner.nextLine();
        Department department = new Department(departmentName);

        // Create a manager
        System.out.println("Enter manager's first name:");
        String managerFirstName = scanner.nextLine();
        System.out.println("Enter manager's last name:");
        String managerLastName = scanner.nextLine();
        System.out.println("Enter manager's title:");
        String managerTitle = scanner.nextLine();
        double managerSalary = 0;
        while (true) {
            System.out.println("Enter manager's salary:");
            try {
                managerSalary = scanner.nextDouble();
                break; // will only reach this line if input was a double, breaking the loop
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric value for the salary.");
                scanner.next(); // discard the invalid input
            }
        }
        scanner.nextLine(); // consume newline left-over
        ManagerEmployee manager = new ManagerEmployee(managerFirstName, managerLastName, managerTitle, managerSalary, department);

        // Print the details of the manager
        System.out.println("Manager Details:");
        System.out.println("First Name: " + manager.getFirstName() + ", Last Name: " + manager.getLastName() + ", Title: " + manager.getTitle() + ", Salary: " + manager.getSalary() + ", Department: " + manager.getDepartment().getDepartmentName());

        department.setDepartmentHead(manager);

        // Hire an employee
        System.out.println("Enter employee's first name:");
        String employeeFirstName = scanner.nextLine();
        System.out.println("Enter employee's last name:");
        String employeeLastName = scanner.nextLine();
        System.out.println("Enter employee's title:");
        String employeeTitle = scanner.nextLine();
        double employeeSalary = 0;
        while (true) {
            System.out.println("Enter employee's salary:");
            try {
                employeeSalary = scanner.nextDouble();
                break; // will only reach this line if input was a double, breaking the loop
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric value for the salary.");
                scanner.next(); // discard the invalid input
            }
        }
        scanner.nextLine(); // consume newline left-over
        Employee employee = manager.hireEmployee(employeeFirstName, employeeLastName, employeeTitle, employeeSalary);
        // Print the details of the employee
        System.out.println("Employee Details:");
        System.out.println("First Name: " + employee.getFirstName() + ", Last Name: " + employee.getLastName() + ", Title: " + employee.getTitle() + ", Salary: " + employee.getSalary() + ", Department: " + employee.getDepartment().getDepartmentName());

        // Transfer the employee to the department
        department.transferEmployeeIn(employee);

        // Create a customer
        System.out.println("Enter customer's first name:");
        String customerFirstName = scanner.nextLine();
        System.out.println("Enter customer's last name:");
        String customerLastName = scanner.nextLine();
        System.out.println("Enter customer's phone number:");
        String customerPhoneNumber = scanner.nextLine();
        CustomerPerson customer = new CustomerPerson(customerFirstName, customerLastName, customerPhoneNumber);

        // Print the details of the customer
        System.out.println("Customer Details:");
        System.out.println("First Name: " + customer.getFirstName() + ", Last Name: " + customer.getLastName() + ", Phone Number: " + customerPhoneNumber);

        // Add services rendered
        Map<String, Double> servicesRendered = new HashMap<>();
        System.out.println("Enter service name:");
        String serviceName = scanner.nextLine();
        System.out.println("Enter service cost:");
        double serviceCost = scanner.nextDouble();
        scanner.nextLine(); // consume newline left-over
        servicesRendered.put(serviceName, serviceCost);

        // Print the details of the services rendered
        System.out.println("Service Details:");
        System.out.println("Service Name: " + serviceName + ", Service Cost: " + serviceCost);

        // Calculate balance due
        double balanceDue = customer.getBalanceDue(servicesRendered);

        // Print the balance due
        System.out.println("Balance due: " + balanceDue);

        scanner.close();
    }
}