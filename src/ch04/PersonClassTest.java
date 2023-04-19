package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PersonClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Person person = new Person("James");
        System.out.println(person);

        Class c = Class.forName("ch04.Person");

        Class[] parameterTypes = {String.class};
        Constructor cons = c.getConstructor(parameterTypes); // String Type의 Constructor를 가지고 와라

        Object[] initargs = {"치즈"};
        Person personKim = (Person)cons.newInstance(initargs);
        System.out.println(personKim);

    }
}
