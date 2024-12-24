
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    JButton rules,back;

    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0 , 600 ,500);
        add(image);

        JLabel heading=new JLabel("Simple Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(91,35,142));
        add(heading);

        JLabel name=new JLabel("Enter Your Name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Batai",Font.BOLD,18));
        name.setForeground(new Color(79, 88, 201));
        add(name);

        JTextField tfname=new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);

        rules=new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(79, 88, 201));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        back=new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(79, 88, 201));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setSize(1200,500);
        setVisible(true);
        setLocation(200,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==rules){
            setVisible(false);
            new Rules();
        }
        else if (ae.getSource()==back){
            setVisible(false);
        }
    }
    public static void main(String[] args) throws Exception {
        
        new Login();
    }
}
