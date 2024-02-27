/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevni.gui;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sanjeevni.dao.PatientDao;
import sanjeevni.dbutil.DBconnection;
import sanjeevni.pojo.PatientPojo;
import sanjeevni.pojo.UserProfile;

/**
 *
 * @author Admin
 */
public class ViewAllPatientFrame extends javax.swing.JFrame {

   private DefaultTableModel model;
    public ViewAllPatientFrame() {
        initComponents();
        setLocationRelativeTo(null);
        Toolkit tk=Toolkit.getDefaultToolkit();
        Image img=tk.getImage("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Sanjeevni App\\src\\sanjeevni\\icons\\doctor.png");
        this.setIconImage(img);
        model=(DefaultTableModel)jtViewAllPatients.getModel();
        loadAllPatients();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtViewAllPatients = new javax.swing.JTable();
        btnLogout = new javax.swing.JLabel();
        btnBack = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sanjeevni Application");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtViewAllPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "P_ID", "F_Name", "S_Name", "AGE", "OPD", "GENDER", "M_STATUS", "P_DATE", "ADDRESS", "CITY", "PHONE_NO", "DOCTOR_ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtViewAllPatients);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 1020, 180));

        btnLogout.setBackground(new java.awt.Color(0, 0, 0));
        btnLogout.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogout.setText("LogOut");
        btnLogout.setOpaque(true);
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });
        jPanel2.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 350, 126, 48));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBack.setText("Back");
        btnBack.setOpaque(true);
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, 119, 46));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevni/icons/HomePageBG1.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 1040, 390));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setText(" View Patient Details");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 320, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 570));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
//       
LoginFrame obj = new LoginFrame();
 obj.setVisible(true);
 this.dispose();
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
     String type=UserProfile.getUserType();
    // System.out.println("view all ks"+type);
     if(type.equalsIgnoreCase("admin")){
     AdminOptionsFrame fr=new AdminOptionsFrame();
     fr.setVisible(true);
     this.dispose(); 
     }
     else if(type.equalsIgnoreCase("RECEPTIONIST")){
     ReceptionistOptionsFrame fr=new ReceptionistOptionsFrame();
     fr.setVisible(true);
     this.dispose();
     }
     else if(type.equalsIgnoreCase("DOCTOR")){
     DoctorOptionsFrame fr=new DoctorOptionsFrame();
     fr.setVisible(true);
     this.dispose();   
     }
    }//GEN-LAST:event_btnBackMouseClicked

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
            java.util.logging.Logger.getLogger(ViewAllPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAllPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAllPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAllPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAllPatientFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtViewAllPatients;
    // End of variables declaration//GEN-END:variables

    private void loadAllPatients() {
        try{
    List<PatientPojo> patList=PatientDao.getAllPatientDetails();
    if(patList.isEmpty()){
        JOptionPane.showMessageDialog(null, "No Patients Present!");
        return;
    }
    Object []obj=new Object[12];
    for(PatientPojo pat:patList){
    obj[0]=pat.getPatientId();
    obj[1]=pat.getFirstName();
    obj[2]=pat.getLastName();
    obj[3]=pat.getAge();
    obj[4]=pat.getOpd();
    obj[5]=pat.getGender();
    obj[6]=pat.getmStatus();
    obj[7]=pat.getpDate();
    obj[8]=pat.getAddress();
    obj[10]=pat.getMobileNo();
    obj[11]=pat.getDoctorId();
    obj[9]=pat.getCity();
    model.addRow(obj);
            }
        }
        catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Error in DB!","ERRORinViewAllPat",JOptionPane.ERROR_MESSAGE);
              e.printStackTrace();
        }
    }
}
