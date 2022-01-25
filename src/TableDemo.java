import  javax.swing.*;
import  java.awt.*;
import  javax.swing.event.*;
public class TableDemo {
    JFrame f1;
    JTable tb1;
    JScrollPane jp;
    
  TableDemo(){
      f1=new JFrame("List Demo");
   f1.setSize(300,300);
   f1.setLayout(new BorderLayout());
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Object [][] data={{1,"ram",5000},{2,"rama",6000},{3,"raman",7000},{4,"ramana",8000},
            {5,"ramanand",9000},{6,"ramanandan",10000} };
    String [] cols={"ID","Name","Salary"};
    tb1=new JTable(data,cols);
    tb1.setGridColor(Color.red);
    tb1.setSelectionBackground(Color.green);
     tb1.setSelectionForeground(Color.white);
    //tb1.setEnabled(false);
    
    jp=new JScrollPane(tb1);
    f1.add(jp);
    f1.setVisible(true);
  } 
    public static void main(String[] args) {
        new   TableDemo();
    }
}
