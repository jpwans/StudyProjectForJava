package com.bounce;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by jiangqin on 17/3/8.
 */
public class Bounce {
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() ->{
            JFrame frame = new BounceFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }

}


class BounceFrame extends JFrame
{
    private BallComponent comp;
    public static final int STEPS = 1000;
    public static final int DELAY = 3;

    public BounceFrame()
    {
        setTitle("Bounce");
        comp = new BallComponent();
        add(comp,BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        addButton(buttonPanel,"Start",event -> addBall());
        addButton(buttonPanel,"Close",event -> System.exit(0));
        add(buttonPanel,BorderLayout.SOUTH);
        pack();
    }

    public void addButton(Container c, String title, ActionListener listener)
    {
        JButton button = new JButton(title);
        c.add(button);
        button.addActionListener(listener);
    }

    public void addBall()
    {
        Ball ball = new Ball();
        comp.add(ball);
        Runnable r = () ->
        {
            try {

                for (int i = 1; i < STEPS; i++) {
                    ball.move(comp.getBounds());
                    comp.paint(comp.getGraphics());
                    Thread.sleep(DELAY);
                }
            }
            catch (InterruptedException e)
            {

            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}