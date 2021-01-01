package Уроки;

public class Строки {

    void Ыекштп() {
        String s = "вот такая строчка";
        char a = s.charAt(10);
        System.out.println("Буква равна " + a);
        char[] chars = {'V', 'e', 'r', 't', 'e', 'x'};
        String s1 = "String";

        s1 = String.copyValueOf(chars);
        //s1 = String.copyValueOf(chars);
        System.out.println("String s1 after copyValueOf: " + s1);
        //обявление массив
        int[] ae = {3, Integer.parseInt("6")};
        int[] ar = new int[3];

        //стро
        char[] chars1 = {'f', 's', 'e'};
        String s11 = "вот такая строчка";
        char[] to = new char[s1.length()];
        //to = s1;  //нельзя так сделать

        char[] result = s11.toCharArray();
        System.out.println(result);
    }
}
