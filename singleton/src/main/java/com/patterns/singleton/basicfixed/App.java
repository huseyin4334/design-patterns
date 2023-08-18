package com.patterns.singleton.basicfixed;


import com.patterns.singleton.basicfixed.models.BasicSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static BasicSingleton readFromFile(String fileName) throws Exception {
        try (
                FileInputStream fileIn = new FileInputStream(fileName);
                ObjectInputStream reader = new ObjectInputStream(fileIn);
        ) {
            return (BasicSingleton) reader.readObject();
        }
    }

    public static void writeToFile(BasicSingleton singleton, String fileName) throws Exception {
        try (
                FileOutputStream fileIn = new FileOutputStream(fileName);
                ObjectOutputStream reader = new ObjectOutputStream(fileIn);
        ) {
            reader.writeObject(singleton);
        }
    }

    public static void main( String[] args ) throws Exception
    {
        BasicSingleton basicSingleton = BasicSingleton.getInstance();
        basicSingleton.setValue(111);

        String fileName = "singleton_fixed.bin";
        writeToFile(basicSingleton, fileName);

        basicSingleton.setValue(4645);

        BasicSingleton singleton = readFromFile(fileName);

        System.out.println(singleton.equals(basicSingleton));
        System.out.println(singleton.getValue());
        System.out.println(basicSingleton.getValue());
    }
}
