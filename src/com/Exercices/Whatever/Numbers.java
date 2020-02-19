package com.Exercices.Whatever;

import java.util.Scanner;

//Assignment5: Scrieti cate o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.

public class Numbers {
    public int a;
    public int b;

    public void readNumbers(){
        Scanner read = new Scanner(System.in);
        System.out.println("a= ");
        a = read.nextInt();
        System.out.println("b= ");
        b = read.nextInt();
    }

    public int add(){
        return a + b;
    }

    public int diff(){
        return a - b;
    }

    public int multiply(){
        return a * b;
    }

    public float division(){
        return (float)a / (float)b;
    }
}
