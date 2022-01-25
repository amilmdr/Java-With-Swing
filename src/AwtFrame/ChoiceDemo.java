package AwtFrame;
import java.awt.*;
import java.awt.event.*;

public class ChoiceDemo  extends WindowAdapter implements ItemListener{
    Frame f1;
    Choice c1;
    TextField t1;
ChoiceDemo(){
 f1 = new Frame();
     f1.setSize(300,300);
    
     f1.addWindowListener(this);
     c1=new Choice();
     c1.addItem("one");
     c1.addItem("two");
     c1.addItem("three");
     c1.addItem("four");
     c1.addItem("five");
     c1.addItem("six");
     c1.addItem("seven");
     c1.addItem("eight");
     c1.addItem("nine");
     c1.addItemListener(this);
     f1.add(c1);
      t1=new TextField(14);
      f1.add(t1);
      f1.setLayout(new FlowLayout());
     f1.setVisible(true);
}
    public static void main(String[] args) {
        new ChoiceDemo();
    }
    public void windowClosing(WindowEvent e){
        f1.dispose();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
      
       String item=c1.getSelectedItem();
       t1.setText(item);
    }
}
