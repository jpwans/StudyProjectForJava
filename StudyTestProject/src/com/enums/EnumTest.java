package com.enums;

import java.util.Random;
import java.util.Scanner;

import java.lang.reflect.*;
/**
 * Created by jiangqin on 17/2/21.
 */
public class EnumTest {
    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a Size: (SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
//        String input =in.next().toUpperCase();
//        Size size = Enum.valueOf(Size.class,input);
//        System.out.println("size="+size);
//        System.out.println("abbreviation="+size.getAbbreviation());
//        if (size == Size.EXTRA_LARGE)
//            System.out.println("Good job--you paid attention to the _.");
//
//
//
//        System.out.println(Size.MEDIUM.ordinal());
//        Random generator = new Random();
//        Class cl = generator.getClass();
//        String name = cl.getName();
//        System.out.println(name);

//        Class cl1 = Random.class;
//        Class cl2 = int.class;
//        Class cl3 = Double[].class;

//        try {
//            String className = "java.util.Random";
//            Class cl = Class.forName(className);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }


    }
}

enum Size
{
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");

    private Size(String abbreviation){this.abbreviation = abbreviation;};

    public String getAbbreviation() {
        return abbreviation;
    }

    private String abbreviation;
}
