/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevni.utility;

/**
 *
 * @author Admin
 */
public interface Sender {
    public boolean send(String number,String data)throws Exception;
}
