
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    JButton rules,back;
    JTextField tfname;

    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0 , 600 ,500);
        add(image);

        JLabel heading=new JLabel("Quick Quiz");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Georgia",Font.BOLD,40));
        heading.setForeground(new Color(91,35,142));
        add(heading);

        JLabel name=new JLabel("Enter Your Name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Segoe UI",Font.BOLD,18));
        name.setForeground(new Color(79, 88, 201));
        add(name);

        tfname=new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Roboto", Font.PLAIN, 20));
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
            String name=tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if (ae.getSource()==back){
            setVisible(false);
        }
    }
    public static void main(String[] args) throws Exception {
        
        new Login();
    }
}
