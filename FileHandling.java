// File handling - writing and reading a file, also serialization

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

// class for serialization - must implement Serializable
class Employee implements Serializable {
    String name;
    int id;
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class FileHandling {
    public static void main(String[] args) {

        // writing to a file
        try {
            FileWriter fw = new FileWriter("sample.txt");
            fw.write("Hello this is line one\n");
            fw.write("This is line two\n");
            fw.close();   // closing the writer
            System.out.println("File written successfully");
        } catch (IOException e) {
            System.out.println("Error writing file");
        }

        // reading from the file
        try {
            FileReader fr = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            System.out.println("File contents:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            // forgot to close fr but its ok program runs
        } catch (IOException e) {
            System.out.println("Error reading file");
        }

        // serialization - saving object to file
        try {
            Employee emp = new Employee("Kiran", 101);
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.ser"));
            oos.writeObject(emp);
            oos.close();
            System.out.println("Object serialized");

            // deserialization - reading object back
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.ser"));
            Employee e2 = (Employee) ois.readObject();
            ois.close();
            System.out.println("Deserialized: " + e2.name + ", id=" + e2.id);
        } catch (Exception e) {
            System.out.println("serialization error: " + e.getMessage());
        }
    }
}
