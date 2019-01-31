package ro.jademy.springtut.repository;

import org.springframework.data.repository.CrudRepository;
import ro.jademy.springtut.Employee;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,String> {
    List<Employee> findAll();


}

