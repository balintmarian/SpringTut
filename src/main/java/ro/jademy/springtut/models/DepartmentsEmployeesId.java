//package ro.jademy.springtut.models;
//
//import javax.persistence.Column;
//import javax.persistence.Embeddable;
//import java.io.Serializable;
//import java.util.Objects;
//
//@Embeddable
//public class DepartmentsEmployeesId implements Serializable {
//    @Column(name = "EMP_NO")
//    private long empId;
//    @Column(name = "DEPT_NO")
//    private long deptId;
//
//    public DepartmentsEmployeesId() {
//    }
//
//    public DepartmentsEmployeesId(long empId, long deptId) {
//        this.empId = empId;
//        this.deptId = deptId;
//    }
//
//    public long getEmpId() {
//        return empId;
//    }
//
//    public long getDeptId() {
//        return deptId;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        DepartmentsEmployeesId that = (DepartmentsEmployeesId) o;
//        return empId == that.empId &&
//                deptId == that.deptId;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(empId, deptId);
//    }
//}
