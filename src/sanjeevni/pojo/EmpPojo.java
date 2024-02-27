/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevni.pojo;

/**
 *
 * @author Admin
 */
public class EmpPojo {

    @Override
    public String toString() {
        return  "empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empSal=" + empSal;
    }
    public EmpPojo(String empId, String empName, String empDept, double empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empDept = empDept;
        this.empSal = empSal;
    }
    public EmpPojo(){
        
    }
    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(double empSal) {
        this.empSal = empSal;
    }
   private String empId;
   private String empName;
   private String empDept;
   private double empSal;
}


