package Сравнения;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Woman> women = new ArrayList<Woman>();
        women.add(new Woman(18));
        women.add(new Woman(21));
        women.add(new Woman(5));
/*
        Comparator<Woman> compareByHeight = new Comparator<Woman>() {
            public int compare(Woman o1, Woman o2) {
                return o1.height - o2.height;
            }
        };*/
        Collections.sort(women);//, compareByHeight);
        printCollection("D",women);
        //for (Woman women = null) { System.out.println(women); }

    }

    private static void printCollection(String d, ArrayList<Woman> women) {
        for (Woman w : women) {
            System.out.println(" F " + w);
        }
    }
}
