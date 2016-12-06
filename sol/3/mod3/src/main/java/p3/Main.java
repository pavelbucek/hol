package p3;

import java.lang.reflect.Field;
import java.util.Arrays;

import p1.Foo;

public class Main {

    public static void main(String[] args) {
        Foo foo = createFoo();

        System.out.println(foo);
    }

    private static Foo createFoo() {
        Foo foo = new Foo();

        try {
            Field fooString = Foo.class.getDeclaredField("fooString");
            fooString.setAccessible(true);
            fooString.set(foo, "fooValue");
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }

        return foo;
    }
}
