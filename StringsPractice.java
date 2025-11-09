import java.util.Scanner;
public class StringsPractice {
    public static void main(String[] args) {
        // Q1: Convert to lowercase
        String str = " Sarah ";
        System.out.println(str.toLowerCase());

        // Q2: Replace spaces with underscores
        System.out.println(str.replace(' ', '_')); // <-- single quotes, not empty string

        // Q3: Fill in a letter template
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("letter = Dear " + name + ", Thanks a lot.");

        // Q4: Detect double and triple spaces
        String myString = "This  is   a test string";
        System.out.println("Double space index: " + myString.indexOf("  "));
        System.out.println("Triple space index: " + myString.indexOf("   "));

        // Q5: Format using escape sequences
        System.out.println("Dear Harry,\nThis Java Course is nice.\nThanks.");

        input.close();
    }
}

