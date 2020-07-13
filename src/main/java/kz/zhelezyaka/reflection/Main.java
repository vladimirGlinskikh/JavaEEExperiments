package kz.zhelezyaka.reflection;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        SomeClass someObject = new SomeClass();
        Class<SomeClass> someClass = (Class<SomeClass>) someObject.getClass();
        Field someField = someClass.getField("someField");
        System.out.println(someField.getType());

        Field[] fields = someClass.getFields();
        for (Field field : fields){
            System.out.println(field.getType() + " " + field.getName());
        }

        System.out.println(someObject.someField);
        someField.set(someObject, 45);

        Field privateField = someClass.getDeclaredField("stringPrivate");
        System.out.println(privateField);

        privateField.setAccessible(true);
        privateField.set(someObject, "Vladimir");
        System.out.println(someObject.getStringPrivate());
    }
}
