import java.awt.*;
import javax.swing.*;

public class ShowFlowLayout extends JFrame{
    public ShowFlowLayout(){
        setLayout(new FlowLayout(FlowLayout.LEFT,20,10));

        add(new JLabel("First Name:"));
        add(new JTextField(10));
        add(new JLabel("MI:"));
        add(new JTextField(1));

        add(new JLabel("Last Name:"));
        add(new JTextField(10));
    }

    public static void main(String[]args){
        ShowFlowLayout frame=new ShowFlowLayout();
        frame.setTitle("ShowFlowLayout:");
        frame.setSize(350,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}