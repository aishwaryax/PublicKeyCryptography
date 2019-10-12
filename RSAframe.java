package cryptography;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class RSAframe extends javax.swing.JFrame {
    String s;

    public RSAframe() {
        super("RSA ALGORITHM");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exitbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        exitbtn.setFont(new java.awt.Font("Bernard MT Condensed", 1, 24));
        exitbtn.setText("BACK");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitbtn);
        exitbtn.setBounds(670, 290, 152, 51);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RSA ALGORITHM");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 10, 570, 60);

        message.setColumns(20);
        message.setRows(5);
        jScrollPane1.setViewportView(message);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(430, 150, 442, 108);

        jButton1.setFont(new java.awt.Font("Bernard MT Condensed", 1, 24));
        jButton1.setText("ENCRYPT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed1(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(398, 290, 200, 51);

        jLabel2.setFont(new java.awt.Font("Bernard MT Condensed", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enter Your Message");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 140, 330, 110);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("(Rivest Shamir Aldeman)");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(380, 50, 300, 60);

        jButton3.setFont(new java.awt.Font("Bernard MT Condensed", 1, 24));
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(140, 290, 152, 51);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cryptography/two.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(-150, -110, 1260, 610);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cryptography/two.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(530, -40, 470, 470);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 10, 950, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dispose();
                RSAEncryption c;
        try {
            c = new RSAEncryption();
             c.setVisible(true);
                c.setSize(900,700);
                c.setLocation(5, 5);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RSAframe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RSAframe.class.getName()).log(Level.SEVERE, null, ex);
        }
               
    }//GEN-LAST:event_jButton1ActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
dispose();
                Select form=new Select ();
                form.setVisible(true);
                form.setSize(900,700);
                form.setLocation(5, 5);     
    }//GEN-LAST:event_exitbtnActionPerformed

    private void jButton1ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed1
        try{
            String s=message.getText();
            //message writing
           FileWriter fw=new FileWriter("C:\\ppp\\encryp.txt");
           fw.write(s);
           fw.close();
          }catch(Exception e){System.out.println(e);}
        dispose();
        RSAEncryption e;
        try {
            e = new RSAEncryption();
               e.setVisible(true);
                e.setSize(913,559);
                e.setLocation(5, 5);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RSAframe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RSAframe.class.getName()).log(Level.SEVERE, null, ex);
        }
             
    }//GEN-LAST:event_jButton1ActionPerformed1

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea message;
    // End of variables declaration//GEN-END:variables
}
