package com.simitchiyski.interviewprep.designPatterns.structural.adapter;

public class EmployeeAdapterLdap implements Employee {

    private final EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    // Some people can think this is decorator
    @Override
    public String getEmail() {
        return instance.getMail();
    }

    public String toString() {
        return "ID: " + getId() + ", First name: " + getFirstName() + ", Last name: " + getLastName() + ", Email: " + getEmail();
    }
}
