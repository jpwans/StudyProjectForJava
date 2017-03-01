package com.stackTrace;

import sun.rmi.runtime.Log;

import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by jiangqin on 17/2/28.
 */
public class StackTraceTest {

    public static int factorial(int n){
        System.out.println("factorial("+"):");
        Throwable t = new Throwable();
        StackTraceElement[] frames = t.getStackTrace();
        for(StackTraceElement f:frames)
            System.out.println(f);
        int r;
        if (n <=1 )r =1;
        else  r=n*factorial(n-1);
        System.out.println("return "+r);
        return r;
    }

    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        int n = in.nextInt();
//        factorial(n);
//        ass(-1);
//        assert n > 0;
//        Logger logger = Logger.getLogger("11")
        Logger logger = Logger.getLogger("com.mycompany.myapp");
        logger.setLevel(Level.FINE);
        logger.setUseParentHandlers(false);
        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.FINE);
        logger.addHandler(handler);
    }

    public static void ass(int n){
        assert n > 0;
        if (n%3==0)
            System.out.println(0);
        if (n%3==1)
            System.out.println(1);
        else //
            System.out.println(2);
    }
}
