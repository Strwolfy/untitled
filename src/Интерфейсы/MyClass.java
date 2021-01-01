package Интерфейсы;

class MyClass implements Interface2
{
    private Interface1 object;
    MyClass(Interface1 object)
    {
        this.object = object;
    }
    // тут располагаются методы Interface2,
    // которые вызывают методы Interface1
}
