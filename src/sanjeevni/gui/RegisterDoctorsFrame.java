/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevni.gui;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import sanjeevni.dao.DoctorDao;
import sanjeevni.dao.EmpDao;
import sanjeevni.dao.UserDao;
import sanjeevni.dbutil.DBconnection;
import sanjeevni.pojo.DoctorPojo;
import sanjeevni.pojo.UserPojo;
import sanjeevni.utility.PasswordEncryption;

/**
 *
 * @author Admin
 */
public class RegisterDoctorsFrame extends javax.swing.JFrame {
    String loginId,contactNo,qualification,emailId,specialist,pwd1,pwd2,empId,empName;
    
    private Map<String,String> unRegDocList=new HashMap<>();
    public RegisterDoctorsFrame() {
        initComponents();
        setLocationRelativeTo(null);
        Toolkit tk=Toolkit.getDefaultToolkit();// this method give object of toolkit
        Image obj=tk.getImage("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Sanjeevni App\\src\\sanjeevni\\icons\\doctor.png");//remember the standard image getImage method take should be either in gif or jpg
        this.setIconImage(obj);
        loadDoctorDetails();
        getNewDocId();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jcEmpId = new javax.swing.JComboBox<>();
        jcGender = new javax.swing.JComboBox<>();
        txtDoctorName = new javax.swing.JTextField();
        txtLoginId = new javax.swing.JTextField();
        txtDoctorId = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        txtQualification = new javax.swing.JTextField();
        txtSpecialist = new javax.swing.JTextField();
        txtEmailId = new javax.swing.JTextField();
        txtPwd = new javax.swing.JPasswordField();
        txtRetypePwd = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JLabel();
        btnRegister = new javax.swing.JLabel();
        btnBack = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setText("Doctor Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setText("Employee ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText("Login Id");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setText("Password");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setText("ReType Password");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 130, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setText("Gender");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Doctor Id");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Contact No");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, -1, -1));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Qualification");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, -1, -1));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Specialist");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, -1, -1));

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Email Id");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, -1, -1));

        jcEmpId.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jcEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEmpIdActionPerformed(evt);
            }
        });
        jPanel1.add(jcEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 150, -1));

        jcGender.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jcGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "NEUTRAL", " " }));
        jPanel1.add(jcGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 570, 150, -1));

        txtDoctorName.setEditable(false);
        txtDoctorName.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jPanel1.add(txtDoctorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 150, -1));

        txtLoginId.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jPanel1.add(txtLoginId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 150, -1));

        txtDoctorId.setEditable(false);
        txtDoctorId.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtDoctorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtDoctorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 130, -1));

        txtContactNo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jPanel1.add(txtContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 130, -1));

        txtQualification.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jPanel1.add(txtQualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 130, -1));

        txtSpecialist.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jPanel1.add(txtSpecialist, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 130, -1));

        txtEmailId.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jPanel1.add(txtEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, 130, -1));
        jPanel1.add(txtPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 150, -1));
        jPanel1.add(txtRetypePwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 150, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Doctor's Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 590, 270));

        jLabel5.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabel5.setText("Add Doctors");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 180, -1));

        btnLogout.setBackground(new java.awt.Color(0, 0, 0));
        btnLogout.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogout.setText("Logout");
        btnLogout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnLogout.setOpaque(true);
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 590, 70, 30));

        btnRegister.setBackground(new java.awt.Color(0, 0, 0));
        btnRegister.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegister.setText("Register");
        btnRegister.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRegister.setOpaque(true);
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterMouseClicked(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, 110, 30));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBack.setOpaque(true);
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 590, 70, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevni/icons/images (2).jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 800, 340));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel3.setText("Sanjeevni Application");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 450, 70));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevni/icons/HomePageBG.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 280));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 801, 625));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDoctorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorIdActionPerformed

    private void jcEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEmpIdActionPerformed
        if (jcEmpId.getSelectedIndex()==-1)// this is done to remove null pointer exception
            return;
       empId=jcEmpId.getSelectedItem().toString();
       empName=unRegDocList.get(empId);
      txtDoctorName.setText(empName);
    }//GEN-LAST:event_jcEmpIdActionPerformed

    private void btnRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseClicked
       if(validateInputs()==false){
           JOptionPane.showMessageDialog(null, "Please Input all the details!");
           return;
       }
       String passwordValid=matchPassword();
       if(passwordValid!=null){
           JOptionPane.showMessageDialog(null, passwordValid);
           return;
       }
       if(isContactNoValid()==false){
             JOptionPane.showMessageDialog(null, "Invalid Mobile No!");
             return;
       }
       try{
           DoctorPojo doc=new DoctorPojo();
           doc.setDoctorId(txtDoctorId.getText());
           doc.setDoctorName(empName);
           doc.setEmailId(txtEmailId.getText());
           doc.setGender(jcGender.getSelectedItem().toString());
           doc.setContactNo(contactNo);
           doc.setQualification(qualification);
           doc.setSpecialist(specialist);
           UserPojo user=new UserPojo();
           user.setUserId(loginId);
           String encPassword=new String(PasswordEncryption.getEncryptedPassword(pwd1));
           System.out.println(encPassword);
           user.setPassword(encPassword);
           user.setUserType("DOCTOR");
           user.setUserName(empName);
           
           boolean result1=DoctorDao.addDoctor(doc);
           boolean result2=UserDao.addUser(user);
           if(result1==true&&result2==true){
               JOptionPane.showMessageDialog(null,"Doctor successfully registered!");
                clearAll();
                jcEmpId.removeItem(empId);
               return;
           }
           JOptionPane.showMessageDialog(null,"Registration unsuccessfully!");
           clearAll();
           
           return;
       }
        catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Error in DB "+e.getMessage(),"ERRORinRegisterDoc",JOptionPane.ERROR_MESSAGE);
         clearAll();
        e.printStackTrace();
       }
    }//GEN-LAST:event_btnRegisterMouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked

        ManageDoctorFrame fr=new ManageDoctorFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
// int ans=JOptionPane.showConfirmDialog(null,"Are you sure?","Quitting",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
//     if(ans==JOptionPane.YES_OPTION){
//         DBconnection.closeConnection();
//         System.exit(0);
//     }        // TODO add your handling code here:
LoginFrame obj = new LoginFrame();
 obj.setVisible(true);
 this.dispose();
    }//GEN-LAST:event_btnLogoutMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctorsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctorsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctorsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctorsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterDoctorsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcEmpId;
    private javax.swing.JComboBox<String> jcGender;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtDoctorId;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtLoginId;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JTextField txtQualification;
    private javax.swing.JPasswordField txtRetypePwd;
    private javax.swing.JTextField txtSpecialist;
    // End of variables declaration//GEN-END:variables

    private void loadDoctorDetails() {
       try{
           unRegDocList=EmpDao.getUnregisteredDoctors();
           Set<String> empIdSet=unRegDocList.keySet();
           for(String empId:empIdSet){
               jcEmpId.addItem(empId);
           }
       }
       catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Error in DB "+e.getMessage(),"ERRORinRegisterDoc",JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
       }
    }

    private void getNewDocId() {
        try{
        String docId=DoctorDao.generateId();
        txtDoctorId.setText(docId);
        }
        catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Error in DB "+e.getMessage(),"ERRORinRegisterDoc",JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
       }
        }
     private boolean validateInputs(){
        this.loginId=this.txtLoginId.getText().trim();
        char []p1=this.txtPwd.getPassword();
          char []p2=this.txtRetypePwd.getPassword();
          this.contactNo=this.txtContactNo.getText().trim();
          this.qualification=txtQualification.getText().trim();
          this.emailId=txtEmailId.getText().trim();
          this.specialist=txtSpecialist.getText().trim();
          if(loginId.isEmpty()||p1.length==0||p2.length==0||contactNo.isEmpty()||qualification.isEmpty()||emailId.isEmpty()||specialist.isEmpty()){
              return false;
          }
          pwd1=new String(p1);
          pwd2=new String(p2);
          return true;
    }
    private String matchPassword(){
        pwd1=pwd1.trim();
        pwd2=pwd2.trim();
        if(pwd1.length()<3||pwd2.length()<3)
        {
            return "Passwords must be of atleast 3 characters in length";
        }
        if(pwd1.equals(pwd2)==false){
            return "Passwords do not match";
        }
        return null;
            }
    private void clearAll(){
        txtLoginId.setText("");
        this.txtContactNo.setText("");
        this.txtDoctorId.setText("");
        this.txtDoctorName.setText("");
        this.txtEmailId.setText("");
        this.txtPwd.setText("");
        this.txtQualification.setText("");
        this.txtRetypePwd.setText("");
        this.txtSpecialist.setText("");
        this.unRegDocList.remove(empId);
        if(unRegDocList.isEmpty()){
        JOptionPane.showMessageDialog(null, "ALL doctors registered successfully!");
        ManageDoctorFrame fr=new ManageDoctorFrame();
        fr.setVisible(true);
        this.dispose();
        }
    }
    private boolean isContactNoValid(){
        char[] mob=contactNo.toCharArray();
        for(char ch:mob){
            if(Character.isDigit(ch)==false){
                return false;
            }
        }
        return true;
    }
}
