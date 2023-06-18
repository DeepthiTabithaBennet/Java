import java.util.*;
import java.util.stream.*;

class StreamsDemo{
    public static void main(String args[]){

        // create a list of integers
        List<Integer> number = Arrays.asList(7, 3, 9, 2);

        // demonstration of map method
        List<Integer> MultThree = number.stream().map(x -> x*3).collect(Collectors.toList());
        System.out.println(MultThree);

        // create a list of String
        List<String> names = Arrays.asList("Game","Startup","Leave");

        // demonstration of filter method
        List<String> result1 = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result1);
       
        List<String> result2 = names.stream().filter(s->s.endsWith("e")).collect(Collectors.toList());
        System.out.println(result2);

        // demonstration of sorted method
        List<String> show = names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);

        // create a list of integers
        List<Integer> numbers = Arrays.asList(6, 2, 1);

        // collect method returns a set
        Set<Integer> MultFour = numbers.stream().map(x->x*4).collect(Collectors.toSet());
        System.out.println(MultFour);
 
        // demonstration of forEach method
        number.stream().map(x->x*x).forEach(y->System.out.println(y));

        // demonstration of reduce method
        int even =number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
        System.out.println(even);
    }
}
