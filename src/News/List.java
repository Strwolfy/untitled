package News;

import java.util.ArrayList;
import java.util.Arrays;

public class List {

    private String name;

    public List(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ArrayList<String> L = new ArrayList<>();    // список из десяти членов
        L.add("hello"); L.add(" world");
        ArrayList<Cat> stac = new ArrayList<Cat>();
        Cat b = new Cat("Бегемот");
        stac.add(b);
        Cat c = stac.get(0);

        System.out.println(c);

        ArrayList<A> a = new ArrayList<>();
        //a.add() как тут добавлять???


        List[] cats = new List[3]; // массив классов
        cats[1] = new List("Томас");
        cats[2] = null;

        //System.out.println(Arrays.toString(cats));
       // A a1 = new A();
       // a1.Ф();
       // System.out.println(Arrays.toString(stac));
    }
    public String toString() {
        return "Cat " + name;
    }
}
