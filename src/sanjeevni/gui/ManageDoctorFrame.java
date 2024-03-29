/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevni.gui;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import sanjeevni.dbutil.DBconnection;
import sanjeevni.pojo.UserProfile;

/**
 *
 * @author Admin
 */
public class ManageDoctorFrame extends javax.swing.JFrame {

    /**
     * Creates new form ManageDoctorFrame
     */
    public ManageDoctorFrame() {
        initComponents();
         setLocationRelativeTo(null);
        Toolkit tk=Toolkit.getDefaultToolkit();// this method give object of toolkit
        Image obj=tk.getImage("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Sanjeevni App\\src\\sanjeevni\\icons\\doctor.png");//remember the standard image getImage method take should be either in gif or jpg
        this.setIconImage(obj);
        if(UserProfile.getUserName()!=null)
        lblName.setText("HELLO,USER-"+UserProfile.getUserName().toUpperCase());
        else
          lblName.setText("HELLO, USER!");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBack = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        btnAddDoctors = new javax.swing.JLabel();
        btnDeleteDoctors = new javax.swing.JLabel();
        btnViewDoctors = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        btnViewPatient = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sanjeevni Application");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 460, 80));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevni/icons/HomePageBG1.jpg"))); // NOI18N
        jLabel1.setText("Sanjeevni Application");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 800, 390));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevni/icons/doctor.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 200, 150));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Manager Doctor");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 200, 50));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBack.setText("Back");
        btnBack.setOpaque(true);
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 358, 70, 30));

        lblLogout.setBackground(new java.awt.Color(255, 255, 255));
        lblLogout.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogout.setText("Logout");
        lblLogout.setOpaque(true);
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });
        getContentPane().add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 358, 90, 30));

        btnAddDoctors.setBackground(new java.awt.Color(0, 204, 204));
        btnAddDoctors.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnAddDoctors.setForeground(new java.awt.Color(255, 255, 255));
        btnAddDoctors.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAddDoctors.setText("ADD DOCTORS");
        btnAddDoctors.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAddDoctors.setOpaque(true);
        btnAddDoctors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddDoctorsMouseClicked(evt);
            }
        });
        getContentPane().add(btnAddDoctors, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 230, 50));

        btnDeleteDoctors.setBackground(new java.awt.Color(0, 204, 204));
        btnDeleteDoctors.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnDeleteDoctors.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteDoctors.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDeleteDoctors.setText("DELETE DOCTORS");
        btnDeleteDoctors.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDeleteDoctors.setOpaque(true);
        btnDeleteDoctors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteDoctorsMouseClicked(evt);
            }
        });
        getContentPane().add(btnDeleteDoctors, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 230, 50));

        btnViewDoctors.setBackground(new java.awt.Color(0, 204, 204));
        btnViewDoctors.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnViewDoctors.setForeground(new java.awt.Color(255, 255, 255));
        btnViewDoctors.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnViewDoctors.setText("VIEW DOCTORS");
        btnViewDoctors.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnViewDoctors.setOpaque(true);
        btnViewDoctors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewDoctorsMouseClicked(evt);
            }
        });
        getContentPane().add(btnViewDoctors, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 230, 50));

        lblName.setBackground(new java.awt.Color(0, 0, 0));
        lblName.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Hello , User");
        lblName.setOpaque(true);
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 570, 50));

        btnViewPatient.setBackground(new java.awt.Color(0, 204, 204));
        btnViewPatient.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnViewPatient.setForeground(new java.awt.Color(255, 255, 255));
        btnViewPatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnViewPatient.setText("VIEW PATIENTS");
        btnViewPatient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnViewPatient.setOpaque(true);
        btnViewPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewPatientMouseClicked(evt);
            }
        });
        getContentPane().add(btnViewPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 230, 50));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 780, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddDoctorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddDoctorsMouseClicked
        RegisterDoctorsFrame fr= new RegisterDoctorsFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddDoctorsMouseClicked

    private void btnDeleteDoctorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteDoctorsMouseClicked
       RemoveDoctorFrame fr=new RemoveDoctorFrame();
       fr.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnDeleteDoctorsMouseClicked

    private void btnViewDoctorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewDoctorsMouseClicked
       ViewDoctorsFrame fr=new ViewDoctorsFrame();
       fr.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnViewDoctorsMouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
    AdminOptionsFrame ad=new  AdminOptionsFrame();
    ad.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
//      
LoginFrame obj = new LoginFrame();
 obj.setVisible(true);
 this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void btnViewPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewPatientMouseClicked
       ViewAllPatientFrame fr=new ViewAllPatientFrame();
       fr.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnViewPatientMouseClicked

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
            java.util.logging.Logger.getLogger(ManageDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageDoctorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAddDoctors;
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel btnDeleteDoctors;
    private javax.swing.JLabel btnViewDoctors;
    private javax.swing.JLabel btnViewPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables
}
