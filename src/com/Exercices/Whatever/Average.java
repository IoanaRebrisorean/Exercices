package com.Exercices.Whatever;

import org.w3c.dom.ls.LSOutput;

//Assignment6: Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor.
import java.util.Scanner;

public class Average {
    public int a;
    public int b;
    public int c;

    public void read() {
        Scanner read = new Scanner(System.in);
        System.out.println("a= ");
        a = read.nextInt();
        System.out.println("b= ");
        b = read.nextInt();
        System.out.println("c= ");
        c = read.nextInt();
    }

    public float average(){
        float av = (float) (a+b+c) / 3f;
        return av;

    }

    public void printAverage(){
        System.out.println("Average is " + average());
    }

}
