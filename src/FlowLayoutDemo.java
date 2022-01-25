
import javax.swing.*;
import  java.awt.*;
public class FlowLayoutDemo {
    JFrame f1;
    JTextField t1,t2,t3;
    JLabel l1,l2,l3;
    JButton b1;
    FlowLayoutDemo (){
       f1=new JFrame();
       l1=new JLabel("name");
      l2=new JLabel("addresh");
      l3=new JLabel("Email");
      t1=new JTextField(20);
      t2=new JTextField(20);
      t3=new JTextField(20);
      b1=new JButton("submit");
       f1.setSize(300,300);
       f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f1.setLayout(new FlowLayout(FlowLayout.LEFT));
       f1.add(l1);f1.add(t1);f1.add(l2);f1.add(t2);f1.add(l3);f1.add(t3);f1.add(b1);
       f1.setVisible(true);
    }
    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}
