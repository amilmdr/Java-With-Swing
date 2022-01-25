import  javax.swing.*;
import  java.awt.*;
import  javax.swing.event.*;
public class ListDemo implements ListSelectionListener{
    JFrame f1;
    JList myList;
    JTextField t1;
    JScrollPane jp;

    public ListDemo() {
   f1=new JFrame("List Demo");
   f1.setSize(300,300);
   f1.setLayout(new FlowLayout());
   f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   t1=new JTextField(20);
   f1.add(t1);
   String items[]={"Tea","Coffee","Hot Lemon","Hot Chocolate",
       "Coke","Fanta","Sprite","Dew","Mirienda"
   };
   myList=new JList(items);
   myList.setVisibleRowCount(5);
  // myList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
   myList.addListSelectionListener(this);
   jp=new JScrollPane(myList);
   f1.add(jp);
   f1.setVisible(true);
    }
    public static void main(String[] args) {
        new ListDemo();
    }
    public void valueChanged (ListSelectionEvent e){
        String item=myList.getSelectedValuesList().toString();
        t1.setText(item);
        /* FOR single Slection  List
        String item=myList.getSelectedValues().toString();
        t1.setText(item);
        */
    }
}