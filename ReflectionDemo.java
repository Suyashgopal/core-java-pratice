// Reverse engineering concepts - Reflection and Introspection in Java
// reflection lets us look inside a class at runtime

import java.lang.reflect.Method;
import java.lang.reflect.Field;

// a sample class to inspect
class Phone {
    public String brand = "Samsung";
    private int price = 50000;

    public void powerOn() {
        System.out.println("Phone is on");
    }
    public void call(String number) {
        System.out.println("Calling " + number);
    }
}

public class ReflectionDemo {
    public static void main(String[] args) {
        try {
            // get the class object
            Class<?> cls = Phone.class;
            System.out.println("Class name: " + cls.getName());

            // get all the methods of the class
            System.out.println("\nMethods:");
            Method[] methods = cls.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println(" - " + m.getName());
            }

            // get all the fields
            System.out.println("\nFields:");
            Field[] fields = cls.getDeclaredFields();
            for (Field f : fields) {
                System.out.println(" - " + f.getName() + " (" + f.getType() + ")");
            }

            // create object using reflection and call a method
            Phone p = (Phone) cls.getDeclaredConstructor().newInstance();
            Method callMethod = cls.getMethod("call", String.class);
            callMethod.invoke(p, "9876543210");

        } catch (Exception e) {
            System.out.println("reflection error: " + e.getMessage());
        }
    }
}
