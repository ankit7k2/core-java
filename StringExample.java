public class StringExample {
    public static void main(String[] args) {

        // Creating strings
        String str1 = "Hello";
        String str2 = new String("World");
        String str3 = str1 + " " + str2; // Concatenation

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Concatenated: " + str3);

        // String methods
        System.out.println("\nString Methods:");
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1: " + str1.charAt(1));
        System.out.println("Substring (1,4): " + str1.substring(1, 4));
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());

        // String comparison
        String s1 = "Hello";
        String s2 = "hello";
        String s3 = "Hello";

        System.out.println("\nString Comparison:");
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // false
        System.out.println("s1.equalsIgnoreCase(s2): " + s1.equalsIgnoreCase(s2)); // true
        System.out.println("s1 == s3: " + (s1 == s3)); // true (same reference)
        System.out.println("s1 == new String(\"Hello\"): " + (s1 == new String("Hello"))); // false

        // String searching
        String text = "Java is a programming language";
        System.out.println("\nString Searching:");
        System.out.println("Contains 'programming': " + text.contains("programming"));
        System.out.println("Index of 'is': " + text.indexOf("is"));
        System.out.println("Last index of 'a': " + text.lastIndexOf("a"));
        System.out.println("Starts with 'Java': " + text.startsWith("Java"));
        System.out.println("Ends with 'language': " + text.endsWith("language"));

        // String replacement and trimming
        String messy = "  Java Programming  ";
        System.out.println("\nString Modification:");
        System.out.println("Original: '" + messy + "'");
        System.out.println("Trimmed: '" + messy.trim() + "'");
        System.out.println("Replace 'Java' with 'Python': " + text.replace("Java", "Python"));
        System.out.println("Replace all 'a' with '@': " + text.replaceAll("a", "@"));

        // String splitting
        String csv = "apple,banana,cherry,date";
        String[] fruits = csv.split(",");
        System.out.println("\nString Splitting:");
        System.out.println("Original: " + csv);
        System.out.print("Split result: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // StringBuilder for mutable strings
        System.out.println("\nStringBuilder:");
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(6, 12, "Java");
        System.out.println("StringBuilder result: " + sb.toString());
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());

        // String formatting
        String name = "Alice";
        int age = 25;
        double salary = 50000.50;

        System.out.println("\nString Formatting:");
        System.out.println("Using + operator: " + name + " is " + age + " years old and earns $" + salary);
        System.out.println(
                "Using String.format: " + String.format("%s is %d years old and earns $%.2f", name, age, salary));
        System.out.println("Using printf: ");
        System.out.printf("%s is %d years old and earns $%.2f%n", name, age, salary);
        // StringBuilder for mutable strings
        System.out.println("\nStringBuilder:");
        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" World");
        sb2.insert(5, ",");
        sb2.replace(6, 12, "Java");
        System.out.println("StringBuilder result: " + sb2.toString());
        System.out.println("Capacity: " + sb2.capacity());
        System.out.println("Length: " + sb2.length());
        // StringBuffer for thread-safe mutable strings
        System.out.println("\nStringBuffer:");
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        sbf.insert(5, ",");
        sbf.replace(6, 12, "Java");
        System.out.println("StringBuffer result: " + sbf.toString());
        System.out.println("Capacity: " + sbf.capacity());
        System.out.println("Length: " + sbf.length());

        // String formating with String.format
        String name2 = "Bob";
        int age2 = 30;
        double salary2 = 60000.75;
        System.out.println("\nString Formatting:");
        System.out.println("Using + operator: " + name2 + " is " + age
                + " years old and earns $" + salary2);
        System.out.println(
                "Using String.format: " + String.format("%s is %d years  old and earns $%.2f", name2, age2, salary2));
        System.out.println("Using printf: ");
        System.out.printf("%s is %d years old and earns $%.2f%n", name2, age2, salary2);

    }
}
