import javax.swing.*;
import java.awt.*;
public class SetBoundsDemo {
    JFrame f1;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1,b2;
    SetBoundsDemo(){
        f1=new JFrame();
        f1.setSize(400,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);
        l1=new JLabel("Name");
        l1.setBounds(10,10,80,25);
        f1.add(l1);
        t1=new JTextField();
        t1.setBounds(100,10,200,25);
        f1.add(t1);
         l2=new JLabel("Age");
        l2.setBounds(10,45,80,25);
        f1.add(l2);
        t2=new JTextField();
        t2.setBounds(100,45,80,25);
        f1.add(t2);
         l3=new JLabel("Addresh");
        l3.setBounds(10,80,80,25);
        f1.add(l3);
        t3=new JTextField();
        t3.setBounds(100,80,200,25);
        f1.add(t3);
          b1= new JButton("ok",new ImageIcon("e:/php.png"));
           b1.setBounds(10,115,80,25);
           f1.add(b1);
         b2= new JButton("cancel"); 
          b2.setBounds(100,115,80,25);
           f1.add(b2);
           f1.setVisible(true);
        
    }
    public static void main(String[] args) {
        new SetBoundsDemo();
    }
}
