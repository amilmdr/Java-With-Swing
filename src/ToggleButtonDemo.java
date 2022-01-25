import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ToggleButtonDemo implements ItemListener{
     JFrame f1;
     JToggleButton tb1;
     ToggleButtonDemo(){
       f1=new JFrame();
       f1.setSize(300,300);
       f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f1.setLayout(new FlowLayout(FlowLayout.LEFT));
       tb1=new JToggleButton("ok");
       tb1.addItemListener(this);
       f1.add(tb1);
       f1.setVisible(true);
     }
     public static void main(String[] args) {
        new ToggleButtonDemo();
    }

   
    public void itemStateChanged(ItemEvent e) {
      
       if(tb1.isSelected()){
           tb1.setText("off");
          
       }
       else{
          tb1.setText("on"); 
           
            tb1.setBackground(Color.green);
       }
    }
}
