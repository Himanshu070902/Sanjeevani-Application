

package sanjeevni.utility;

import java.util.Base64;

public class PasswordEncryption {
    public static void main(String [] args){
        Base64.Encoder en=Base64.getEncoder();
        String pwd="Admin";
        byte []arr=pwd.getBytes();
        String encPwd=en.encodeToString(arr);//encodeToString method of encoder used to conver string into encoded form
        System.out.println("Original string:"+pwd);
        System.out.println("Encrypted string:"+encPwd);
    }
    public static String getEncryptedPassword(String password){
        Base64.Encoder encoder=Base64.getEncoder();//Base64 contain inner class called Encoder therefore Base64.Encoder class
        return encoder.encodeToString(password.getBytes());//getBytes() is method of string class which convert string int char arr bytes 
}
}

