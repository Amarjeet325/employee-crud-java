package com.example.employeecrud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeecrudApplication {

    public static void main(String[] args) {
      
        System.out.println("   Backend Server Running on Port 8080");

        SpringApplication.run(EmployeecrudApplication.class, args);
    }
}
