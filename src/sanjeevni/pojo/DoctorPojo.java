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
public class DoctorPojo {
    public DoctorPojo(){
        
    }
    public DoctorPojo(String doctorId, String doctorName, String emailId, String contactNo, String qualification, String gender, String specialist) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.emailId = emailId;
        this.contactNo = contactNo;
        this.qualification = qualification;
        this.gender = gender;
        this.specialist = specialist;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    @Override
    public String toString() {
        return "DoctorPojo{" + "doctorId=" + doctorId + ", doctorName=" + doctorName + ", emailId=" + emailId + ", contactNo=" + contactNo + ", qualification=" + qualification + ", gender=" + gender + ", specialist=" + specialist + '}';
    }
    
    private String doctorId;
    private String doctorName;
    private String emailId;
    private String contactNo;
    private String qualification;
    private String gender;
    private String specialist;
}
