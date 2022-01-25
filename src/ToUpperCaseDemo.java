import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 class ToUpperCaseDemo implements ActionListener{
 
   JFrame f1;
    JTextField t1;
   
    JButton b1,b2;
 ToUpperCaseDemo()
{

    f1=new JFrame();
      
      t1=new JTextField(20);
     
      b1=new JButton("ok");
      b1.addActionListener(this);
      b2=new JButton("cancel");
      b2.addActionListener(this);
       f1.setSize(300,300);
       f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f1.setLayout(new FlowLayout(FlowLayout.LEFT));
       f1.add(t1);f1.add(b1);f1.add(b2);
       f1.setVisible(true);
    
}
    public static void main(String[] args) {
        new ToUpperCaseDemo();
    }
    public void actionPerformed(ActionEvent e) {
        String s=t1.getText();
        if (e.getSource()==b1){
          t1.setText(s.toUpperCase());  
        }
        else{
            t1.setText(s.toLowerCase());
        }
        
    }
}