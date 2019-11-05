package com.simitchiyski.interviewprep.designPatterns.structural.adapter;

import org.junit.Test;

import java.util.List;

public class EmployeeClientTest {

    @Test
    public void getEmployeeList() {
        EmployeeClient client = new EmployeeClient();

        List<Employee> employees = client.getEmployeeList();

        System.out.println(employees);
    }
}