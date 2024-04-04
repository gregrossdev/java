package main.problem_solving.intermediate.exercises.e03_polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private String address;
    private String phoneNumber;
    private List<CustomerImpl> accounts = new ArrayList<>();

    public void addAccount(CustomerImpl account) {
        accounts.add(account);
    }

    public CustomerImpl[] getAccounts() {
        return accounts.toArray(new CustomerImpl[accounts.size()]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isVip() {
        int total = 0;
        for(CustomerImpl account : accounts) {
            total += account.getBalance();
        }
        return total >= 25000;
    }
}
