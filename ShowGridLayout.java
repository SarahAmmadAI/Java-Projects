import java.awt.*;
import javax.swing.*;

public class ShowGridLayout extends JFrame{
    public ShowGridLayout(){
        setLayout(new GridLayout(3,2,10,10));

        add(new JLabel("First Name:"));
        add(new JTextField(10));
        add(new JLabel("MI:"));
        add(new JTextField(10));
        add(new JLabel("Last Name:"));
        add(new JTextField(10));
    }

    public static void main(String[]args){
        ShowGridLayout frame=new ShowGridLayout();
        frame.setTitle("ShowGridLayout");
        frame.setSize(300,180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}