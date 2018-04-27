package Scenario1;

import java.util.ArrayList;

public class Burger {
    private String name;
    private ArrayList <String> components;

    Burger(String str){
        name = str;
        components = new ArrayList<String>();
    }

    boolean add(String str){
        components.add(str);

        return true;

    }

    void show(){
        System.out.println("Components of " + name + " burger:");
        for(String str: components){
            System.out.println(str);
        }

    }



}
