import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ApplePage extends JFrame implements ActionListener {
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JButton b1 = new JButton("<-- Back");
    JButton b2 = new JButton("Sign Up");
    JButton b3 = new JButton("Login");
    JButton b4 = new JButton();
    JButton b5 = new JButton();
    JLabel l1 = new JLabel();
    String t = "<html> Apple Inc. is an American multinational corporation and<br> technology company headquartered in Cupertino, California, in Silicon Valley.<br> It designs, develops, and sells consumer electronics, computer <br>software, and online services. Devices include the iPhone,<br> iPad, Mac, Apple Watch, Vision Pro, and Apple TV; operating systems include iOS, iPadOS,<br> macOS, watchOS, tvOS, and visionOS; and software applications and<br> services include iTunes, iCloud, Apple Music, and Apple TV+ <html>";
    JLabel l2 = new JLabel(t);
    JLabel l3 = new JLabel("Apple");

    public ApplePage() {
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(false);
        setResizable(false);
        setLocation(280, 10);
        setTitle("Apple Page");
        p1.setBackground(Color.gray);
        p2.setBackground(Color.decode("#dbdbdb"));
        p2.setBounds(60, 60, 850, 540);
        add(p1);
        p1.add(p2);
        p1.setLayout(null);
        p2.setLayout(null);
        b1.setBounds(20,10,100,40);
        b1.setBackground(Color.red);
        b1.setFont(new Font("a",Font.BOLD,12));
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setFocusable(false);
        p1.add(b1);
        b2.setBounds(760,10,100,40);
        b2.setBackground(Color.white);
        b2.setFont(new Font("a",Font.BOLD,12));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setFocusable(false);
        p1.add(b2);
        b3.setBounds(870,10,100,40);
        b3.setBackground(Color.decode("#4ba600"));
        b3.setFont(new Font("a",Font.BOLD,12));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFocusable(false);
        p1.add(b3);
        b4.setBounds(670,30,70,70);
        ImageIcon ic1 = new ImageIcon("android.jpg");
        Image img1 = ic1.getImage();
        Image imgScale1 = img1.getScaledInstance(b4.getWidth(),b4.getHeight(),Image.SCALE_SMOOTH);
        ic1 = new ImageIcon(imgScale1);
        b4.setIcon(ic1);
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p2.add(b4);
        b5.setBounds(750,30,70,70);
        ImageIcon ic2 = new ImageIcon("apple.png");
        Image img2 = ic2.getImage();
        Image imgScale2 = img2.getScaledInstance(b5.getWidth(),b5.getHeight(),Image.SCALE_SMOOTH);
        ic2 = new ImageIcon(imgScale2);
        b5.setIcon(ic2);
        b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b5.setEnabled(false);
        p2.add(b5);
        l1.setBounds(540,150,280,330);
        ImageIcon ic3 = new ImageIcon("appon.jpeg");
        Image img3 = ic3.getImage();
        Image imgScale3 = img3.getScaledInstance(l1.getWidth(),l1.getHeight(),Image.SCALE_SMOOTH);
        ic3 = new ImageIcon(imgScale3);
        l1.setIcon(ic3);
        p2.add(l1);
        l2.setBounds(50,120,480,300);
        l2.setFont(new Font("a",Font.BOLD,17));
        p2.add(l2);
        l3.setBounds(50,30,100,100);
        l3.setFont(new Font("a",Font.BOLD,30));
        p2.add(l3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1) {
            MainPage M = new MainPage();
            M.setVisible(true);
            setVisible(false);
        }
        if (e.getSource()==b2) {
            Registration R = new Registration();
            R.setVisible(true);
            setVisible(false);
        }

        if (e.getSource()==b3){
            Login L = new Login();
            L.setVisible(true);
            setVisible(false);
        }
        if (e.getSource()==b4) {
            AndroidPage AN = new AndroidPage();
            AN.setVisible(true);
            setVisible(false);
        }

        if (e.getSource()==b5){
            ApplePage AP = new ApplePage();
            AP.setVisible(true);
            setVisible(false);
        }
    }
}
