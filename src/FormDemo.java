import javax.swing.*;
import  java.awt.*;
public class FormDemo {
     JFrame f1;
    JTextField t1,t2,t3;
    JLabel l1,l2,l3;
    JButton b1,b2,b3,b4;
    JPanel p1,p2;
    FormDemo(){
         f1=new JFrame("FormDemo");
         f1.setSize(300,300);
         f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  f1.setLayout(new BorderLayout());
        p1=new JPanel();
        p1.setLayout(new GridLayout(3,2));
        p2=new JPanel();
        l1=new JLabel("name");
      l2=new JLabel("addresh");
      l3=new JLabel("Email");
      t1=new JTextField(5);
      t2=new JTextField(10);
      t3=new JTextField(10);
        b1= new JButton("one");
         b2= new JButton("two"); 
         b3= new JButton("three");
          b4= new JButton("four"); 
           f1.add(p1,BorderLayout.CENTER);
           f1.add(p2,BorderLayout.SOUTH);
          p1.add(l1);p1.add(t1);
           p1.add(l2);p1.add(t2);
            p1.add(l3);p1.add(t3);
            p2.add(b1);
            p2.add(b2);
            p2.add(b3);
            p2.add(b4);
            f1.setResizable(false);
         f1.setVisible(true);
         
    }
    public static void main(String[] args) {
        new FormDemo();
    }
}
