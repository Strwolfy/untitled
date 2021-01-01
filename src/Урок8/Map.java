package com.javarush.test.Урок8;

import java.util.HashMap;

public class Map {
    public static void main(String[] args)
    {
        //все элементы хранятся в парах
        Map<String, String> map = new HashMap<String, String>();
        map.put("first", "Mama");
        map.put("second", "Mila");
        map.put("third", "Ramu");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();            //ключ
            String value = pair.getValue();        //значение
            System.out.println(key + ":" + value);
        }
    }

    private Iterable<Object> entrySet() {
    }
}
