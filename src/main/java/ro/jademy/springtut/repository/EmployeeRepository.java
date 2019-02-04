package ro.jademy.springtut.repository;

import org.springframework.data.repository.CrudRepository;
import ro.jademy.springtut.models.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
    @Override
    List<Employee> findAll();

}

