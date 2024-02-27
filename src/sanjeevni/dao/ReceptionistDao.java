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
import java.util.ArrayList;
import java.util.List;
import sanjeevni.dbutil.DBconnection;
import sanjeevni.pojo.ReceptionistPojo;

/**
 *
 * @author Admin
 */
public class ReceptionistDao {
     public static void updateName(String currName,String newName)throws SQLException{
     Connection conn=DBconnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update Receptionists set receptionist_name=? where receptionist_name=?");
     ps.setString(1,newName);
     ps.setString(2,currName);
     ps.executeUpdate();
    }
      public static String generateId()throws SQLException{
          Connection conn=DBconnection.getConnection();
          Statement st=conn.createStatement();
          ResultSet rs=st.executeQuery("select max(Receptionist_id) from Receptionists");
          rs.next();
          String Id=rs.getString(1);
          int recepId=101;
          if(Id!=null){
              Id=Id.substring(1);
              recepId=Integer.parseInt(Id)+1;
          }
          return "R"+recepId; 
      }  
    
      public static boolean addRecep(ReceptionistPojo recep)throws SQLException{
          Connection conn=DBconnection.getConnection();
          PreparedStatement ps=conn.prepareStatement("insert into receptionists values(?,?,?)");
          ps.setString(1,recep.getRecepId());
          ps.setString(2,recep.getRecepName());
          ps.setString(3,recep.getGender());
          return ps.executeUpdate()==1;
      }
      public static List<String> getRecepId()throws SQLException{
          Connection conn=DBconnection.getConnection();
          Statement st=conn.createStatement();
          ResultSet rs=st.executeQuery("select receptionist_id from receptionists order by receptionist_id ");
          List<String> recepIdList=new ArrayList<>();
          while(rs.next()){
              recepIdList.add(rs.getString(1));
          }
          return recepIdList;
      }
      public static boolean deleteRecepById(String recepId)throws SQLException{
          Connection conn=DBconnection.getConnection();
          PreparedStatement ps=conn.prepareStatement("select receptionist_name from receptionists where receptionist_id=?");
          ps.setString(1,recepId);
          ResultSet rs=ps.executeQuery();
          rs.next();
          String recepName=rs.getString(1);
          ps=conn.prepareStatement("delete from receptionists where receptionist_name=?");
          UserDao.deleteUserByName(recepName);
          ps.setString(1, recepName);
          return ps.executeUpdate()==1; 
      }
      public static ReceptionistPojo getAllRecepDetails(String recepId)throws SQLException{
          ReceptionistPojo recep=new ReceptionistPojo();
          Connection conn=DBconnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("select * from receptionists where receptionist_id=?");
         ps.setString(1,recepId); 
         ResultSet rs=ps.executeQuery();
         rs.next();
         recep.setRecepName(rs.getString(2));
         recep.setRecepId(rs.getString(1));
         recep.setGender(rs.getString(3));
         return recep;
      }
      public static List<ReceptionistPojo> getAllRecepDetails()throws SQLException{
          Connection conn=DBconnection.getConnection();
          Statement st=conn.createStatement();
          ResultSet rs=st.executeQuery("select * from receptionists order by receptionist_id");
          List<ReceptionistPojo> recepList=new ArrayList<>();
             ReceptionistPojo recep;
          while(rs.next()){
              recep=new ReceptionistPojo();
              recep.setRecepName(rs.getString("Receptionist_Name"));
              recep.setRecepId(rs.getString("Receptionist_id"));
              recep.setGender(rs.getString("Gender"));
              recepList.add(recep);
          }
          return recepList;
      }
}
