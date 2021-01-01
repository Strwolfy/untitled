package Сериализация;

import java.io.*;

class Cat implements Serializable
{
    public String name;
    public int age;
    public int weight;
    transient public InputStream in = System.in;

    public void save(OutputStream outputStream) throws Exception
    {
        PrintWriter printWriter = new PrintWriter(outputStream);
        printWriter.println(name);
        printWriter.println(age);
        printWriter.println(weight);
    }

    public void load(InputStream inputStream) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        name = reader.readLine();
        age = Integer.parseInt(reader.readLine());
        weight = Integer.parseInt(reader.readLine());
    }
}