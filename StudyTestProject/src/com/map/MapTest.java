package com.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiangqin on 17/3/7.
 */
public class MapTest {
    public static void main(String[] args)
    {
        Map<String, String> staff = new HashMap<>();
        staff.put("144-25-5464",new String("Amy lee"));
        staff.put("567-24-2546",new String("Harry Hacker"));
        staff.put("157-62-7935",new String("Gary Cooper"));
        staff.put("456-62-5527",new String("Francesca Cruz"));

        System.out.println(staff);

        staff.remove(567-24-2546);

        staff.put("456-62-5527",new String("Francesca Miller"));

        System.out.println(staff.get("157-62-7935"));

        staff.forEach((k,v) ->
                System.out.println("key=" + k +",value="+v));


    }
}
