import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ValidationDemo extends KeyAdapter{
     JFrame f1;
    JTextField t1,t2;
    JLabel l1,l2;
 ValidationDemo(){
     f1=new JFrame();
      l1=new JLabel("NAME");
       l2=new JLabel("Cell no");
      t1=new JTextField(30);
      t2=new JTextField(30);
      t1.addKeyListener(this);
      t2.addKeyListener(this);
       f1.setSize(300,300);
       f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f1.setLayout(new FlowLayout(FlowLayout.LEFT));
       f1.add(l1);f1.add(t1);f1.add(l2);f1.add(t2);
       f1.setVisible(true);
 }   
    public static void main(String[] args) {
        new  ValidationDemo();
    }
     public void keyTyped(KeyEvent e) {
         char ch = e.getKeyChar();
         String s=t2.getText();
         int l=s.length();
      if(e.getSource()==t1){
          if(!(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')){
            e.consume();
          }
          
      }
      else if(e.getSource()==t2){
        if(!(ch>='0'&&ch<='9'&&l<10)){
            e.consume();
          }  
      }
     }
}
