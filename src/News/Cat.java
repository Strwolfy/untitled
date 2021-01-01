package News;

public class Cat {
    private String имя;
    private int возраст;
    private int вес;
    Cat () {}
    public Cat(String name) {
        this.имя = name;
    }

    public void setВес(int вес) {
        this.вес = вес;
    }
    public void setВозраст(int возраст) {
        this.возраст = возраст;
    }
    public int getВес() {
        return вес;
    }
    public int getВозраст() {
        return возраст;
    }
}
