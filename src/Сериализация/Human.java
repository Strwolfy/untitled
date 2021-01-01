package Сериализация;

import java.io.*;

class Human
{
    public Cat cat;
    public Dog dog;

    public void save(OutputStream outputStream) throws Exception
    {
        PrintWriter writer = new PrintWriter(outputStream);

        String isCatPresent = cat != null ? "yes" : "no";
        writer.print(isCatPresent);

        if (cat!=null)
            cat.save(outputStream);

        String isDogPresent = dog != null ? "yes" : "no";
        writer.print(isDogPresent);

        if (dog != null)
            dog.save(outputStream);
    }

    public void load(InputStream inputStream) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        String isCatPresent = reader.readLine();
        if (isCatPresent.equals("yes"))
        {
            cat = new Cat();
            cat.load(inputStream);
        }

        String isDogPresent = reader.readLine();
        if (isDogPresent.equals("yes"))
        {
            dog = new Dog();
            dog.load(inputStream);
        }
    }
}