package com.genericRefection;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Created by mopellet on 2017/3/2.
 */
public class GenericReflectionTest {
    public static void main(String[] args)
    {
        String name;
        if (args.length > 0) name = args[0];
        else
        {
            try (Scanner in = new Scanner(System.in)){
                System.out.println("Enter class name (e.g. java.util.Collections):");
                name = in.next();
            }
        }

        try {
            Class<?> cl = Class.forName(name);

            for (Method m:cl.getDeclaredMethods()) {
//                printMethod(m);
            }
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void printClass(Class<?> cl)
    {
        System.out.print(cl);
//        pri
    }
}
