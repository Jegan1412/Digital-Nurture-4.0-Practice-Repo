package com.cognizant.cognizant;

import com.cognizant.cognizant.model.Employee;
import com.cognizant.cognizant.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HibernateAndJpaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(HibernateAndJpaApplication.class, args);
		EmployeeService service = context.getBean(EmployeeService.class);
		service.addEmployee(new Employee(1, "Rox", "FSE", 100000));
	}

}
