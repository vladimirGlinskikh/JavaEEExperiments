package kz.zhelezyaka.reflection.classes;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String className = scanner.next();
        Class aClass = Class.forName(className);

        Field fields[] = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }
}
