package com.app;

import org.springframework.stereotype.Component;

@Component
public class CurrentAddress implements Address {

    public String getAddress() {
        return "This is the current address of employee";
    }

}
