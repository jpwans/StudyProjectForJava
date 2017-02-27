package com.timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by mopellet on 2017/2/25.
 */
public class TimerTest {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(10000, listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }

    //     this 静态方法里面不能调用是你
    public static class TimePrinter implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.out.printf("At the tone,the time is " + new Date());
            Toolkit.getDefaultToolkit().beep();
        }
    }
}
