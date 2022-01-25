import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 class MessageDialogDemo  implements ActionListener{
     JFrame f1;
    JTextField t1;
    JButton b1;
     
    
  MessageDialogDemo(){
        f1=new JFrame();
      
      t1=new JTextField(20);
     
      b1=new JButton("ok");
      b1.addActionListener(this);
       f1.setSize(300,300);
       f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f1.setLayout(new FlowLayout(FlowLayout.LEFT));
       f1.add(t1);f1.add(b1);
       f1.setVisible(true);
  }
     public static void main(String[] args) {
        new  MessageDialogDemo();
    }
     public void actionPerformed(ActionEvent e) {
        String s=t1.getText();
        int len =s.length();
         
             
         
        JOptionPane.showMessageDialog(null,"No of character=" +len);
        
    }
}
