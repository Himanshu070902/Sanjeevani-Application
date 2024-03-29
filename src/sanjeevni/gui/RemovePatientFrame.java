/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevni.gui;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import sanjeevni.dao.PatientDao;
import sanjeevni.dbutil.DBconnection;
import sanjeevni.pojo.UserProfile;

/**
 *
 * @author Admin
 */
public class RemovePatientFrame extends javax.swing.JFrame {

    /**
     * Creates new form RemovePatientFrame
     */
    public RemovePatientFrame() {
        initComponents();
         setLocationRelativeTo(null);
        Toolkit tk=Toolkit.getDefaultToolkit();// this method give object of toolkit
        Image obj=tk.getImage("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Sanjeevni App\\src\\sanjeevni\\icons\\doctor.png");//remember the standard image getImage method take should be either in gif or jpg
        this.setIconImage(obj);
        lblName.setText("HELLO,USER-"+UserProfile.getUserName().toUpperCase());
        loadPatientId();
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
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JLabel();
        btnDelete = new javax.swing.JLabel();
        btnLogout = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcPatientId = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel10.setText("Sanjeevni Application");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevni/icons/HomePageBG.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 280));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBack.setText("Back");
        btnBack.setOpaque(true);
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 120, 30));

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDelete.setText("Delete");
        btnDelete.setOpaque(true);
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, 120, 30));

        btnLogout.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogout.setText("Logout");
        btnLogout.setOpaque(true);
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 80, 30));

        lblName.setBackground(new java.awt.Color(0, 0, 0));
        lblName.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Hello, User-");
        lblName.setOpaque(true);
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 286, 560, 50));

        jLabel6.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        jLabel6.setText("Delete Patients Frame");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setText("Patient Id");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, -1, -1));

        jcPatientId.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jPanel1.add(jcPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 230, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevni/icons/images (2).jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 800, 290));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        if(jcPatientId.getItemCount()==0){
                   btnDelete.setEnabled(false);
                   JOptionPane.showMessageDialog(null,"Deleted successfully!","SUCCESS",JOptionPane.INFORMATION_MESSAGE);
                   return;
               }
       String patId=jcPatientId.getSelectedItem().toString();
       try{
        boolean result=PatientDao.deletePatientById(patId);
        if(result==true){
         JOptionPane.showMessageDialog(null,"Patient recorded deleted successfully!","SUCCESS",JOptionPane.INFORMATION_MESSAGE); 
         return;
        }
        JOptionPane.showMessageDialog(null,"Recorded not deleted! Try Again Later","FAIL",JOptionPane.INFORMATION_MESSAGE);
        return;
       }
        catch(SQLException e){
           JOptionPane.showMessageDialog(null,"Error in DB!"+e.getMessage(),"ErrorInRemovePat",JOptionPane.ERROR_MESSAGE);
           e.printStackTrace();
       }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
     ReceptionistOptionsFrame fr=new ReceptionistOptionsFrame();
        fr.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(RemovePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemovePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemovePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemovePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemovePatientFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel btnDelete;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcPatientId;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables

    private void loadPatientId() {
       try{
           List<String> patIdList=new ArrayList<>();
           patIdList=PatientDao.getAllPatientId();
           if(patIdList==null){
               JOptionPane.showMessageDialog(this,"No More patient available!","NOTE",JOptionPane.INFORMATION_MESSAGE);
               return;
           }
           for(String id:patIdList){
               jcPatientId.addItem(id);
           }
       }
       catch(SQLException e){
           JOptionPane.showMessageDialog(null,"Error in DB!"+e.getMessage(),"ErrorInRemovePat",JOptionPane.ERROR_MESSAGE);
           e.printStackTrace();
       }
    }
}
