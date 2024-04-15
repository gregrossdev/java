package main.problem_solving.intermediate.cli_programs.pet_crm.crm;

import java.util.Map;

public interface Billable {

    double getBalanceDue(Map<String, Double> servicesRendered);

}
