package Mikhail;

public class Woman implements Comparable<Woman>
{
    public int age;

    public Woman(int age) {
        this.age = age;
    }

    public int compareTo(Woman o)
    {
        return this.age - o.age;
    }
}
