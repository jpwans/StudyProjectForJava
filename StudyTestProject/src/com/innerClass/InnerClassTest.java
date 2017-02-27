package com.innerClass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

/**
 * Created by jiangqin on 17/2/27.
 */
public class InnerClassTest {
    public static void main(String[] args){
        TalkingClock clock = new TalkingClock(1000,true);
        clock.start();

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }

    static class TalkingClock
    {
        private int interval;
        private boolean beep;

        public TalkingClock(int interval, boolean beep)
        {
            this.interval = interval;
            this.beep = beep;
        }

        public void start()
        {
            ActionListener listener = new TimePrinter();
            Timer t = new Timer(interval,listener);
            t.start();
        }

        public class TimePrinter implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                System.out.println("At the tone, the time is" + new Date());
                if (TalkingClock.this.beep) Toolkit.getDefaultToolkit().beep();
            }
        }
    }


}
