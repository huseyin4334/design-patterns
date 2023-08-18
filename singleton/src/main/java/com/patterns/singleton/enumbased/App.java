package com.patterns.singleton.enumbased;


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
    public static EnumBasedSingleton readFromFile(String fileName) throws Exception {
        try (
                FileInputStream fileIn = new FileInputStream(fileName);
                ObjectInputStream reader = new ObjectInputStream(fileIn);
        ) {
            return (EnumBasedSingleton) reader.readObject();
        }
    }

    public static void writeToFile(EnumBasedSingleton singleton, String fileName) throws Exception {
        try (
                FileOutputStream fileIn = new FileOutputStream(fileName);
                ObjectOutputStream reader = new ObjectOutputStream(fileIn);
        ) {
            reader.writeObject(singleton);
        }
    }

    public static void main( String[] args ) throws Exception
    {
        EnumBasedSingleton basicSingleton = EnumBasedSingleton.INSTANCE;
        basicSingleton.setValue(111);

        String fileName = "enum_test.bin";
        writeToFile(basicSingleton, fileName);

        EnumBasedSingleton singleton = readFromFile(fileName);

        System.out.println(singleton.equals(basicSingleton));
        System.out.println(singleton.getValue());
        System.out.println(basicSingleton.getValue());
    }

    /*
        Enum classes is like static classes. If you can't create new one and take serialization problem.
     */
}
