import javax.swing.*;
import  java.awt.*;
import java.awt.event.*;
import java.util.*;
public class CopyPasteDeleteDemo implements ActionListener {
  JFrame f1; 
  ArrayList<String> ListData1=new ArrayList();
  ArrayList<String> ListData2=new ArrayList();
  JTextField t1,t2;
  JList l1,l2;
  JButton b1,b2,b3,b4,b5,b6,b7,b8;
  JScrollPane jp1,jp2;
  CopyPasteDeleteDemo(){
       f1=new JFrame();
       f1.setSize(500,500);
       f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f1.setLayout(null);
       t1=new JTextField(20);
       t1.addActionListener(this);
       t2=new JTextField(20);
       t2.addActionListener(this);
       l1=new JList();
       l2=new JList();
       b1=new JButton(">");
       b1.addActionListener(this);
       b2=new JButton("<");
       b2.addActionListener(this);
       b3=new JButton(">>");
       b3.addActionListener(this);
       b4=new JButton("<<");
       b4.addActionListener(this);
       b5=new JButton("Delete");
       b5.addActionListener(this);
       b6=new JButton("Delete All");
       b6.addActionListener(this);
       b7=new JButton("Delete");
       b7.addActionListener(this);
       b8=new JButton("Delete All" );
       b8.addActionListener(this);
       jp1=new JScrollPane(l1);
       jp2=new JScrollPane(l2);
       t1.setBounds(10,20,100,25);
       jp1.setBounds(10,55,100,200);
       
       
        t2.setBounds(250,20,100,25);
       jp2.setBounds(250,55,100,200);
       
       b1.setBounds(120,65,60,25);
        b2.setBounds(120,90,60,25);
       b3.setBounds(120,125,60,25);
        b4.setBounds(120,155,60,25);
        b5.setBounds(20,260,80,25);
        b6.setBounds(20,290,120,25);
       b7.setBounds(270,260,80,25);
        b8.setBounds(270,290,120,25);
      f1.add(t1); f1.add(t2);
       f1.add(jp1); f1.add(b1);f1.add(b2);f1.add(b3);f1.add(b4);f1.add(jp2);
      f1.add(b5);f1.add(b6); f1.add(b7);f1.add(b8);
       f1.setVisible(true);
  }
    public static void main(String[] args) {
        new CopyPasteDeleteDemo();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==t1){
            String item=t1.getText();
            if(!item.equals("")){
                ListData1.add(item);
                t1.setText("");
            }
            
        }
        else if(e.getSource()==t2){
             String item=t2.getText();
            if(!item.equals("")){
                ListData2.add(item);
                t2.setText("");
            }
        }
        else if(e.getSource()==b1){
            Object ob=l1.getSelectedValue();
            if(ob!=null){
                String item=ob.toString();
                ListData2.add(item);
                ListData1.remove(item);
            }
    }
      else if(e.getSource()==b2){
          Object ob=l2.getSelectedValue();
            if(ob!=null){
                String item=ob.toString();
                ListData1.add(item);
                ListData2.remove(item);
                
            }
      } 
      else if(e.getSource()==b3){
       int size=ListData1.size();
       for(int i=0;i<size;i++){
           String item=ListData1.get(0);
           ListData2.add(item);
           ListData1.remove(item);
       }
        
    }
      else if(e.getSource()==b4){
           int size=ListData2.size();
       for(int i=0;i<size;i++){
           String item=ListData2.get(0);
           ListData1.add(item);
           ListData2.remove(item);
       }
      }
       else if(e.getSource()==b5){
            Object ob=l1.getSelectedValue();
            if(ob!=null){
                String item=ob.toString();
                
                ListData1.remove(item); 
        
    }
       } 
      else if(e.getSource()==b6){
        int size=ListData1.size();
       for(int i=0;i<size;i++){
           String item=ListData1.get(0);
          
           ListData1.remove(item);
       }   
      } 
      else if(e.getSource()==b7){
           Object ob=l2.getSelectedValue();
            if(ob!=null){
                String item=ob.toString();
                
                ListData2.remove(item); 
      }
            
        
    }
      else if(e.getSource()==b8){
           int size=ListData2.size();
       for(int i=0;i<size;i++){
           String item=ListData2.get(0);
          
           ListData2.remove(item);
       }   
          
      }
       l1.setListData(ListData1.toArray());
       l2.setListData(ListData2.toArray());
    }
    
}
