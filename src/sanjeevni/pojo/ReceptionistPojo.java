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
public class ReceptionistPojo {

    public ReceptionistPojo(String recepId, String recepName, String gender) {
        this.recepId = recepId;
        this.recepName = recepName;
        this.gender = gender;
    }
    public ReceptionistPojo(){
    
    }
    public String getRecepId() {
        return recepId;
    }

    public void setRecepId(String recepId) {
        this.recepId = recepId;
    }

    public String getRecepName() {
        return recepName;
    }

    public void setRecepName(String recepName) {
        this.recepName = recepName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "{" + "recepId=" + recepId + ", recepName=" + recepName + ", gender=" + gender + '}';
    }
    private String recepId;
    private String recepName;
    private String gender;
}
