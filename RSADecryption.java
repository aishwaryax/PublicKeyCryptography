package cryptography;
import java.math.BigInteger;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class RSADecryption extends javax.swing.JFrame {
    RSAEncryption r=new RSAEncryption();
    BigInteger n1=r.n;
    BigInteger d1=r.d;
    BigInteger em=r.encrypted_msg;
String st="", s, stri;
public int b;
BigInteger d;

public synchronized String decrypt() 
  {
    stri=new String((new BigInteger(em.toByteArray())).modPow(d1, n1).toByteArray());
    return stri;
  }


  //Decryption in second case
  public synchronized BigInteger decrypt(BigInteger encrypted_msg)
  {
    return encrypted_msg.modPow(d1, n1);
  }
    public RSADecryption() throws FileNotFoundException, IOException {
        initComponents();
        BigInteger message1=decrypt(em);
        String decrypted_message=new String(message1.toByteArray());
        jTextArea1.setText(decrypted_message);
    }
    @SuppressWarnings("unchecked")
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RSADecryption().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(RSADecryption.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(RSADecryption.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Avene", 1, 36));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DECRYPTED MESSAGE IS...");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 70, 500, 54);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(90, 110, 620, 180);

        jButton1.setFont(new java.awt.Font("Baskerville Old Face", 1, 18));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 310, 130, 50);

        jButton2.setFont(new java.awt.Font("Baskerville Old Face", 1, 18));
        jButton2.setText("MAIN MENU");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(290, 310, 220, 50);

        jButton3.setFont(new java.awt.Font("Baskerville Old Face", 1, 18));
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(580, 310, 130, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cryptography/decryp.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(540, 130, 280, 190);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cryptography/decryp.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(540, -120, 670, 400);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cryptography/decryp.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 290, 320, 160);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cryptography/decryp.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(540, 270, 280, 180);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cryptography/decryp.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, -80, 280, 210);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cryptography/decryp.jpg"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(270, -110, 280, 270);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cryptography/decryp.jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(270, 270, 280, 180);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cryptography/decryp.jpg"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 110, 280, 190);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();
                // f1.dispose();
                RSAEncryption form = null;
        try {
            form = new RSAEncryption();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RSADecryption.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RSADecryption.class.getName()).log(Level.SEVERE, null, ex);
        }
                form.setVisible(true);
                form.setSize(913,559);
                form.setLocation(5, 5);    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
                Select form=new Select();
                form.setVisible(true);
                form.setSize(665, 446);
                form.setLocation(5, 5);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
System.exit(0);    }//GEN-LAST:event_jButton3ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}
