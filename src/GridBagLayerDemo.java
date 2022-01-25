import javax.swing.*;
import java.awt.*;
public class GridBagLayerDemo {
    JFrame f1;
    JButton b1,b2,b3,b4,b5,b6,b7;
    
    GridBagLayerDemo () {
        f1 =new JFrame();
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         b1= new JButton("1");
         b2= new JButton("2"); 
         b3= new JButton("3");
          b4= new JButton("4");
           b5= new JButton("5");
              b6= new JButton("6");
           b7= new JButton("7");
           GridBagLayout g=new GridBagLayout();
           f1.setLayout(g); 
            GridBagConstraints gbc= new  GridBagConstraints();
           gbc.gridx=0;
           gbc.gridy=0;
           g.setConstraints(b1,gbc);
           f1.add(b1);
           gbc.gridx=1;
           gbc.gridy=0;
           g.setConstraints(b2,gbc);
           f1.add(b2); 
           gbc.gridx=2;
           gbc.gridy=0;
           g.setConstraints(b3,gbc);
           f1.add(b3);
           gbc.gridx=2;
           gbc.gridy=1;
           g.setConstraints(b5,gbc);
           f1.add(b5);
           gbc.gridx=2;
           gbc.gridy=2;
           g.setConstraints(b6,gbc);
           f1.add(b6);
           gbc.gridx=0;
           gbc.gridy=3;
           gbc.gridwidth=3;
           gbc.fill=GridBagConstraints.HORIZONTAL;
           g.setConstraints(b7,gbc);
           f1.add(b7);
           gbc.gridx=0;
           gbc.gridy=1;
           gbc.gridwidth=2;
           gbc.gridheight=2;
           gbc.fill=GridBagConstraints.BOTH;
           g.setConstraints(b4,gbc);
           f1.add(b4);
           f1.setVisible(true);
}
    public static void main(String[] args) {
        new  GridBagLayerDemo ();
    }
    
}
