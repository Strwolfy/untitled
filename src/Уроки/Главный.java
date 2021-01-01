package Уроки;

// Комментарии


import java.io.*;
import java.lang.ref.SoftReference;



public class Главный {
    public static void main(String[] args) throws IOException {




        System.out.println("Точка входа");
        Строки Стр = new Строки();
        //Стр.Ыекштп();

        //Cat cat = new Cat("Васька");
        //Cat catWrap = new CatWrapper(cat);
        //printName(catWrap);
        //System.out.println(cat.getName());
        Cat cat = new Cat();
        SoftReference<Cat> catR = new SoftReference<Cat>(cat);
        cat = catR.get();
        catR.clear();

    }

    public static void printName(Cat named)
    {
        System.out.println(named.getName());
    }
}























