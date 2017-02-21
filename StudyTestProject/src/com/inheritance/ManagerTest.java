package com.inheritance;

/**
 * Created by jiangqin on 17/2/20.
 */
public class ManagerTest {
 public static void main(String[] args)
 {
     Manager boss = new Manager("Carl Cracker",80000,1987,12,15);
     boss.setBonus(5000);

     Employee[] staff = new Employee[3];

     staff[0] = boss;
     staff[1] = new Employee("Harry Hacker",50000,1989,10,1);
     staff[2] = new Employee("Tommy Tester",40000,1990,3,15);

     for (Employee e:staff
          ) {
         System.out.println("name="+e.getName()+",salary="+e.getSalary());
     }

     if (staff[1] instanceof Manager){
        boss = (Manager) staff[1];
     }

     double d =  max(3.1,4.5,-5);
     System.out.println("sss" +d);
 }
 public static double max(double... values)
 {
     double largest = Double.NEGATIVE_INFINITY;
     for (double v: values) if(v>largest) largest = v;
     return largest;
 }
}
