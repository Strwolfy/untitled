package com.javarush.test.Урок24;

// интерфейс маркер

import java.io.*;

public class Интерфейсы<objectOriginal> {


    BigObject objectOriginal = new BigObject();


    ByteArrayOutputStream writeBuffer = new ByteArrayOutputStream();
    ObjectOutputStream outputStream = new ObjectOutputStream(writeBuffer);
    //outputStream.writeObject(objectOriginal);
    //outputStream.close();

    byte[] buffer = writeBuffer.toByteArray();
    ByteArrayInputStream readBuffer = new ByteArrayInputStream(buffer);
    ObjectInputStream inputStream = new ObjectInputStream(readBuffer);
    BigObject objectCopy = (BigObject)inputStream.readObject();

    public Интерфейсы() throws IOException, ClassNotFoundException {
    }
}
