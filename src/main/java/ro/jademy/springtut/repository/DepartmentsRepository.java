package ro.jademy.springtut.repository;

import org.springframework.data.repository.CrudRepository;
import ro.jademy.springtut.models.Department;
import ro.jademy.springtut.models.Employee;

import java.util.List;

public interface DepartmentsRepository extends CrudRepository<Department,String> {
    List<Department> findAll();
}
