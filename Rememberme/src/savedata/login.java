/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savedata;

import java.util.prefs.Preferences;

/**
 *
 * @author ThinkPad
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public Preferences pref = Preferences.userRoot().node("Rememberme");
    public login() {
        initComponents();
        String usr = null;
        usr = pref.get("Email", usr);
        username.setText(usr);
        
        String pss = null;
        pss = pref.get("Password", pss);
        password.setText(pss);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        check = new javax.swing.JCheckBox();
        log = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setBorder(null);
        username.setOpaque(false);
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 340, 38));

        password.setBorder(null);
        password.setOpaque(false);
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 342, 340, 38));

        check.setBackground(new java.awt.Color(245, 248, 250));
        check.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        check.setText("Remember password");
        check.setBorder(null);
        getContentPane().add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 390, -1, -1));

        log.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logMouseClicked(evt);
            }
        });
        getContentPane().add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 340, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        setSize(new java.awt.Dimension(800, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logMouseClicked
        if(check.isSelected()){
            checked(true);
        }
        else{
            checked(false);
        }
        new dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logMouseClicked

    public void saveemailpass(String Email, String Pass){
        if(Email == null || Pass == null){
            System.out.println("Silakan Isi terlebih dahulu");
        }
        else{
            String user = Email;
            pref.put("Email", Email);
            String pass = Pass;
            pref.put("Password", pass);
            System.out.println("Data disimpan");
        }
    }
    
    public final void checked(boolean remember){
        if(remember == true){
            saveemailpass(username.getText(), password.getText());
        }
        else{
            System.out.println("null karakter");
        }
    }
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox check;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel log;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
