package com.company;

import containers.ArrayList.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Java Containers test program is starting");

        ArrayList<String> stringArray = new ArrayList<String>();

        stringArray.add("Hello");
        stringArray.add("my");
        stringArray.add("name");
        stringArray.add("is");
        stringArray.add("Twarit");
        stringArray.set(4, "Serious");
        stringArray.insert(2, "alias");

        System.out.println("ArrayList: " + stringArray);

        System.out.println("Java Containers test program is safely ending");
    }
}
