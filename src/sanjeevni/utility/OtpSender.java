
package sanjeevni.utility;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;


public class OtpSender implements Sender {
    @Override
    public boolean send(String number,String data)throws UnirestException{
           Unirest.setTimeouts(0,0);
           String mobNo=number;
           System.out.println(mobNo);
           int otp=Integer.parseInt(data);
           System.out.println("otp is-"+otp);
           String url= " https://2factor.in/API/V1/e3d48bb8-c35a-11ed-81b6-0200cd936042 " + mobNo + "/" +otp+ " /OTP1 ";
          
           GetRequest gr=Unirest.get(url);
           HttpResponse<String>response=gr.asString();
           String result=response.getBody();
           System.out.println("result-"+result);
           return result.contains("Success");
    }
    
}
