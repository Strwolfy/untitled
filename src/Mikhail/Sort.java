package Mikhail;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Woman> women = new ArrayList<Woman>();
        women.add(new Woman(18));
        women.add(new Woman(21));
        women.add(new Woman(5));
        System.out.println(women.toString());

        Collections.sort(women);
        System.out.println(women);
    }
}
