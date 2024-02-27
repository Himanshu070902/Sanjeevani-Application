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
public class AppointmentPojo {
    public AppointmentPojo(){
        
    }
    public AppointmentPojo(String patientId, String patientName, String status, String opd, String dateTime, String doctorName, String mobileNo) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.status = status;
        this.opd = opd;
        this.dateTime = dateTime;
        this.doctorName = doctorName;
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "AppointmentPojo{" + "patientId=" + patientId + ", patientName=" + patientName + ", status=" + status + ", opd=" + opd + ", dateTime=" + dateTime + ", doctorName=" + doctorName + ", mobileNo=" + mobileNo + '}';
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOpd() {
        return opd;
    }

    public void setOpd(String opd) {
        this.opd = opd;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    private String patientId;
    private String patientName;
    private String status;
    private String opd;
    private String dateTime;
    private String doctorName;
    private String mobileNo;
}
