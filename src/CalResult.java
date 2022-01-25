import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
  class CalResult implements ActionListener{
   JFrame f1;
    JTextField t1,t2,t3;
    JPanel p1,p2;
    JButton b1,b2,b3,b4;
    JLabel l1,l2,l3;
   CalResult()
{
    f1=new JFrame();
      l1=new JLabel("num1");
      l2=new JLabel("num2");
      l3=new JLabel("result");
      t1=new JTextField(20);
      t2=new JTextField(20);
      t3=new JTextField(20);
      p1=new JPanel();
      p2=new JPanel();
      
       p1.add(l1);p1.add(t1);
     p1.add(l2);p1.add(t2);
      p1.add(l3);p1.add(t3);
      b1=new JButton("add");
      b1.addActionListener(this);
       b2=new JButton("sub");
      b2.addActionListener(this);
       b3=new JButton("mul");
      b3.addActionListener(this);
      
       b4=new JButton("div");
      b4.addActionListener(this);
      p2.add(b1);p2.add(b2);p2.add(b3);p2.add(b4);
       f1.setSize(300,300);
       f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       f1.setLayout(new FlowLayout());
       f1.add(p1);f1.add(p2);
       f1.setVisible(true);
}
    public static void main(String[] args) {
        new CalResult();
    }
    public void actionPerformed(ActionEvent e) {
       int m =Integer.parseInt(t1.getText());
       int  n=Integer.parseInt(t2.getText());
        int c;
        if (e.getSource()==b1){
          c=m+n;
          t3.setText(c+"");
        }
        else if(e.getSource()==b2){
          c=m-n;
          t3.setText(c+"");
        }
        else if(e.getSource()==b3){
           c=m*n;
          t3.setText(c+"");
        }
        else{
            c=m/n;
          t3.setText(c+"");
        }
        
        
    }
}