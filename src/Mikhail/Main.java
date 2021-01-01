package Mikhail;

import java.io.File;
import java.lang.annotation.Annotation;

public class Main {


    public static void main(String[] args) {
        printAllFiles(new File("c:/GitHub/"));
    }

    public static void printAllFiles(File dir) {
        for (File file : dir.listFiles()) {
            if (file.isDirectory())
                printAllFiles(file);
            else
                System.out.println(file.getAbsolutePath());
        }
    }
}