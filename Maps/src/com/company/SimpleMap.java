package com.company;

import java.util.HashMap;

public class SimpleMap
{
    public static void main(String[] args)
    {
        SimpleMap simplemap = new SimpleMap();

        simplemap.demo();
    }

    private void demo()
    {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("USA", "United States");
        hashMap.put("MEX", "Mexico");
        hashMap.put("CAN", "Canada");

        System.out.println("USA: " + hashMap.get("USA"));


    }
}
