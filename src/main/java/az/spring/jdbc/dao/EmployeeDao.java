package az.spring.jdbc.dao;

import az.spring.jdbc.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface EmployeeDao {

    void insert(Employee employee);

    void update(Employee employee);

    void delete(int id);

    Employee getEmployeeById(int id);

    List<Employee> getAllEmployee();

    long count();

}
