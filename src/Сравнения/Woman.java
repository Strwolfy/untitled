package Сравнения;

public class Woman implements Comparable<Woman>
{
    public int age;
    public int childrenCount;
    public int weight;
    public int height;
    public String name;

    public Woman(int age) {
        this.age = age;
    }

    public int compareTo(Woman o) {
        return this.age - o.age;
    }
    /*
    public Woman(int age, int height) {
        this.age = age;
        this.height = height;
    }*/

}
