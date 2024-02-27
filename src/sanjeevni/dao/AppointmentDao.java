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
import java.util.ArrayList;
import java.util.List;
import sanjeevni.dbutil.DBconnection;
import sanjeevni.pojo.AppointmentPojo;
import sanjeevni.pojo.UserProfile;

/**
 *
 * @author Admin
 */
public class AppointmentDao {
    public static boolean addAppointment(AppointmentPojo appojo)throws SQLException{
       Connection conn=DBconnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("insert into appointments values(?,?,?,?,?,?,?)");
       ps.setString(1,appojo.getPatientId());
       ps.setString(2,appojo.getPatientName());
       ps.setString(3,appojo.getStatus());
       ps.setString(4,appojo.getOpd());
       ps.setString(5,appojo.getDateTime());
       ps.setString(6,appojo.getDoctorName());
       ps.setString(7,appojo.getMobileNo());
       return ps.executeUpdate()==1;
}
        public static List<AppointmentPojo> getAllApponitmentbyDocName(String docName) throws SQLException{
         Connection conn=DBconnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from Appointments where doctor_name =? and status='REQUEST' order by patient_id");
       ps.setString(1,docName);
       ResultSet rs=ps.executeQuery();
       List<AppointmentPojo> appList=new ArrayList<>();
       AppointmentPojo app;
       while(rs.next()){
              app=new AppointmentPojo();
              app.setPatientId(rs.getString("patient_id"));
              app.setPatientName(rs.getString("patient_name"));
              app.setDateTime(rs.getString("date_time"));
              app.setOpd(rs.getString("opd"));
              app.setStatus(rs.getString("Status"));
              app.setDoctorName("doctor_name");
              app.setMobileNo(rs.getString("Mobile_no"));
  
              appList.add(app); 
       }
            System.out.println(appList);
       return appList;
    }
           public static boolean updateStatus(AppointmentPojo app)throws SQLException{
        Connection conn=DBconnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update appointments set status=?,date_time=? where patient_id=?");
        
        ps.setString(1,app.getStatus());
        ps.setString(2,app.getDateTime());
        ps.setString(3, app.getPatientId());
        return ps.executeUpdate()==1;
    }
}
