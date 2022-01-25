import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class InterestCalculation{
    JFrame f1;
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2;
  InterestCalculation(){
      f1=new JFrame();
      f1.setSize(300,300);
       f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f1.setLayout(new FlowLayout());
       l1=new JLabel("Principal amount");
       l2=new JLabel("Rate of Interest");
        l3=new JLabel("Time Period");
         l4=new JLabel("Interest");
       l5=new JLabel("Total Amount");
      t1=new JTextField(20);
      t2=new JTextField(20);
      t3=new JTextField(20);
      t4=new JTextField(20);
      t5=new JTextField(20);
     b1 =new JButton("Calculate");
     b2 =new JButton("Clear");
     b1.addActionListener(new ActionDemo());
     b2.addActionListener(new ActionDemo());
     t1.addFocusListener(new FocusDemo());
      t2.addFocusListener(new FocusDemo ());
      t3.addFocusListener(new FocusDemo ()); 
      t1.addKeyListener(new KeyDemo());
      t2.addKeyListener(new KeyDemo());
      t3.addKeyListener(new KeyDemo()); 
      t4.setEditable(false);
      t5.setEditable(false);
      f1.add(l1);f1.add(t1);
      f1.add(l2);f1.add(t2);
      f1.add(l3);f1.add(t3);
      f1.add(l4);f1.add(t4);
      f1.add(l5);f1.add(t5);
      f1.add(b1);f1.add(b2);
      f1.setVisible(true);
      
  }
    public static void main(String[] args) {
        new InterestCalculation();
    }
   class FocusDemo implements FocusListener{

      public void focusGained(FocusEvent e){
        if(e.getSource()==t1){
            t1.setBackground(Color.cyan);
        }
        else if(e.getSource()==t2){
           t2.setBackground(Color.cyan);  
        }
        else{
            t3.setBackground(Color.cyan);
        }
    }
        public void focusLost(FocusEvent e){
        if(e.getSource()==t1){
            t1.setBackground(Color.white);
        }
        else if(e.getSource()==t2){
             t2.setBackground(Color.white); 
        }
        else{
            t3.setBackground(Color.white);
        }
    }
                   }
   
   
    class ActionDemo implements ActionListener{
       
        public void actionPerformed(ActionEvent e){
             if(e.getSource()==b1){
           double p=Double.parseDouble(t1.getText());
           double t=Double.parseDouble(t2.getText());
           double r=Double.parseDouble(t3.getText());
           double i=(p*t*r)/10;
           double a=i+p;
           t4.setText(i+"");
            t5.setText(a+"");
        }
             else{
                  t1.setText(""); t2.setText("");
                   t3.setText("");
                    
                  
                 t4.setText("");
                 t5.setText("");
             }
        }
    } 
    class KeyDemo extends KeyAdapter{
    public void keyTyped(KeyEvent e) {
         char ch = e.getKeyChar();
        
      if(e.getSource()==t1){
          if(!((ch>='0'&&ch<='9')||ch=='.')){
            e.consume();
          }
      }
      else if(e.getSource()==t2){
        if(!((ch>='0'&&ch<='9')||ch=='.')){
            e.consume();
          }  
      }
       else if(e.getSource()==t3){
        if(!((ch>='0'&&ch<='9')||ch=='.')){
            e.consume();
          }  
      }
     }
    }
       }