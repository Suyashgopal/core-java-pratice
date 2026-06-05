// New features in Java 17 and 21
// records, sealed classes, switch expression, text blocks, pattern matching

public class Java17and21Features {

    // record - a quick way to make a data class (java 17)
    record Point(int x, int y) { }

    // sealed class - only allowed classes can extend it (java 17)
    sealed interface Shape permits Circle, Square { }
    record Circle(double radius) implements Shape { }
    record Square(double side) implements Shape { }

    // describe a shape using instanceof pattern matching
    // NOTE: in java 21 we can do this with switch pattern matching directly,
    // but my jdk is 17 so i used if-else with instanceof here
    static String describe(Shape s) {
        if (s instanceof Circle c) {
            return "Circle with area " + (3.14 * c.radius() * c.radius());
        } else if (s instanceof Square sq) {
            return "Square with area " + (sq.side() * sq.side());
        }
        return "unknown shape";
    }

    public static void main(String[] args) {

        // using record
        Point pt = new Point(3, 7);
        System.out.println("Point: " + pt);   // record auto makes toString
        System.out.println("x = " + pt.x() + ", y = " + pt.y());

        // text block - multi line string (java 17)
        String json = """
                {
                    "name": "Student",
                    "course": "Java FSE"
                }
                """;
        System.out.println("Text block:");
        System.out.println(json);

        // pattern matching for instanceof
        Object obj = "I am a string";
        if (obj instanceof String str) {
            // no need to cast, str is already String
            System.out.println("Length of string = " + str.length());
        }

        // sealed + switch expression
        Shape c = new Circle(5);
        Shape sq = new Square(4);
        System.out.println(describe(c));
        System.out.println(describe(sq));
    }
}
