import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
  class EvenOdd implements ActionListener{
 
   JFrame f1;
    JTextField t1,t2;
   
    JButton b1;
  EvenOdd()
{
    f1=new JFrame();
      
      t1=new JTextField(20);
      t2=new JTextField(20);
      t2.setEditable(false);
     
      b1=new JButton("Check");
      b1.addActionListener(this);
      
       f1.setSize(300,300);
       f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f1.setLayout(new FlowLayout(FlowLayout.LEFT));
       f1.add(t1);f1.add(t2);f1.add(b1);;
       f1.setVisible(true);
    
}
    public static void main(String[] args) {
        new  EvenOdd();
    }

    public void actionPerformed(ActionEvent e) {
       int n =Integer.parseInt(t1.getText());
        
        if (n%2==0){
          t2.setText("Even");  
        }
        else{
           t2.setText("Odd");
        }
    }
}