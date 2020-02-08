package com.mycompany.app;
import java.util.ArrayList;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public static boolean search(ArrayList<Integer> array1, ArrayList<Integer> array2,  int sayi1, int sayi2) {
        boolean contains = false;
        System.out.println("Searching for number that equals (num1 * num2) in these arrays.");
        if (array1 == null || array2 == null) return false;

        for (int i : array1) {
            if (i == sayi1 * sayi2)
                contains = true;
        }
        for (int i : array2) {
            if (i == sayi1 * sayi2)
                contains = true;
        }
        return contains;
    }
}
