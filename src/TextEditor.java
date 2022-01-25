import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.text.*;
public class TextEditor implements ActionListener {
    JFrame f1;
      JMenuBar mbar;
      JMenu m1,m2,m3,m4,m5;
      JTextArea t1;
      JScrollPane jp;
      JMenuItem nw,op,sv,et,ct,cp,pe,ft,ww,au,bg,fg; 
       JLabel l1;
       JDialog d1;
          Font f;
          String fileName;
      TextEditor(){
         f1=new JFrame("My Text Editor");
          mbar=new JMenuBar();
      m1=new JMenu("File");
     
       m2=new JMenu("Edit");
       m3=new JMenu("Format");  
       m4=new JMenu("Help");
       m5=new JMenu("Color");
      mbar.add(m1);
      mbar.add(m2);
      mbar.add(m3);
      mbar.add(m4);
      mbar.add(m5);
      
      
     nw= new JMenuItem("new");
     nw.addActionListener(this);
       nw.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_MASK));
     
     op= new JMenuItem("open");
      op.addActionListener(this);
     op.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0,InputEvent.CTRL_MASK));
    
     sv= new JMenuItem("save");
     sv.addActionListener(this);
     sv.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK));
     et= new JMenuItem("exit");
     et.addActionListener(this);
     ct= new JMenuItem(new DefaultEditorKit.CutAction());
     ct.setText("Cut");
     
     
     
     cp= new JMenuItem(new DefaultEditorKit.CopyAction());
     cp.setText("Coppy");
     pe= new JMenuItem(new DefaultEditorKit.PasteAction());
    pe.setText("Paste");
     ft= new JMenuItem("font");
     ft.addActionListener(this);
     ww= new JMenuItem("Word Wrap");
     ww.addActionListener(this);
     au= new JMenuItem("About Us");
     au.addActionListener(this);
     bg= new JMenuItem("Back ground");
     bg.addActionListener(this);
     fg= new JMenuItem("Fore ground");
     fg.addActionListener(this);
             
            
      m1.add(nw);
      m1.add(op);
      m1.add(sv);
      m1.add(et);
      m2.add(ct);
      m2.add(cp);
      m2.add(pe);
      m3.add(ft);
      m3.add(ww);
      m4.add(au);
      m5.add(bg);
      m5.add(fg);
      au.addActionListener(this);
 t1=new JTextArea();
 jp=new JScrollPane(t1);
f1.add(jp,BorderLayout.CENTER);

      f1.setJMenuBar(mbar);

          
          f1.setSize(500,500);
       f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
       
       f1.setVisible(true);
    
      }
      public static void main(String[] args) {
        new TextEditor();
    }
       public void actionPerformed(ActionEvent e) {
            if (e.getSource()==et){
         f1.dispose();
        }
            else if(e.getSource()==nw){
                String content1=t1.getText();
                if(!content1.equals("")){
                    int option=JOptionPane.showConfirmDialog(f1,"Do YOu  Want To  Save");
                    if(option ==0){
                         String title =f1.getTitle();
                if(title.equalsIgnoreCase("My Text Editor")){
                    JFileChooser jfc=new JFileChooser();
                    jfc.showSaveDialog(f1);
                    
                      fileName=jfc.getSelectedFile().toString()+".txt"; 
                         
                try{
                    FileOutputStream fout=new FileOutputStream(fileName);
                    String content=t1.getText();
                    byte b[]=content.getBytes();
                    fout.write(b);
                    fout.close();
                    f1.setTitle("My Text Editor"+ fileName);
                }
                 catch (Exception ex){
                       System.out.println(ex); 
                    }
                }
                else{
                    try{
                        FileOutputStream fout=new FileOutputStream(fileName);
                    String content=t1.getText();
                    byte b[]=content.getBytes();
                    fout.write(b);
                    fout.close();
                    f1.setTitle("My Text Editor"+ fileName);
                         f1.setTitle("My Text Editor"+ fileName);
                    }
                    catch (Exception ex){
                        System.out.println(ex); 
                    }
                }
                t1.setText("");
                f1.setTitle("My Text Editor");
                    }
                    else if(option==1){
                        t1.setText("");
                    }
      
                    
                } 
                
                
            }
            else if(e.getSource()==sv){
                String title =f1.getTitle();
                if(title.equalsIgnoreCase("My Text Editor")){
                    JFileChooser jfc=new JFileChooser();
                    jfc.showSaveDialog(f1);
                    
                      fileName=jfc.getSelectedFile().toString()+".txt"; 
                         
                try{
                    FileOutputStream fout=new FileOutputStream(fileName);
                    String content=t1.getText();
                    byte b[]=content.getBytes();
                    fout.write(b);
                    fout.close();
                    f1.setTitle("My Text Editor"+ fileName);
                }
                 catch (Exception ex){
                       System.out.println(ex); 
                    }
                }
                else{
                    try{
                        FileOutputStream fout=new FileOutputStream(fileName);
                    String content=t1.getText();
                    byte b[]=content.getBytes();
                    fout.write(b);
                    fout.close();
                    f1.setTitle("My Text Editor"+ fileName);
                         f1.setTitle("My Text Editor"+ fileName);
                    }
                    catch (Exception ex){
                        System.out.println(ex); 
                    }
                }
            }
            else if(e.getSource()==ft){
                say.swing.JFontChooser jfc=new say.swing.JFontChooser();
                jfc.showDialog(f1);
                Font f=jfc.getSelectedFont();
                t1.setFont(f);
                
            }
            
            else if(e.getSource()==ww){
                t1.setLineWrap(true);
            }
            
            
            else if(e.getSource()==op){
                 JFileChooser jfc=new JFileChooser();
                    jfc.showSaveDialog(f1);
                    
                      fileName=jfc.getSelectedFile().toString(); 
                      try{
                          FileInputStream fin=new FileInputStream(fileName);
                          int ch;
                          String s="";
                          while((ch=fin.read())!=-1){
                              s=s +(char) ch;
                          }
                          fin.close();
                          t1.setText(s);
                          f1.setTitle("My Text Editor"+fileName);
                      }
                      
                      catch(Exception  ex){
                          System.out.println(ex);
                      }
            }
            else if(e.getSource()==au){
                l1=new JLabel("Contact us at abc@gmail.com");
         f=new Font("Times New Roman",Font.BOLD,20);
         l1.setFont(f);
        d1=new JDialog(f1,"contact detail",true);
         d1.setSize(200,200);
         d1.setLayout(new FlowLayout());
         d1.add(l1);
         d1.setVisible(true);
            }
            else if(e.getSource()==bg){
               Color color =JColorChooser.showDialog(f1,"choose a color", Color.yellow);
                t1.setBackground(color);
            }
             else if(e.getSource()==fg){
               Color color =JColorChooser.showDialog(f1,"choose a color", Color.yellow);
                t1.setForeground(color);
            }
       }
}