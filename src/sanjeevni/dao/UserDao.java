/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevni.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import sanjeevni.pojo.User;
import sanjeevni.dbutil.DBconnection;
import sanjeevni.pojo.UserPojo;
/**
 *
 * @author Admin
 */
public class UserDao {
    public static String validateUser(User user)throws SQLException{
     Connection conn=DBconnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("select user_name from users where login_id=? and password=? and user_type=?");
         ps.setString(1,user.getLoginId());
         ps.setString(2,user.getPassword());
         ps.setString(3, user.getLoginType());
         ResultSet rs=ps.executeQuery();// select query require executeQuery and non select require executeUpdate plus we require name so resultSet () method
         String name=null;
         if(rs.next()){
             name=rs.getString("user_name");//ya rs.getString(1);
         }
         return name;
    }
    public static void updateName(String currName,String newName)throws SQLException{
     Connection conn=DBconnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update users set user_name=? where user_name=?");
     ps.setString(1,newName);
     ps.setString(2,currName);
     ps.executeUpdate();
    }
   public static boolean updateDetails(UserPojo user) throws SQLException{
          Connection conn=DBconnection.getConnection();
          PreparedStatement ps=conn.prepareStatement("update users set login_id=?,password=? where user_name=?");
          ps.setString(1,user.getUserId());
          ps.setString(2,user.getPassword());
          ps.setString(3,user.getUserName());
          return ps.executeUpdate()==1;
      }
    public static boolean addUser(UserPojo user)throws SQLException{
         Connection conn=DBconnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("insert into users values(?,?,?,?)");
         ps.setString(1,user.getUserId());
         ps.setString(3,user.getPassword());
         ps.setString(4, user.getUserType());
         ps.setString(2,user.getUserName());
         return ps.executeUpdate()==1;
    }
     public static void deleteUserByName(String name)throws SQLException{
     Connection conn=DBconnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("delete from users where user_name=?");
     ps.setString(1,name);
     ps.executeUpdate();
    }
     public static UserPojo getDetailsByName(String name)throws SQLException{
         Connection conn=DBconnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("select * from users where user_name=?");
         ps.setString(1,name);
         ResultSet rs=ps.executeQuery();
         UserPojo user=new UserPojo();
         rs.next();
//         user.setUserId(rs.getString("Login_Id"));
         user.setPassword(rs.getString("Password"));
         user.setUserName(rs.getString("user_name"));
         user.setUserType(rs.getString("user_type"));
         return user;
     }
     
}
