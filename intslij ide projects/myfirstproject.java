import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myfirstproject implements ActionListener {
JFrame myproj;
JButton button,button2;

myfirstproject(){
    myproj=new JFrame ( "This is my first project");
    myproj.setLayout(null);
    myproj.setVisible(true);
    myproj.setSize(0,0);
   // myproj.setResizable(false);
    //myproj.setShape();
    button=new JButton( "Apply");

   button.setSize(100,50);
   button.addActionListener(this);
   button.setLocation(105,100);

   button2=new JButton("click");

    button2.setSize(100,50);
    button2.addActionListener(this);
    myproj.add(button2);
    myproj.add(button);

}
public static void main(String args[]){
    myfirstproject obj=new myfirstproject();
   // myfirstproject obj1=new myfirstproject();


}

    @Override
    public void actionPerformed(ActionEvent e) {
    String s=e.getActionCommand();
    if(s.equals("click"))
     myproj.getContentPane().setBackground(Color.pink);
    if(s.equals("Apply"))
        myproj.getContentPane().setBackground(Color.black);
    }
}
