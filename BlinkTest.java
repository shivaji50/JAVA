// A Multithreading Programn using Runnable interface to blink a test on the frame
// Slip11a
import java.awt.*;
import java.awt.event.*;


public class BlinkTest extends Frame implements Runnable
{
    Thread t;
    Label ll;
    int f;

    public BlinkTest()
    {
        t=new Thread(this);
        t.start();
        setLayout(null);
        ll=new Label("Hello Java");
        ll.setBounds(100,100,100,40);
        add(ll);
        setVisible(true);
        addWindowListener(new WindowAdapter()
        {
              public void windowClosing(WindowEvent we)
              {
                  System.exit(0);
              }
        });
        f=0;
    }

    public void run()
    {
        try
        {
            if(f==0)
            {
                t.sleep(200);
                ll.setText("");
                f=1;
            }

            if(f==1)
            {
                t.sleep(200);
                ll.setText("Hello Java");
                f=0;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        run();
    }



public static void main(String args[]) {
    new BlinkTest();
 }
}