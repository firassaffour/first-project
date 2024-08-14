import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MainPage extends JFrame implements ActionListener  {
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JButton b1 = new JButton();
    JButton b2 = new JButton();
    JButton b3 = new JButton("Sign Up");
    JButton b4 = new JButton("Login");
    JLabel l1 = new JLabel("Choose a system");

    public MainPage(){
        setSize(1000,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(false);
        setResizable(false);
        setLocation(280,10);
        setTitle("Main Page");
        p1.setBackground(Color.gray);
        p2.setBackground(Color.decode("#dbdbdb"));
        p2.setBounds(60,60,850,540);
        add(p1); p1.add(p2);
        p1.setLayout(null);p2.setLayout(null);
        l1.setBounds(270,50,300,100);
        l1.setFont(new Font("a",Font.BOLD,35));
        p2.add(l1);
        b1.setBounds(150,180,250,250);
        ImageIcon ic1 = new ImageIcon("android.jpg");
        Image img1 = ic1.getImage();
        Image imgScale1 = img1.getScaledInstance(b1.getWidth(),b1.getHeight(),Image.SCALE_SMOOTH);
        ic1 = new ImageIcon(imgScale1);
        b1.setIcon(ic1);
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p2.add(b1);
        b2.setBounds(450,180,250,250);
        ImageIcon ic2 = new ImageIcon("apple.png");
        Image img2 = ic2.getImage();
        Image imgScale2 = img2.getScaledInstance(b2.getWidth(),b2.getHeight(),Image.SCALE_SMOOTH);
        ic2 = new ImageIcon(imgScale2);
        b2.setIcon(ic2);
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p2.add(b2);
        b3.setBounds(760,10,100,40);
        b3.setBackground(Color.white);
        b3.setFont(new Font("a",Font.BOLD,12));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFocusable(false);
        p1.add(b3);
        b4.setBounds(870,10,100,40);
        b4.setBackground(Color.decode("#4ba600"));
        b4.setFont(new Font("a",Font.BOLD,12));
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setFocusable(false);
        p1.add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

    }






    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1) {
            AndroidPage AN = new AndroidPage();
            AN.setVisible(true);
            setVisible(false);
        }

        if (e.getSource()==b2){
            ApplePage AP = new ApplePage();
            AP.setVisible(true);
            setVisible(false);
        }
        if (e.getSource()==b3) {
            Registration R = new Registration();
            R.setVisible(true);
            setVisible(false);
        }

        if (e.getSource()==b4){
            Login L = new Login();
            L.setVisible(true);
            setVisible(false);
        }
    }
}
