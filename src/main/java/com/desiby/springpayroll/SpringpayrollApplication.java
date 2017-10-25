package com.desiby.springpayroll;

import com.desiby.springpayroll.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringpayrollApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringpayrollApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringpayrollApplication.class, args);

	}

	@Bean
	public CommandLineRunner loadData(EmployeeRepository employeeRepository){
		return (args)->{
			employeeRepository.save(new Employee("Jane","doe", 8000.00));
			employeeRepository.save(new Employee("John","doe", 10000.00));
			employeeRepository.save(new Employee("foo","bar", 7500.00));

			//fetch all
			log.info("Getting all employee...");
			for(Employee employee: employeeRepository.findAll()){
				log.info(employee.toString());
			}
		};
	}
}
