import java.util.List;
import java.util.Optional;
import java.util.Arrays;

class OptionalEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        Optional<String> optionalName = names.stream()
                .filter(name -> name.startsWith("A"))
                .findFirst();

        System.out.println(optionalName.orElse("No name found starting with A"));
    }
}
