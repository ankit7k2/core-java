import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.Arrays;

class Advance {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 3, 2, 5);
        // int sum = 0;
        // for (int n : list) {
        //     if (n % 2 == 0) {
        //         n = n * 2;
        //         sum = sum + n;
        //     }
        // }
        // System.out.println(sum);
        // list.forEach(n->System.out.println(n));
    //       



Predicate<Integer> isEven = n -> n % 2 == 0;
// Predicate<Integer> isGreaterThan2 = n -> n > 2;


Function<Integer, Integer> doubleIt = n -> n * 2;   






    
//   int result=  list.stream()
//         .filter(isEven.and(isEven)) 
//         .map(doubleIt)
//         .reduce(0,(c,e)->c+e);




  Stream<Integer>sortedValue=  list.stream()
        .filter(isEven.and(isEven)) 
        .sorted();

        sortedValue.forEach(n->System.out.println(n));

        // System.out.println(result);
        // Filter even numbers


            //  stream.forEach(n->System.out.println(n));
            // s2.forEach(n->System.out.println(n));
            //  s3.forEach(n->System.out.println(n));
    }
}
