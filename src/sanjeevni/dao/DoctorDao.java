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
import sanjeevni.pojo.DoctorPojo;

public class DoctorDao {
  public static void updateName(String currName,String newName)throws SQLException{
     Connection conn=DBconnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update doctors set doctor_name=? where doctor_name=?");
     ps.setString(1,newName);
     ps.setString(2,currName);
     ps.executeUpdate();
    }
public static boolean addDoctor(DoctorPojo doc)throws SQLException{
       Connection conn=DBconnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("insert into doctors values(?,?,?,?,?,?,?)");
       ps.setString(1,doc.getDoctorId());
       ps.setString(2,doc.getDoctorName());
       ps.setString(3,doc.getEmailId());
       ps.setString(4,doc.getContactNo());
       ps.setString(5,doc.getQualification());
       ps.setString(6,doc.getGender());
       ps.setString(7,doc.getSpecialist());
       return ps.executeUpdate()==1;
}
public static String generateId()throws SQLException{
       Connection conn=DBconnection.getConnection();
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery("select max(doctor_id) from doctors");
       rs.next();
       int docId=101;
       String id=rs.getString(1);
       if(id!=null){
           String num=id.substring(3);
           docId=Integer.parseInt(num)+1;
       }
    return "DOC"+docId;
}
public static List<String> getAllDoctorId()throws SQLException{
     Connection conn=DBconnection.getConnection();
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery("select doctor_id from doctors");
       List<String>DocIdList=new ArrayList<>();
         while(rs.next()){
             DocIdList.add(rs.getString(1));
         }
         return DocIdList;
}
  public static boolean deleteDoctorById(String docId)throws SQLException{
     Connection conn=DBconnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Select doctor_name from doctors where doctor_id=?");
     ps.setString(1,docId);
     ResultSet rs=ps.executeQuery();
     rs.next();
     String docName=rs.getString(1);
     UserDao.deleteUserByName(docName);
     ps=conn.prepareStatement("delete from doctors where doctor_id=?");
     ps.setString(1,docId);
     return ps.executeUpdate()==1;
    }
  public static List<DoctorPojo> getAllDoctorDetails()throws SQLException{
        Connection conn=DBconnection.getConnection();
        Statement st=conn.createStatement();
          List<DoctorPojo>docList=new ArrayList<>();
        DoctorPojo doc;
        ResultSet rs=st.executeQuery("Select * from doctors order by doctor_id");
        while(rs.next()){
           doc = new DoctorPojo();
       doc.setDoctorName(rs.getString("DOCTOR_NAME"));
       doc.setContactNo(rs.getString("CONTACT_NO"));
       doc.setDoctorId(rs.getString("DOCTOR_ID"));
       doc.setEmailId(rs.getString("EMAIL_ID"));
       doc.setQualification(rs.getString("QUALIFICATION"));
       doc.setSpecialist(rs.getString("SPECIALIST"));
       doc.setGender(rs.getString("GENDER"));
       docList.add(doc);
        }
        return docList;
  }
  public static String getDoctorNameById(String docId) throws SQLException{
     Connection conn=DBconnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("select Doctor_Name from doctors where doctor_id=? ");
     ps.setString(1,docId);
     ResultSet rs=ps.executeQuery();
     rs.next();
      return rs.getString(1); 
  }
        }
