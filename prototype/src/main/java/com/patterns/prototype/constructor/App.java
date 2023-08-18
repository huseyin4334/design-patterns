package com.patterns.prototype.constructor;

import com.patterns.prototype.constructor.models.Address;
import com.patterns.prototype.constructor.models.Employee;

public class App {

    public static void main(String[] args) {
        Employee employee = new Employee("Huseyin", "Developer", new Address("Nerd", "Ist", "34678"));

        Employee newEmp = new Employee(employee);

        newEmp.getAddress().setCity("Ank");

        System.out.println(employee);
        System.out.println(newEmp);
    }
}
