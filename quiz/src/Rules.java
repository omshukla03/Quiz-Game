import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start,back;
    Rules(String name){
        this.name=name;

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading=new JLabel("Welcome "+ name +" to Quick Quiz");
        heading.setBounds(150, 20, 700, 30);
        heading.setFont(new Font("Georgia",Font.BOLD,28));
        heading.setForeground(new Color(91,35,142));
        add(heading);

        JLabel rules=new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Segoe UI",Font.PLAIN,18));
        //rules.setForeground(new Color(91,35,142));
        rules.setText(
            "<html>"+
            "1. The test contains 10 questions." + "<br><br>" +
            "2. Each question has 4 options out of which only one is correct." + "<br><br>" +
            "3. You have to select the correct option." + "<br><br>" +
            "4. You have 15 seconds to answer each question." + "<br><br>" +
            "5. You can't select any option once time starts." + "<br><br>" +
            "6. You can't exit the test in between." + "<br><br>" +
            "7. All the best!!!" + "<br><br>" +
            "<html>"
        );
        add(rules);

        back=new JButton("Back");
        back.setBounds(250, 500, 120, 30);
        back.setBackground(new Color(79, 88, 201));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start=new JButton("Start");
        start.setBounds(400, 500, 120, 30);
        start.setBackground(new Color(79, 88, 201));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);


        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){
            setVisible(false);
            // new Quiz(name);
        }
        else{
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
