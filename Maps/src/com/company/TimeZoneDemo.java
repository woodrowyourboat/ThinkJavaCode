package com.company;

import java.util.HashMap;
import java.util.Iterator;

public class TimeZoneDemo
{
    HashMap<String, Integer> hashMap = new HashMap<>();

    public HashMap<String, Integer> getHashMap()
    {
        return hashMap;
    }

    public static void main(String[] args)
    {
        TimeZoneDemo timeZoneDemo = new TimeZoneDemo();
        timeZoneDemo.demo();
        timeZoneDemo.getTimeDiff("PST", "EST");




    }

    public void demo()
    {

        hashMap.put("EST", -5);
        hashMap.put("CST", -6);
        hashMap.put("MST", -7);
        hashMap.put("PST", -8);
        hashMap.put("GMT", 0);

    }

    public int getTimeDiff(String timeZone, String timeZone2)
    {
       int value = hashMap.get(timeZone);
       int value2 = hashMap.get(timeZone2);

       int timeDiff = value - value2;
        System.out.println(timeDiff);

       return timeDiff;

    }

}
