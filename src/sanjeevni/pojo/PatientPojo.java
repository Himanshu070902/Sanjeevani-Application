/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevni.pojo;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class PatientPojo {
    public PatientPojo(){
        
    }
    public PatientPojo(String patientId, String firstName, String lastName, int age, String gender, String mStatus, String address, String city, String mobileNo, Date pDate, int otp, String opd, String doctorId, String status) {
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.mStatus = mStatus;
        this.address = address;
        this.city = city;
        this.mobileNo = mobileNo;
        this.pDate = pDate;
        this.otp = otp;
        this.opd = opd;
        this.doctorId = doctorId;
        this.status = status;
    }

    @Override
    public String toString() {
        return "PatientPojo{" + "patientId=" + patientId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender=" + gender + ", mStatus=" + mStatus + ", address=" + address + ", city=" + city + ", mobileNo=" + mobileNo + ", pDate=" + pDate + ", otp=" + otp + ", opd=" + opd + ", doctorId=" + doctorId + ", status=" + status + '}';
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getmStatus() {
        return mStatus;
    }

    public void setmStatus(String mStatus) {
        this.mStatus = mStatus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Date getpDate() {
        return pDate;
    }

    public void setpDate(Date pDate) {
        this.pDate = pDate;
    }

    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }

    public String getOpd() {
        return opd;
    }

    public void setOpd(String opd) {
        this.opd = opd;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    private String patientId;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String mStatus;
    private String address;
    private String city;
    private String mobileNo;
    private Date pDate;
    private int otp;
    private String opd;
    private String doctorId;
    private String status;
}
