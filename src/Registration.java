import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Registration extends JFrame implements ActionListener {
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JButton b1 = new JButton("Sign up");
    JButton b2 = new JButton("Login");
    JLabel l1 = new JLabel("Full Name :");
    JLabel l2 = new JLabel("Email :");
    JLabel l3 = new JLabel("Password :");
    JLabel l4 = new JLabel("Sign up ");
    JLabel l5 = new JLabel("Confirm Password :");
    JLabel l6 = new JLabel("already have an account ");
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JPasswordField();
    JTextField t4 = new JPasswordField();
public Registration(){

    setSize(650,730);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(false);
    setResizable(false);
    setLocation(410,2);
    setTitle("Sign up");
    p1.setBackground(Color.gray);
    p2.setBackground(Color.decode("#dbdbdb"));
    p2.setBounds(70,60,480,580);
    add(p1); p1.add(p2);
    p1.setLayout(null);p2.setLayout(null);
    l4.setBounds(180,7,150,100);
    l4.setFont(new Font("a",Font.BOLD,29));
    p2.add(l4);
    l1.setBounds(60,50,100,100);
    l1.setFont(new Font("a",Font.BOLD,17));
    p2.add(l1);
    l2.setBounds(60,150,100,100);
    l2.setFont(new Font("a",Font.BOLD,17));
    p2.add(l2);
    l3.setBounds(60,250,100,100);
    l3.setFont(new Font("a",Font.BOLD,17));
    p2.add(l3);
    l5.setBounds(60,350,180,100);
    l5.setFont(new Font("a",Font.BOLD,17));
    p2.add(l5);
    l6.setBounds(60,500,240,100);
    l6.setFont(new Font("a",Font.BOLD,13));
    p2.add(l6);
    t1.setBounds(60,130,350,30);
    t1.setFont(new Font("a",Font.BOLD,17));
    p2.add(t1);
    t2.setBounds(60,230,350,30);
    t2.setFont(new Font("a",Font.BOLD,17));
    p2.add(t2);
    t3.setBounds(60,330,350,30);
    t3.setFont(new Font("a",Font.BOLD,17));
    p2.add(t3);
    t4.setBounds(60,430,350,30);
    t4.setFont(new Font("a",Font.BOLD,17));
    p2.add(t4);
    b1.setBounds(80,490,310,40);
    b1.setFont(new Font("a",Font.BOLD,17));
    b1.setBackground(Color.decode("#4ba600"));
    b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    b1.setFocusable(false);
    p2.add(b1);
    b2.setBounds(204,529,80,40);
    b2.setFont(new Font("a",Font.BOLD,16));
    b2.setOpaque(false);
    b2.setContentAreaFilled(false);
    b2.setBorderPainted(false);
    b2.setForeground(Color.decode("#4ba600"));
    b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
    b2.setFocusable(false);
    p2.add(b2);
    b1.addActionListener(this);
    b2.addActionListener(this);

}



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b2){
            Login L = new Login();
            L.setVisible(true);
            setVisible(false);

        }
    }
}
