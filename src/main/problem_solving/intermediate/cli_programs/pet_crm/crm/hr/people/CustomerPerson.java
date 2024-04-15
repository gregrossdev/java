package main.problem_solving.intermediate.cli_programs.pet_crm.crm.hr.people;

import main.problem_solving.intermediate.cli_programs.pet_crm.crm.Billable;
import main.problem_solving.intermediate.cli_programs.pet_crm.crm.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CustomerPerson extends Person implements Billable {

    private String phoneNumber;
    private List<Pet> pets = new ArrayList<Pet>();

    public CustomerPerson(String firstName, String lastName) {
        this(firstName,lastName,"");
    }

    public CustomerPerson(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;
    }

    public double getBalanceDue(Map<String, Double> servicesRendered) {
        double owes = 0.0;
        for(Map.Entry<String,Double> sr : servicesRendered.entrySet()) {
            owes += sr.getValue();
        }

        return owes;
    }
}
