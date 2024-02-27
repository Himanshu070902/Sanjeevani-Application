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
public class DoctorOptionsFrame extends javax.swing.JFrame {

    /**
     * Creates new form DoctorOptionsFrame
     */
    public DoctorOptionsFrame() {
        initComponents();
        setLocationRelativeTo(null);
        Toolkit tk=Toolkit.getDefaultToolkit();
        Image img=tk.getImage("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Sanjeevni App\\src\\sanjeevni\\icons\\doctor.png");
        this.setIconImage(img);
        String name=UserProfile.getUserName().toString();
        lblName.setText("Hello User-"+name);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblViewAppointment = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblConfirmAppointment = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevni/icons/doctor.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 160, 160));

        lblLogout.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogout.setText("Logout");
        lblLogout.setOpaque(true);
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });
        getContentPane().add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 406, 69, -1));

        lblName.setBackground(new java.awt.Color(0, 0, 0));
        lblName.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Hello, User-");
        lblName.setOpaque(true);
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 620, 30));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel10.setText("Sanjeevni Application");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevni/icons/HomePageBG1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Doctor Option Frame");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 170, 30));

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblViewAppointment.setBackground(new java.awt.Color(0, 204, 204));
        lblViewAppointment.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblViewAppointment.setForeground(new java.awt.Color(255, 255, 255));
        lblViewAppointment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewAppointment.setText("View Pending Appoinment");
        lblViewAppointment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblViewAppointment.setOpaque(true);
        lblViewAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViewAppointmentMouseClicked(evt);
            }
        });
        jPanel1.add(lblViewAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, -1, 60));

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
        jPanel1.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, 80, 30));

        lblConfirmAppointment.setBackground(new java.awt.Color(0, 204, 204));
        lblConfirmAppointment.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblConfirmAppointment.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirmAppointment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConfirmAppointment.setText("Confirmed Appointments");
        lblConfirmAppointment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblConfirmAppointment.setOpaque(true);
        lblConfirmAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConfirmAppointmentMouseClicked(evt);
            }
        });
        jPanel1.add(lblConfirmAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, -1, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        LoginFrame fr=new LoginFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblConfirmAppointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfirmAppointmentMouseClicked
        ConfirmAppointmentFrame cnfm=new ConfirmAppointmentFrame();
        cnfm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblConfirmAppointmentMouseClicked

    private void lblViewAppointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewAppointmentMouseClicked
        AppointmentRequestFrame arf = new AppointmentRequestFrame();
        arf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblViewAppointmentMouseClicked

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
// int ans=JOptionPane.showConfirmDialog(null,"Are you sure?","Quitting",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
//     if(ans==JOptionPane.YES_OPTION){
//         DBconnection.closeConnection();
//         System.exit(0);
//     }        // TODO add your handling code here:
LoginFrame obj = new LoginFrame();
 obj.setVisible(true);
 this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        
    }//GEN-LAST:event_jPanel1MouseClicked

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
            java.util.logging.Logger.getLogger(DoctorOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorOptionsFrame().setVisible(true);
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
    private javax.swing.JLabel lblConfirmAppointment;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblViewAppointment;
    // End of variables declaration//GEN-END:variables
}
