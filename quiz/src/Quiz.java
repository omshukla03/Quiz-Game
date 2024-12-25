import java.awt.*;
import javax.swing.*;

public class Quiz extends JFrame {
    
    Quiz(){
        setBounds(50,0,1440,850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0 , 1440 ,392);
        add(image);

        JLabel qno=new JLabel("1");
        qno.setBounds(100, 450, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);

        setVisible(true);

    }

    public static void main(String[] args) {
        new Quiz();
    }
}
