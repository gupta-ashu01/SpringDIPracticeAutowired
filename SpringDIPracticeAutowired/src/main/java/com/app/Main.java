package com.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        // Loading the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieving the bean
        Employee employee = context.getBean("employee", Employee.class);

        // Calling methods on the bean
        System.out.println(employee.getEmployeeAddress());

        // Closing the context
        context.close();

    }
}
