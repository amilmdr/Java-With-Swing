
package Applet;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class HelloDemo extends Applet implements ActionListener{
    TextField t1;
    Button b1; 
    public void init(){
        t1=new TextField(10);
        b1=new Button("ok");
        setLayout(new FlowLayout());
        add(t1);
        add(b1);
        b1.addActionListener(this);
        
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            t1.setText("hello");
        }
        
        
        
        
    }
    
}
