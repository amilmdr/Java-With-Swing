package AwtFrame;
import java.awt.*;
import java.awt.event.*;

public class CheckboxDemo extends WindowAdapter{
    Frame f1;
    Checkbox cb1,cb2,cb3,cb4;
    CheckboxDemo(){
         f1 = new Frame();
     f1.setSize(300,300); 
     f1.addWindowListener(this);
     f1.setLayout(new FlowLayout());
     CheckboxGroup cbg=new CheckboxGroup();
     cb1=new Checkbox("male",cbg, false);
     cb2=new Checkbox("Female",cbg,false);
      cb3=new Checkbox("music");
     cb4=new Checkbox("reading");
     f1.add(cb1);
     f1.add(cb2);
      f1.add(cb3);
     f1.add(cb4);
   
     f1.setVisible(true);
    }
    public static void main(String[] args) {
         new CheckboxDemo(); 
    }
     public void windowClosing(WindowEvent e){
        f1.dispose();
     }
}
