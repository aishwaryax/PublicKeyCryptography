package cryptography;
import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Splash extends JFrame {

    private JLabel imglabel;
    private ImageIcon img;
    private static JProgressBar pbar;
    Thread t = null;

    public Splash() {
        super("PUBLIC KEY CRYPTOGRAPHY -- by Aishwarya, Ria and Nilesh");
        setSize(650, 510);
        setBackground(Color.blue);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
       // setUndecorated(true);
        img = new ImageIcon(getClass().getResource("bg.jpg"));
        imglabel = new JLabel(img);
        add(imglabel);
        setLayout(null);
        pbar = new JProgressBar();
        pbar.setMinimum(0);
        pbar.setMaximum(100);
        pbar.setStringPainted(true);
        pbar.setForeground(Color.RED);
        pbar.setBackground(Color.darkGray);
        imglabel.setBounds(0, 0, 626, 399);
        add(pbar);
        pbar.setPreferredSize(new Dimension(410, 30));
        pbar.setBounds(0, 390, 626, 20);

        Thread t = new Thread() {

            @Override
            public void run() {
                int i = 0;
                while (i <= 100) {
                    pbar.setValue(i);
                    try {
                        sleep(90);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    i++;
                }
            }
        };
        t.start();
    }
}