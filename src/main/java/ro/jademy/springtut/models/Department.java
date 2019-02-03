package ro.jademy.springtut.models;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "DEPARTMENTS")
public class Department {
    @Id
    @GeneratedValue
    @Column(name="DEPT_NO")
    private String id;
    @Column(name="DEPT_NAME")
    private String name;

    @ManyToMany(mappedBy = "departmentSet")
    private Set<Employee> employees = new HashSet<>();



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department() {
    }

    public Department(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Department(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
