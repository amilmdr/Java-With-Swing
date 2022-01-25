import javax.swing.*;
import java.awt.*;
public class GridLayoutDemo {
    JFrame f1;
    JButton b1,b2,b3,b4,b5;
    GridLayoutDemo(){
        f1=new JFrame();
        f1.setSize(300,300);
        b1= new JButton("one");
         b2= new JButton("two"); 
         b3= new JButton("three");
          b4= new JButton("four");
          
          
          
           b5= new JButton("five");
           
           
           f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          // f1.setLayout(new GridLayout());
           f1.setLayout(new GridLayout(3,2));
           // f1.setLayout(new GridLayout(3,2,10,10));
           f1.add(b1);f1.add(b2);f1.add(b3);f1.add(b4);f1.add(b5);
           f1.setVisible(true);
    }
    public static void main(String[] args) {
       new  GridLayoutDemo();
    }
    
    
}
