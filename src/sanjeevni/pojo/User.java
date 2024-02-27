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
public class User {

    public String getLoginId() {
        return LoginId;
    }

    public void setLoginId(String LoginId) {
        this.LoginId = LoginId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getLoginType() {
        return LoginType;
    }

    public void setLoginType(String UserType) {
        this.LoginType = UserType;
    }
    private String LoginId;
    private String Password;
    private String LoginType;
    
}
