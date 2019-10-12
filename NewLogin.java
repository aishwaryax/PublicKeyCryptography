package cryptography;
import javax.swing.*;
import java.sql.*;
public class NewLogin extends javax.swing.JFrame {

    public NewLogin()
    {
        super("LOGIN PAGE");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        login = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        exitbtn = new javax.swing.JButton();
        loginbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(849, 24, 0, 0);

        jLabel2.setFont(new java.awt.Font("Avene", 3, 60));
        jLabel2.setText("SPECIAL INTELLIGENCE UNIT...");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 0, 780, 130);

        jPanel1.setLayout(null);

        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login);
        login.setBounds(491, 11, 370, 50);

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel1.add(pass);
        pass.setBounds(491, 101, 370, 50);

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Bernard MT Condensed", 1, 24)); // NOI18N
        jLabel5.setText("  CONTINGENCY NAME");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(239, 20, 220, 50);

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("Bernard MT Condensed", 1, 24)); // NOI18N
        jLabel6.setText("PASSWORD");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(260, 90, 200, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-140, 170, 1020, 180);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cryptography/1.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-20, 0, 890, 230);

        exitbtn.setFont(new java.awt.Font("Bernard MT Condensed", 1, 24)); // NOI18N
        exitbtn.setText("EXIT");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitbtn);
        exitbtn.setBounds(610, 380, 141, 42);

        loginbtn.setFont(new java.awt.Font("Bernard MT Condensed", 1, 24)); // NOI18N
        loginbtn.setText("LOGIN");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginbtn);
        loginbtn.setBounds(350, 380, 134, 45);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cryptography/2.jpg"))); // NOI18N
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 360, 300, 150);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed

}//GEN-LAST:event_passActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

}//GEN-LAST:event_loginActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed

        System.exit(0);
}//GEN-LAST:event_exitbtnActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed

        String str1 = login.getText();
        char[] p = pass.getPassword();
        String str2 = new String(p);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crypt","root","");
            PreparedStatement ps = con.prepareStatement("select * from login where email=? and password=?");
            ps.setString(1, str1);
            ps.setString(2, str2);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("Welcome"+rs.getString(1));
                dispose();
                Select form=new Select();
                form.setTitle("Select An Algorithm");
                form.setVisible(true);
                form.setSize(665, 446);
                form.setLocation(5, 5);

            } else {
                JOptionPane.showMessageDialog(null,
                        "Incorrect Contingency name or password..Try Again with correct detail");
            }


        } catch (Exception ex) {
            System.out.println(ex);
        }
}//GEN-LAST:event_loginbtnActionPerformed

    /**
    * @param args the command line arguments
    */
   /* public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            //    new NewLogin().setVisible(true);

            }
        });
    }
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField login;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables

}
