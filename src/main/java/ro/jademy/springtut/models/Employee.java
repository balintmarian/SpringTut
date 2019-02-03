package ro.jademy.springtut.models;


import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "EMPLOYEES")
public class Employee {
    @Id
    @GeneratedValue//(strategy = GenerationType.AUTO)
    @Column(name = "EMP_NO")
    private int empNo;
    //@NaturalId
    @Column(name = "FIRST_NAME")
    private String firstName;
    //@NaturalId
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "HIRE_DATE")
    private Date hireDate;
    @Column(name = "BIRTH_DATE")
    private Date birthDate;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "DEPT_EMP",
            joinColumns = { @JoinColumn(name = "EMP_NO") },
            inverseJoinColumns = { @JoinColumn(name = "DEPT_NO") }
    )
    Set<Department> departmentSet = new HashSet<>();

    public Employee() {
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(int empNo, String firstName, String lastName, String gender) {
        this.empNo = empNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public Employee(int empNo, String firstName, String lastName, String gender, Date hireDate, Date birthDate) {
        this.empNo = empNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.hireDate = hireDate;
        this.birthDate = birthDate;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
