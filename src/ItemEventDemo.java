import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ItemEventDemo {
    JFrame f1;
    JComboBox cb1;
    JTextField  t1;
    ItemEventDemo(){
     f1=new JFrame("ItemEvent");
    
     String items[]={"book","pen","copy","pencil","eraser"};
     cb1= new JComboBox(items);
     
     t1=new JTextField(20);
     cb1.addItemListener(new Actioner());
     f1.setSize(300,300);
     f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f1.setLayout(new FlowLayout());
     f1.setVisible(true);
     f1.add(cb1);
     f1.add(t1);
    }  
     public static void main(String[] args) {
        new ItemEventDemo();
    }
    
    class Actioner implements ItemListener{
        public void itemStateChanged(ItemEvent e){
             String s=cb1.getSelectedItem().toString();
            String i=cb1.getSelectedIndex()+"";
            t1.setText(s+" "+i);
        }
    }
}
