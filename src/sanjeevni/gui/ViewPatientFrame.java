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
public class ViewPatientFrame extends javax.swing.JFrame {

    /**
     * Creates new form ViewPatientFrame
     */
    public ViewPatientFrame() {
        initComponents();
        setLocationRelativeTo(null);
        Toolkit tk=Toolkit.getDefaultToolkit();
        Image obj=tk.getImage("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Sanjeevni App\\src\\sanjeevni\\icons\\doctor.png");//remember the standard image getImage method take should be either in gif or jpg
        this.setIconImage(obj);
        String name=UserProfile.getUserName().toUpperCase();
        lblName.setText("HELLO,USER-"+name);
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
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblViewAllPatient = new javax.swing.JLabel();
        lblViewSinglepatient = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel10.setText("Sanjeevni Application");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("View Patient Detail");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 170, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevni/icons/doctor.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 160, 160));

        lblViewAllPatient.setBackground(new java.awt.Color(0, 204, 204));
        lblViewAllPatient.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblViewAllPatient.setForeground(new java.awt.Color(255, 255, 255));
        lblViewAllPatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewAllPatient.setText("View All Patient");
        lblViewAllPatient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblViewAllPatient.setOpaque(true);
        lblViewAllPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViewAllPatientMouseClicked(evt);
            }
        });
        jPanel1.add(lblViewAllPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 465, 260, 50));

        lblViewSinglepatient.setBackground(new java.awt.Color(0, 204, 204));
        lblViewSinglepatient.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblViewSinglepatient.setForeground(new java.awt.Color(255, 255, 255));
        lblViewSinglepatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewSinglepatient.setText("View Single Patient");
        lblViewSinglepatient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblViewSinglepatient.setOpaque(true);
        lblViewSinglepatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViewSinglepatientMouseClicked(evt);
            }
        });
        jPanel1.add(lblViewSinglepatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 465, 280, 50));

        lblBack.setBackground(new java.awt.Color(0, 0, 0));
        lblBack.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblBack.setForeground(new java.awt.Color(255, 255, 255));
        lblBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBack.setText("Back");
        lblBack.setOpaque(true);
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        jPanel1.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, 90, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevni/icons/HomePageBG1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        lblLogout.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogout.setText("Logout");
        lblLogout.setOpaque(true);
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });
        jPanel1.add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 406, 69, -1));

        lblName.setBackground(new java.awt.Color(0, 0, 0));
        lblName.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Hello, User-");
        lblName.setOpaque(true);
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 620, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
//         int ans=JOptionPane.showConfirmDialog(null,"Are you sure?","Quitting",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
//     if(ans==JOptionPane.YES_OPTION){
//         DBconnection.closeConnection();
//         System.exit(0);
//     }
LoginFrame obj = new LoginFrame();
 obj.setVisible(true);
 this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblViewAllPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewAllPatientMouseClicked
        ViewAllPatientFrame fr=new ViewAllPatientFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblViewAllPatientMouseClicked

    private void lblViewSinglepatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewSinglepatientMouseClicked
        ViewSinglePatientFrame view=new ViewSinglePatientFrame();
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblViewSinglepatientMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
         System.out.println(UserProfile.getUserType());
        if(UserProfile.getUserType()=="DOCTOR"){
           DoctorOptionsFrame fr=new DoctorOptionsFrame();
           this.dispose();
           fr.setVisible(true);
       }
       else if(UserProfile.getUserType()=="RECEPTIONIST"){
           ReceptionistOptionsFrame fr=new ReceptionistOptionsFrame();
           this.dispose();
           fr.setVisible(true);
       }
       else {
           AdminOptionsFrame fr=new AdminOptionsFrame();
           this.dispose();
           fr.setVisible(true);
       }
    }//GEN-LAST:event_lblBackMouseClicked

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
            java.util.logging.Logger.getLogger(ViewPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPatientFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblViewAllPatient;
    private javax.swing.JLabel lblViewSinglepatient;
    // End of variables declaration//GEN-END:variables
}
