package Уроки;



import java.io.*;
import java.util.logging.Logger;

public class Файл {
    //System.out.println();
   // private static final Logger logger = System.LoggerFinder();


    long sum = 0;

    void File() throws IOException {
        FileInputStream inputStream = new FileInputStream("E:/text/Input.txt");
        FileOutputStream outputStream = new FileOutputStream("E:/text/result.txt");

        while (inputStream.available() > 0) {
            int data = inputStream.read(); // прочитать очередной байт в переменную data
            outputStream.write(data); // и записать его во второй поток
        }

        inputStream.close(); //закрываем оба потока. Они больше не нужны.
        outputStream.close();
        inputStream.close();
        System.out.println("Сумма байтов в файле равна: " + sum);

        FileWriter w = new FileWriter("E:/text/index.txt");
        for (int i = 0; i < 1000; i++) {
            w.write("Я сошёл с ума ");
        }
        w.close();
    }
}
