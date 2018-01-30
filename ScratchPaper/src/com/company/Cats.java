package com.company;

public class Cats
{
    public static void main(String[] args)
    {
      String catNames[] = {"Spock", "Elmo", "Flea"};
        catNames = new String[3];
/*
      catNames[1] = "Elmo";
      catNames[0] = "Spock";
      catNames[2] = "Flea";
*/
      catNames[0] = "Cookie"; //Overrides Spock with Cookie

      catNames[1] = catNames[0]; //Overrides Elmo with Cookie

      System.out.println(catNames[1]);

        System.out.println(catNames.length);

        catNames = new String[4];
        System.out.println(catNames.length);

        for (int i = 0; i < catNames.length; i++)
        {
            System.out.println(catNames[i]);
        }



    }
}
