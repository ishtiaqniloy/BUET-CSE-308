package Scenerio1;

import java.util.ArrayList;

public class Burger {
    private ArrayList <String> components;

    Burger(){
        components = new ArrayList<String>();
    }

    boolean add(String str){
        components.add(str);

        return true;

    }

    void show(){
        System.out.println("Components of this burger:");
        for(String str: components){
            System.out.println(str);
        }

    }



}
