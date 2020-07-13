package kz.zhelezyaka.reflection;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        SomeClass someObject = new SomeClass();
        Class<SomeClass> someClass = (Class<SomeClass>) someObject.getClass();
        Field someField = someClass.getField("someField");
        System.out.println(someField.getType());
    }
}
