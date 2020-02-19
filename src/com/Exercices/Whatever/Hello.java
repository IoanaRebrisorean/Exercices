package com.Exercices.Whatever;

import java.util.Scanner;

public class Hello {

    public float a;
    public float b;

    public void readNumbers(){
        Scanner division = new Scanner(System.in);
        System.out.println("a= ");
        division.nextFloat();
        System.out.println("b= ");
    }

    public void hello(){
        System.out.println("Hello");
        System.out.println("Ioana Rebrisorean");
        System.out.println("5 + 7 = " + (5 + 7));
    }

    public float division(){
        return  (a / b);
    }
}
