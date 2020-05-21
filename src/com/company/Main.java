package com.company;

import containers.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Java Containers test program is starting");

        {
            ArrayList<String> stringArray = new ArrayList<String>();

            stringArray.add("Hello");
            stringArray.add("my");
            stringArray.add("name");
            stringArray.add("is");
            stringArray.add("Twarit");
            stringArray.set(4, "Serious");
            stringArray.insert(2, "alias");

            System.out.println("ArrayList: " + stringArray);
        }

        {
            LinkedList<String> stringList = new LinkedList<String>();

            stringList.add("Nothing");
            stringList.add("is");
            stringList.add("permitted");
            stringList.add("true");
            stringList.remove("permitted");

            boolean result = stringList.contains("is");

            System.out.println("LinkedList: " + stringList);
        }
        System.out.println("Java Containers test program is safely ending");
    }
}
