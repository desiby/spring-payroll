package com.desiby.springpayroll;

import com.desiby.springpayroll.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
