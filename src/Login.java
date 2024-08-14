import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JButton b1 = new JButton("Sign Up");
    JButton b2 = new JButton("Login");
    JButton b3 = new JButton("Guest");
    JLabel l1 = new JLabel("Full Name :");
    JLabel l2 = new JLabel("Password :");
    JLabel l3 = new JLabel("Login");
    JTextField t1 = new JTextField();
    JTextField t2 = new JPasswordField();


public Login(){
    setSize(650,650);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(false);
    setResizable(false);
    setLocation(460,50);
    setTitle("Login");
    p1.setBackground(Color.gray);
    p2.setBackground(Color.decode("#dbdbdb"));
    p2.setBounds(70,70,480,470);
    add(p1); p1.add(p2);
    p1.setLayout(null);p2.setLayout(null);
    l1.setBounds(60,70,100,100);
    l1.setFont(new Font("a",Font.BOLD,17));
    p2.add(l1);
    l2.setBounds(60,170,100,100);
    l2.setFont(new Font("a",Font.BOLD,17));
    p2.add(l2);
    l3.setBounds(200,15,100,100);
    l3.setFont(new Font("a",Font.BOLD,29));
    p2.add(l3);
    t1.setBounds(60,150,350,30);
    t1.setFont(new Font("a",Font.BOLD,17));
    p2.add(t1);
    t2.setBounds(60,250,350,30);
    t2.setFont(new Font("a",Font.BOLD,17));
    p2.add(t2);
    b1.setBounds(80,340,110,40);
    b1.setBackground(Color.white);
    b1.setFont(new Font("a",Font.BOLD,17));
    b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    b1.setFocusable(false);
    p2.add(b1);
    b2.setBounds(280,340,110,40);
    b2.setBackground(Color.decode("#4ba600"));
    b2.setFont(new Font("a",Font.BOLD,17));
    b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
    b2.setFocusable(false);
    p2.add(b2);
    b3.setBounds(90,400,290,40);
    b3.setBackground(Color.gray);
    b3.setFont(new Font("a",Font.BOLD,17));
    b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
    b3.setFocusable(false);
    p2.add(b3);

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);

}



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1) {
            Registration R = new Registration();
            R.setVisible(true);
            setVisible(false);
        }

        if (e.getSource()==b3){
            MainPage M = new MainPage();
            M.setVisible(true);
            setVisible(false);
        }


    }

}
