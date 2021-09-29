// A MultiThreading program to display the number between 1 to 100 continously in a textfield by clicking 
// on button
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Container;
import java.awt.Component;
/*
<applet code="Slip1b" width="500" height="500"></applet>
*/



 public class Slip1b extends Applet implements Runnable,ActionListener
{
    Thread t;
    TextField tx1;
    Button btnStart;

    public void init()
    {
        tx1=new TextField(20);
        btnStart=new Button("Start");
        btnStart.addActionListener(this);
        add(tx1);
        add(btnStart);

    }

    public void run()
    {
        for(int i=1;i<10;i++)
        {
            tx1.setText(""+i);
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
    }


    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==btnStart)
        {
            t=new Thread(this);
            t.start();
        }
    }

}

