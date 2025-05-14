package Coding_Questions;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        // Load class object dynamically
        Class<?> cls = Class.forName("SampleClass");

        // Print class name
        System.out.println("Class Name: " + cls.getName());

        // Print constructors
        Constructor<?>[] constructors = cls.getDeclaredConstructors();
        System.out.println("\nConstructors:");
        for (Constructor<?> constructor : constructors) {
            System.out.println("  " + constructor);
        }

        // Print methods
        Method[] methods = cls.getDeclaredMethods();
        System.out.println("\nMethods:");
        for (Method method : methods) {
            System.out.println("  " + method.getName());
        }

        // Print fields
        Field[] fields = cls.getDeclaredFields();
        System.out.println("\nFields:");
        for (Field field : fields) {
            System.out.println("  " + field.getName());
        }
    }
}

