/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cryptography;

import javax.swing.SwingUtilities;
public class Main{
    public static void main(String args[])throws Exception
    {
        Splash s=new Splash();
        s.setVisible(true);

        Thread t=Thread.currentThread();
        t.sleep(10000);
        s.dispose();
        SwingUtilities.invokeLater(new Runnable(){
            public void run()
            {
                //opening the main application
                // new NewLogin().setVisible(true);
                 NewLogin form=new NewLogin();

                form.setSize(900,700);
                form.setLocation(5, 5);
  form.setVisible(true);
            }
        });
    }

}