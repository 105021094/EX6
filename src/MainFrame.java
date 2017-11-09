import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;




public class MainFrame extends JFrame {
    //EX1----------------------------------------------------------------
    private JLabel jlab = new JLabel("資工系林馥柔");
    private int frmW = 300, frmH = 150, screenW, screenH;
    private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    //EX2----------------------------------------------------------------
    private JButton jbtup = new JButton("↑");
    private JButton jbtdown = new JButton("↓");
    private JButton jbtleft = new JButton("←");
    private JButton jbtright = new JButton("→");
    private JLabel jlab2 = new JLabel();
    private int labX = 150, labY = 300;

    //EX3-------------------------------------------------------------------
    private JButton jbtmin = new JButton("Min");
    private JButton jbtmax = new JButton("Max");
    private JFileChooser chooser = new JFileChooser();
    //EX4------------------------------------------------------------------
    private JMenuBar jmb = new JMenuBar();
    private JMenu jmF = new JMenu("File");
    private JMenu jmS = new JMenu("Set");
    private JMenu jmG = new JMenu("Game");
    private JMenuItem jmiEX = new JMenuItem("EX");
    private JInternalFrame jif = new JInternalFrame();
    private JDesktopPane jdp = new JDesktopPane();



    public MainFrame() {
        initcomp();
    }

    private void initcomp() {
        //EX1----------------------------------------------------------------
        screenW = dim.width;
        screenH = dim.height;
        this.setBounds(screenW / 2 - frmW / 2, screenH / 2 - frmH / 2, frmW, frmW);
        this.setLayout(null);
        jlab.setOpaque(true);
        jlab.setBackground(Color.yellow);
        jlab.setBounds(100, 100, 80, 30);
        this.add(jlab);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        //EX2-----------------------------------------------------------------
        jlab2.setBounds(150, 300, 10, 10);
        jlab2.setOpaque(true);
        jlab2.setBackground(Color.gray);
        this.add(jlab2);

        this.add(jbtup);
        jbtup.setBounds(50, 400, 50, 50);
        jbtup.setBackground(Color.pink);
        jbtup.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labY -= 5;
                jlab2.setLocation(labX, labY);
            }
        });

        this.add(jbtdown);
        jbtdown.setBounds(100, 400, 50, 50);
        jbtdown.setBackground(Color.pink);
        jbtdown.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labY += 5;
                jlab2.setLocation(labX, labY);
            }
        });

        this.add(jbtleft);
        jbtleft.setBounds(150, 400, 50, 50);
        jbtleft.setBackground(Color.pink);
        jbtleft.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labX -= 5;
                jlab2.setLocation(labX, labY);
            }
        });

        this.add(jbtright);
        jbtright.setBounds(200, 400, 50, 50);
        jbtright.setBackground(Color.pink);
        jbtright.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labX += 5;
                jlab2.setLocation(labX, labY);
            }
        });

        //EX3-----------------------------------------------------------
        this.add(jbtmin);
        jbtmin.setBounds(600, 400, 60, 50);
        jbtmin.setBackground(Color.pink);
        this.add(jbtmax);
        jbtmax.setBounds(800, 400, 60, 50);
        jbtmax.setBackground(Color.pink);
        //EX4------------------------------------------------------------------
        this.setJMenuBar(jmb);
        this.setContentPane(jdp);
        jmb.add(jmF);
        jmb.add(jmS);
        jmb.add(jmG);
        jmF.add(jmiEX);
        jif.setBounds(0,0,300,100);
        jmiEX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jdp.add(jif);
                jif.setVisible(true);
            }
        });

    }
}
