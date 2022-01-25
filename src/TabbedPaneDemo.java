import java.awt.*;
import javax.swing.*;

public class TabbedPaneDemo {
   JFrame f1;
   JTabbedPane tp;
   JPanel p1,p2;
   JButton b1,b2,b3,b4;
   TabbedPaneDemo(){
       f1=new JFrame("tabbedpane");
       f1.setSize(300,300);
       f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f1.setLayout(new BorderLayout());
       tp=new JTabbedPane();
       f1.add(tp);     
       p1=new JPanel();
       p2=new JPanel();
       b1=new JButton("one");
       b2=new JButton("two");
       b3=new JButton("three");
       b4=new JButton("four");
       p1.add(b1);
       p1.add(b2);
       p2.add(b3);
       p2.add(b4);
        tp.add("one",p1);
       tp.add("Two",p2);
       f1.setVisible(true);
   }
    public static void main(String[] args) {
       new  TabbedPaneDemo();
    }
}
