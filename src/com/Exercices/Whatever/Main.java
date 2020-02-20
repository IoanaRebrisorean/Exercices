package com.Exercices.Whatever;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;

public class Main {

//    public static void appendElToSet(HashSet<Integer> set, int elToAdd){
//        set.add(elToAdd);
//    }

    public static void main(String[] args) {



        //Assignment1: a Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
        // b:  Printati rezultatul sumei a doua numere(orice numere)

//        Hello hello = new Hello();
//        hello.hello();

        //Assignment2: Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.
//        System.out.println(6f/4f);
//
        //Assignment3: Printati rezultatul urmatoarelor operatiuni:
//        int a = -5 + 8 * 6;
//        int b = ( 55 + 9 ) % 9;
//        float c = 20 + -3 * 5f / 8f;
//        float d = 5 + 15f / 3f * 2 - 8 % 3;
//        System.out.println("a= " + a);
//        System.out.println("b = " + b);
//        System.out.println("c = " + c);
//        System.out.println("d = " + d);

        //Assignment4: Pentru exercitiile din clasa main() de data trecuta, creati metode separate pentru fiecare, tot in clasa Main.java, si apoi apelati-le in metoda main().
//        printHello();
//        printName();
//        sum();
//        ex();


        //Assignment5: Scrieti cate o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.
//          case1:
//            Numbers numbers = new Numbers ();
//            numbers.readNumbers();
//            numbers.add();
//            numbers.diff();
//            numbers.multiply();
//            numbers.division();
//        System.out.println("a + b = " + numbers.add());
//        System.out.println("a - b = " + numbers.diff());
//        System.out.println("a * b = " + numbers.multiply());
//        System.out.println("a + b = " + numbers.division());

        //case2:
//        System.out.println("n1 + n2 = " + add(4,6));
//        System.out.println("n1 - n2 = " + diff(4,6));
//        System.out.println("n1 * n2 = " + multiply(4,6));
//        System.out.println("n1 / n2 = " + division(4,6));

        //Assignment6: Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor.
//        Average average = new Average();
//            average.read();
//            average.printAverage();

        //Assignment7: Scrieti o metoda java, care sa returneze restul impartirii a doua numere

//        System.out.println("rest= "+ rest(7,10));
//        System.out.println(rest(10,7));

        //Assignment8: Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte temperatura in Fahrenheit, si sa returneze temperatura in Celsius. Formula de calcul este: C = 5/9 * (F -32
//        System.out.println("Temp Celsius = " + celsius());

        //Assignment9: Write a Java program to append the specified element to the end of a hash set
        System.out.println("Exercice 1 from HashMap");
        HashSet<Integer> set1 = new HashSet<Integer>();
        for ( int i=0; i<=1000; i++){
            set1.add(i);
        }

//        appendElToSet(set1, 1506);


        //Assignment10: Write a Java program to iterate through all elements in a hash list
           HashSet<String> hs = new HashSet<String>();
        hs.add("Welcome");
        hs.add("to");
        hs.add("my");
        hs.add("HashMap");
        hs.add("and");
        hs.add("another");
        hs.add("words");

        System.out.println("My HashMap is " + hs);

        Iterator value = hs.iterator();

        System.out.println("My iterator values are: ");

        while (value.hasNext()){
            System.out.println(value.next());
        }

        //Assignment11: Write a Java program to get the number of elements in a hash set
            System.out.println("Size of the Hash Set is: " + hs.size());

        //Assignment12: Write a Java program to empty an hash set
//        hs.removeAll(hs);
//        System.out.println("My Hash Set after removing is " + hs);

        //Assignment13: Write a Java program to test a hash set is empty or not
        System.out.println("Checking if it's empty " + hs.isEmpty());

        //Assignment14: Write a Java program to clone a hash set to another hash se
        HashSet <String> newHs = new HashSet <String>();
        newHs = (HashSet)hs.clone();
        System.out.println("Colned Hash Set: " + newHs);

//        //Assignment15: Write a Java program to compare two hash set
//        HashSet <String> hs2 = new HashSet<String>();
//        hs2.add("Welcome");
//        hs2.add("here");
//        HashSet<String>result= new HashSet<String>();
//        for (String element : hs) {
//            System.out.println(hs2.contains(element) ? "Yes" : "No");
//        }
//    }











    }



    //Assignment4: Pentru exercitiile din clasa main() de data trecuta, creati metode separate pentru fiecare, tot in clasa Main.java, si apoi apelati-le in metoda main().

        public static void printHello(){
            System.out.println("Hello");
        }

        public static void printName(){
            System.out.println("Ioana Rebrisorean");
        }

        public static void sum(){
            System.out.println("6 + 7 = " + (6 + 7));
        }

        public static void ex(){
            int a = -5 + 8 * 6;
            int b = ( 55 + 9 ) % 9;
            float c = 20 + -3 * 5f / 8f;
            float d = 5 + 15f / 3f * 2 - 8 % 3;
            System.out.println("a= " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("d = " + d);
        }

    //Assignment5: Scrieti cate o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.
        public static int add(int n1, int n2){
            int add = n1 + n2;
            return add;
        }

         public static int diff(int n1, int n2){
            int diff = n1 - n2;
            return diff;
    }

        public static int multiply(int n1, int n2){
            int prod = n1 * n2;
            return prod;
    }

        public static float division(float n1, float n2) {
            float cat = n1 / n2;
            return cat;
        }

    //Assignment7: Scrieti o metoda java, care sa returneze restul impartirii a doua numere
    public static int rest( float  a, float  b){
            float c =  (a % b);
            return (int) c;
            }

    //Assignment8: Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte temperatura in Fahrenheit, si sa returneze temperatura in Celsius. Formula de calcul este: C = 5/9 * (F -32
    public static float celsius(){
        int fahrenheit;
        Scanner numar = new Scanner(System.in);
        System.out.println("Temp Fahrenheit = ");
        fahrenheit = numar.nextInt();
        float celsius = 5f / 9f * (fahrenheit - 32);
        return celsius;
    }







    }









