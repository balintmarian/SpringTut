//package ro.jademy.springtut.models;
//
//import javax.persistence.*;
//import java.util.Objects;
//
//@Entity
//@Table(name = "DEPARTMENTS")
//public class DepartmentEmployee {
//    @EmbeddedId
//    private DepartmentsEmployeesId id;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @MapsId("empId")
//    private Employee employee;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @MapsId("deptId")
//    private Department departments;
//
//    public DepartmentEmployee(Employee employee, Department departments) {
//        this.employee = employee;
//        this.departments = departments;
//    }
//
//    public DepartmentsEmployeesId getId() {
//        return id;
//    }
//
//    public void setId(DepartmentsEmployeesId id) {
//        this.id = id;
//    }
//
//    public Employee getEmployee() {
//        return employee;
//    }
//
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }
//
//    public Department getDepartments() {
//        return departments;
//    }
//
//    public void setDepartments(Department departments) {
//        this.departments = departments;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        DepartmentEmployee that = (DepartmentEmployee) o;
//        return Objects.equals(employee, that.employee) &&
//                Objects.equals(departments, that.departments);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(employee, departments);
//    }
//}
