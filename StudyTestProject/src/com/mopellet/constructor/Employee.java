package com.mopellet.constructor;

import java.util.Random;

/**
 * Created by jiangqin on 17/2/20.
 */
public class Employee {
    private static int nextId;

    private int id;
    private String name = ""; // 实例初始化
    private double salary;

    // 静态初始化块
    static {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    // 对象初始化块
    {
        id = nextId;
        nextId++;
    }

    public Employee(String name, double salary, int year, int month, int day){

    }

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public Employee(double s) {
        this("Employee #" + nextId, s);
    }

    public Employee() {
        // name initialized to "" --see above
        // salary not explicitly set--initialized to 0
        // id initialized in initialization block
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//        // 相当于 delloc
//    }
//    Runtime.add
}
