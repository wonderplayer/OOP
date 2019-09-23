import java.awt.*;
import javax.swing.*;

public class FontNames extends JPanel {
    public void paintComponent(Graphics g)
    {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fonts = ge.getAvailableFontFamilyNames();

        int vRef = 30;
        int vGap = 15;
        int platums;
        FontMetrics metrics;
        g.drawString("The first 10 fonts on this system are: ", 30, vRef);
        for (int k = fonts.length - 1; k > fonts.length - 11; k--) {
            vRef += vGap;
            g.setFont(new Font(fonts[k], Font.PLAIN, 12));
            g.drawString("Hello World!", 30, vRef);
            metrics = getFontMetrics(g.getFont());
            platums = metrics.stringWidth("Hello world!");

            g.setFont(new Font("Arial", Font.PLAIN, 12));
            g.drawString("(" + fonts[k] + ")", 30 + platums + 10, vRef);
        }
        g.drawString(String.format("Font count: %s", fonts.length),30, vRef + vGap);
    }



    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame jfrm = new JFrame();
                jfrm.setSize(500,500);
                jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jfrm.setVisible(true);

                jfrm.getContentPane().add(new FontNames());
            }
        });
    }
}