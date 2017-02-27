package com.lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;
/**
 * Created by mopellet on 2017/2/25.
 */
public class LambdaTest {
    public static void main(String[] args){
        String[] planets = new String[]{ "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");//默认字典
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sort by length:"); // 按照长度
        Arrays.sort(planets,(first,second)->first.length() - second.length());
        System.out.println(Arrays.toString(planets));

//        Timer t = new Timer(1000,
//                event -> System.out.println("The time is " + new Date()));
//        t.start();
//
//        JOptionPane.showMessageDialog(null,"Quit program?");
//        System.exit(0);
//

    }
}
