package com.javarush.test.Урок24;

class MyFile
{
    private String filename = null;
    public void initialize(String name)
    {
        this.filename = name;
    }

    public void initialize(String folder, String name)
    {
        this.filename = folder + name;
    }

    // Файл filename будет находиться в той же директории, что и file.
    public void initialize(MyFile file, String name)
    {
    //    this.filename = file.getFolder() + name;
    }

}