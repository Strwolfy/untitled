package Stream;

import java.io.*;

public class Hello {
    public static void main(String[] args) throws IOException {
        PrintStream co = System.out;
        co.println("Stream");
        //InputStream i = new ByteArrayInputStream();

        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        FileOutputStream outputStream = new FileOutputStream("c:/result.txt");

        //ObjectInputStream inputStream;
        while (inputStream.available()> 0) //пока есть еще непрочитанные байты
        {
            int data = inputStream.read();
            // прочитать очередной байт в переменную data
            outputStream.write(data); // и записать его во второй поток
        }

        inputStream.close(); //закрываем оба потока. Они больше не нужны.
        outputStream.close();
    }
}