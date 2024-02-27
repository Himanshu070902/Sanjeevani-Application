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
import sanjeevni.pojo.PatientPojo;

/**
 *
 * @author Admin
 */
public class PatientDao {
    public static boolean addPatients(PatientPojo pat)throws SQLException{
        Connection conn=DBconnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into patients values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,pat.getPatientId());
        ps.setString(2,pat.getFirstName());
        ps.setString(3,pat.getLastName());
        ps.setInt(4,pat.getAge());
        ps.setString(5,pat.getGender());
        ps.setString(6,pat.getmStatus());
        ps.setString(7,pat.getAddress());
        ps.setString(8,pat.getCity());
        ps.setString(9,pat.getMobileNo());
        ps.setDate(10,pat.getpDate());
        ps.setInt(11,pat.getOtp());
        ps.setString(12,pat.getOpd());
        ps.setString(13,pat.getDoctorId());
        ps.setString(14, pat.getStatus());
        return ps.executeUpdate()==1;
    }
    public static String generateId()throws SQLException{
        Connection conn=DBconnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select max(patient_Id) from patients ");
        rs.next();
        int patId=101;
        String Id=rs.getString(1);
        if(Id!=null)
        patId=Integer.parseInt(Id.substring(1))+1;
        return "P"+patId;
    }
    public static List<String> getAllPatientId()throws SQLException{
     Connection conn=DBconnection.getConnection();
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery("select patient_id from patients");
       List<String> patIdList=new ArrayList<>();
       while(rs.next()){
           patIdList.add(rs.getString(1));
       }
       return patIdList;
    }
    public static List<PatientPojo> getAllPatientDetails()throws SQLException{
    Connection conn=DBconnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select * from patients order by patient_id");
    List<PatientPojo> patList=new ArrayList<>();
    while(rs.next()){
      PatientPojo pat=new PatientPojo();
      pat.setAddress(rs.getString("Address"));
      pat.setAge(rs.getInt("age"));
      pat.setCity(rs.getString("city"));
      pat.setDoctorId(rs.getString("doctor_id"));
      pat.setFirstName(rs.getString("first_name"));
      pat.setGender(rs.getString("Gender"));
      pat.setLastName(rs.getString("last_name"));
      pat.setMobileNo(rs.getString("mobile_no"));
      pat.setOpd(rs.getString("opd"));
      pat.setOtp(rs.getInt("otp"));
      pat.setPatientId(rs.getString("patient_id"));
      pat.setStatus(rs.getString("status"));
      pat.setmStatus(rs.getString("m_status"));
      pat.setpDate(rs.getDate("p_date"));
      patList.add(pat);
    }
    return patList;
}
    public static List<PatientPojo> getAllPatientbyDocId(String docId) throws SQLException{
         Connection conn=DBconnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from patients where doctor_id =? and status='REQUEST'");
       ps.setString(1,docId);
       ResultSet rs=ps.executeQuery();
       List<PatientPojo> patList=new ArrayList<>();
       while(rs.next()){
               PatientPojo pat=new PatientPojo();
              pat.setPatientId(rs.getString("patient_id"));
              pat.setFirstName(rs.getString("first_name"));
              pat.setpDate(rs.getDate("p_Date"));
              pat.setOpd(rs.getString("opd"));
              patList.add(pat); 
       }
       return patList;
    }
    public static boolean updateStatus(String patId)throws SQLException{
        Connection conn=DBconnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update patients set status='CONFIRM'");
        ps.setString(1,patId);
        return ps.executeUpdate()==1;
    }
    public static List<String> getPatIdByDocId(String docId)throws SQLException{
         Connection conn=DBconnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("select patient_Id from patients where doctor_Id=?");
         ps.setString(1, docId);
         List<String> patId=new ArrayList<>();
         ResultSet rs=ps.executeQuery();
       while(rs.next()){
           patId.add(rs.getString(1));
           System.out.println(patId+" ");
       }
       return patId;
    }
    public static PatientPojo getPatientDetailByPatientId(String patId) throws SQLException{
        PatientPojo pat=new PatientPojo();
        Connection conn=DBconnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from patients where patient_id=?");
        ps.setString(1, patId);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
      pat.setAddress(rs.getString("Address"));
      pat.setAge(rs.getInt("age"));
      pat.setCity(rs.getString("city"));
      pat.setDoctorId(rs.getString("doctor_id"));
      pat.setFirstName(rs.getString("first_name"));
      pat.setGender(rs.getString("Gender"));
      pat.setLastName(rs.getString("last_name"));
      pat.setMobileNo(rs.getString("mobile_no"));
      pat.setOpd(rs.getString("opd"));
      pat.setOtp(rs.getInt("otp"));
      pat.setPatientId(rs.getString("patient_id"));
      pat.setStatus(rs.getString("status"));
      pat.setmStatus(rs.getString("m_status"));
      pat.setpDate(rs.getDate("p_date"));
        }
        return pat;
    }
    public static boolean updatePatientDetails(PatientPojo pat) throws SQLException{
         Connection conn=DBconnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("update patients set OPD=?,city=?,address=?,gender=?,m_status=?,first_name=?,last_name=?,age=?,mobile_no=? where patient_id=?");
        ps.setString(6,pat.getFirstName());
        ps.setString(7,pat.getLastName());
        ps.setInt(8,pat.getAge());
        ps.setString(4,pat.getGender());
        ps.setString(5,pat.getmStatus());
        ps.setString(3,pat.getAddress());
        ps.setString(2,pat.getCity());
        ps.setString(9,pat.getMobileNo());
       // ps.setDate(10,pat.getpDate());
     //   ps.setInt(11,pat.getOtp());
        ps.setString(1,pat.getOpd());
        ps.setString(10,pat.getPatientId());
        //ps.setString(14, pat.getStatus());
        return ps.executeUpdate()==1;
    }
    public static boolean deletePatientById(String patId) throws SQLException{
         Connection conn=DBconnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("delete from patients where patient_Id =?");
        ps.setString(1,patId);
        return ps.executeUpdate()==1;
    }
}