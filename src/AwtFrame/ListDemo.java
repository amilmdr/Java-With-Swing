package AwtFrame;
import java.awt.*;
import java.awt.event.*;
public class ListDemo extends WindowAdapter implements ItemListener {
   Frame f1;
   List l1;
   TextField t1;
   ListDemo (){
     f1 = new Frame();
     f1.setSize(300,300);
     f1.addWindowListener(this);
     l1=new List(4,true);
     l1.add("one");
     l1.add("two");
     l1.add("three");
     l1.add("four");
     l1.add("five");
     l1.add("six");
     l1.add("seven");
     l1.add("eight");
     l1.add("nine");
     l1.addItemListener(this);
     f1.add(l1);
      t1=new TextField(14);
      f1.add(t1);
      f1.setLayout(new FlowLayout());
     f1.setVisible(true);
      
   }
   @Override
    public void itemStateChanged(ItemEvent e) {
       String item[]=l1.getSelectedItems();
       String s="";
       for(String m:item){
           s+=m;
            t1.setText(s);
       }
    }
     public void windowClosing(WindowEvent e){
        f1.dispose();
}
     public static void main(String[] args) {
        new ListDemo ();
    }
}
