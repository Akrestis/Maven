package com.company;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Main {

    //1) Создать проект Maven. В корень проекта положить текстовый файл.
    //Распарсить этот JSON и вывести объекты через println().

    public static void main(String[] args) {

        Gson gson = new Gson();

        try {
            Reader reader = new FileReader("data.txt");
            Group group = gson.fromJson(reader,Group.class);
            System.out.println(group);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
