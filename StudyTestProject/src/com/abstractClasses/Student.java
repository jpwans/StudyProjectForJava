package com.abstractClasses;

/**
 * Created by jiangqin on 17/2/20.
 */
public class Student extends Person {
    private String major;

    public Student(String name,String major)
    {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }
}
