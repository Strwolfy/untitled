package Clock;

class MyClass
{
    private String name1 = "Оля";
    private String name2 = "Лена";

    public void swap()
    {
        synchronized (this)
        {
            String s = name1;
            name1 = name2;
            name2 = s;
        }
    }

    public void swap2()
    {
        synchronized (this)
        {
            String s = name1;
            name1 = name2;
            name2 = s;
        }
    }
}