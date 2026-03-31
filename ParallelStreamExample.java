import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class Parallelstreamex {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10000);
        Random rand=new Random();
        for (int i = 1; i <= 10_000; i++) {
            list.add(rand.nextInt(100));
        }
        // System.out.println(list);
        int sum=list.stream().filter(n->n%2==0).mapToInt(n->n*2).sum();
        System.out.println("Sum of doubled even numbers: " + sum);


        long  startSeq=System.currentTimeMillis();

        int sum1=list.stream().map(i->i*2).mapToInt(i->i).sum();
        System.out.println("Sum of doubled numbers: " + sum1);

       long endSeq=System.currentTimeMillis();

        System.out.println("Time taken for sequential stream: " + (endSeq-startSeq) + " ms" );
            long  startPar=System.currentTimeMillis();

        int sum2=list.parallelStream().map(n->n*2).mapToInt(n->n).sum();
        System.out.println("Sum of doubled even numbers using parallel stream: " + sum2);
        long endPar=System.currentTimeMillis();
        System.out.println("Time taken for parallel stream: " + (endPar-startPar) + " ms" );
    }
}
