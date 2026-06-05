// Data types and variables practice
// trying out all the primitive types and type casting

public class DataTypesAndVariables {
    public static void main(String[] args) {

        // primitive data types
        int x = 100;
        long bigNum = 9999999999L;   // need L for long
        double d = 99.55;
        float f = 12.5f;
        char ch = 'A';
        boolean flag = true;
        byte b = 120;
        short s = 3000;

        System.out.println("int = " + x);
        System.out.println("long = " + bigNum);
        System.out.println("double = " + d);
        System.out.println("float = " + f);
        System.out.println("char = " + ch);
        System.out.println("boolean = " + flag);
        System.out.println("byte = " + b);
        System.out.println("short = " + s);

        // type casting now
        // double to int (this loses the decimal part)
        double temp1 = 9.99;
        int temp2 = (int) temp1;   // narrowing
        System.out.println("after casting double to int = " + temp2);

        // int to double automatically (widening)
        int xx = 5;
        double dd = xx;   // this happens on its own
        System.out.println("int to double = " + dd);

        // char is actually a number behind the scenes
        char letter = 'B';
        int ascii = letter;   // gives ascii value
        System.out.println("ascii of B is " + ascii);
    }
}
