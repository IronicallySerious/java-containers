package com.company;

import containers.ArrayList.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Java Containers test program is starting");

        ArrayList<String> stringArray = new ArrayList<String>();

        stringArray.add("Hello,");
        stringArray.add("my");
        stringArray.add("name");
        stringArray.add("is");
        stringArray.add("Serious");
        stringArray.set(4, "Twarit");

        System.out.println("ArrayList: " + stringArray);

        System.out.println("Java Containers test program is safely ending");
    }
}
