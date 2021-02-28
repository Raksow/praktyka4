package com.raksow;

public class Main
{

    public static void main(String[] args)
    {
        //kwadrat k1 = new kwadrat(2);
        //System.out.println(k1.obwod());               //Zadanie 1
        //System.out.println(k1.pole());

        punkt p1 = new punkt();
        punkt p2 = new punkt(2, 2);
        System.out.println(p2.odleglosc(3, 3));         //Zadanie 2
        System.out.println(p1.odleglosc(p2));
    }
}
