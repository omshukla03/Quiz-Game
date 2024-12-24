import java.awt.*;
import javax.swing.*;

public class Rules extends JFrame {
    String name;
    Rules(String name){
        this.name=name;

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading=new JLabel("Welcome "+ name +" to Simple minds");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        heading.setForeground(new Color(91,35,142));
        add(heading);

        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
