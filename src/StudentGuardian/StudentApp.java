
package StudentGuardian;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class StudentApp {
    JFrame f1;
   JTabbedPane tp;
  StudentApp(){
      f1=new JFrame("tabbedpane");
       f1.setSize(250,300);
       f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f1.setLayout(new BorderLayout());
        tp=new JTabbedPane();
       f1.add(tp);
         tp.add("Student",new Student());
       tp.add("Guardian",new Guardian());
       f1.setVisible(true);
  } 
    public static void main(String[] args) {
        new  StudentApp();
    }
}
