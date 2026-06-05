// String class and methods, also StringBuilder

public class StringsDemo {
    public static void main(String[] args) {

        String str = "Hello Java World";

        // common string methods
        System.out.println("Length = " + str.length());
        System.out.println("Upper = " + str.toUpperCase());
        System.out.println("Lower = " + str.toLowerCase());
        System.out.println("Char at 0 = " + str.charAt(0));
        System.out.println("Substring = " + str.substring(6));
        System.out.println("Replace = " + str.replace("Java", "Python"));
        System.out.println("Index of World = " + str.indexOf("World"));
        System.out.println("Contains Java? " + str.contains("Java"));

        // checking if two strings equal
        String a = "abc";
        String b = "abc";
        System.out.println("a equals b? " + a.equals(b));

        // reverse a string using StringBuilder
        StringBuilder sb = new StringBuilder("beginner");
        sb.reverse();
        System.out.println("Reversed = " + sb.toString());

        // counting vowels in a string the simple way
        String word = "education";
        int vowelCount = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            // check vowel
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Vowels in " + word + " = " + vowelCount);
    }
}
