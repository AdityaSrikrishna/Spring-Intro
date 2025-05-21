package net.javaguides.springboot;

import net.javaguides.springboot.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeBeanApplication implements CommandLineRunner {

    @Autowired
    private ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(EmployeeBeanApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Retrieve the Employee bean from the application context
        Employee employee = applicationContext.getBean(Employee.class);

        // Display Employee and Department info
        employee.displayEmployeeInfo();
    }
}
