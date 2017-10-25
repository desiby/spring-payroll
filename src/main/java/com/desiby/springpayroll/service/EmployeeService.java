package com.desiby.springpayroll.service;

import com.desiby.springpayroll.model.Employee;

public interface EmployeeService {

    Iterable<Employee> findAllEmployees();
    Employee getEmployeeById(Long id);
    Employee saveEmployee(Employee employee);
    void deleteEmployee(Long id);
}
