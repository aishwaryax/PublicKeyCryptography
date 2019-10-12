package cryptography;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
public class RSAEncryption extends javax.swing.JFrame {
public BigInteger n, e;
public BigInteger d;
private int bitlen = 512;
private String st="",s="", str;
public BigInteger encrypted_msg;

    RSAEncryption(int i) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

  //random generation of prime nos. and finding out phi of their product
  public void bit(int bits)
  {
    bitlen = bits;
    SecureRandom r=new SecureRandom(); 
    BigInteger p1=new BigInteger(bitlen / 2, 100, r); 
    BigInteger p2=new BigInteger(bitlen / 2, 100, r);
    n=p1.multiply(p2);
    BigInteger phi=(p1.subtract(BigInteger.ONE)).multiply(p2.subtract(BigInteger.ONE));
    e=new BigInteger("3");
    while (phi.gcd(e).intValue()>1)
    {
      e=e.add(new BigInteger("2"));
    }
    d=e.modInverse(phi);
  }

public synchronized String encrypt(String message)
  {
    return (new BigInteger(message.getBytes())).modPow(e, n).toString();
  }

public synchronized BigInteger encrypt(BigInteger message)
  {
    return message.modPow(e, n);
  }

public synchronized String decrypt()
  {
    str=new String((new BigInteger(encrypted_msg.toByteArray())).modPow(d, n).toByteArray());
    return str;
  }


public synchronized BigInteger decrypt(BigInteger encrypted_msg)
  {
    return encrypted_msg.modPow(d, n);
  }




  public RSAEncryption() throws FileNotFoundException, IOException {
        initComponents();
        //reading the message
          File file = new File("C:\\ppp\\encryp.txt");
          BufferedReader br = new BufferedReader(new FileReader(file));


  while ((st = br.readLine()) != null)
   s=s+st;
    bit(512);
    String message;
    BigInteger message1=new BigInteger(s.getBytes());
    encrypted_msg=encrypt(message1);
    encryp.setText(encrypted_msg.toString());


    //writing encrypted msg
    try{


           FileWriter fw=new FileWriter("C:\\ppp\\decryp.txt");
           fw.write(encrypted_msg.toString());
           fw.close();
          }catch(Exception e){System.out.println(e);}

    try{


           FileWriter fw=new FileWriter("C:\\ppp\\n.txt");
           fw.write(n.toString());
           fw.close();
          }catch(Exception e){System.out.println(e);}

    try{


           FileWriter fw=new FileWriter("C:\\ppp\\e.txt");
           fw.write(e.toString());
           fw.close();
          }catch(Exception e){System.out.println(e);}

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        encryp = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        encryp.setColumns(20);
        encryp.setRows(5);
        encryp.setWrapStyleWord(true);
        jScrollPane1.setViewportView(encryp);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 130, 760, 170);

        jButton1.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jButton1.setText("DECRYPT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(440, 360, 160, 60);

        jButton2.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jButton2.setText("ENCRPT ANOTHER MESSAGE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 360, 400, 62);

        jLabel3.setFont(new java.awt.Font("Avene", 1, 36)); // NOI18N
        jLabel3.setText("Encrpted Message is . . .");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 0, 420, 80);

        jButton3.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(670, 360, 130, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cryptography/one.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-60, 10, 920, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //
        dispose();
                // f1.dispose();
                RSADecryption form = null;
        try {
            form = new RSADecryption();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RSAEncryption.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RSAEncryption.class.getName()).log(Level.SEVERE, null, ex);
        }
                form.setVisible(true);
                form.setSize(823,508);
                form.setLocation(5, 5);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
                // f1.dispose();
                RSAframe form=new RSAframe();
                form.setVisible(true);
                form.setSize(1012,505);
                form.setLocation(5, 5);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RSAEncryption().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(RSAEncryption.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(RSAEncryption.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea encryp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
