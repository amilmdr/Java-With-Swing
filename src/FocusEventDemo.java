import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class FocusEventDemo implements FocusListener {
    JFrame f1;
    JTextField t1,t2;
 FocusEventDemo(){
     f1= new JFrame("FocusDemo");
     t1=new JTextField(30);
     t2=new JTextField(30);
     f1.setSize(300,300);
     f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f1.setLayout(new FlowLayout());
     
     f1.add(t1);
     f1.add(t2);
     t1.addFocusListener(this);
     t2.addFocusListener(this);
     f1.setVisible(true);
     
     
 } 
    public static void main(String[] args) {
        new FocusEventDemo();
    }
    public void focusGained(FocusEvent e){
        if(e.getSource()==t1){
            t1.setBackground(Color.cyan);
        }
        else{
            t2.setBackground(Color.cyan);
        }
    }
        public void focusLost(FocusEvent e){
        if(e.getSource()==t1){
            t1.setBackground(Color.white);
        }
        else{
            t2.setBackground(Color.white);
        }
    }
    
}
