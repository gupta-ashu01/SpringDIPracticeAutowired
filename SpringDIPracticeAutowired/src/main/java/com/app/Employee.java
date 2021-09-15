package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Autowired
    private Address address;

    // Constructor injection
    /*    @Autowired
    public Employee(Address address) {
        this.address = address;
    }*/

    // Setter injection
    /*  @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }*/

    // Method injection
    /* @Autowired
    public void anyRandomMethod(Address address) {
        this.address = address;
    }*/

    public String getEmployeeAddress() {
        return this.address.getAddress();
    }
}
