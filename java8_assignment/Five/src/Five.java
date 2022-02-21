import com.sun.jdi.Value;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Five {

    public static void main (String args[]){
        List<Integer> v= Arrays.asList(6,7,8,9);

        //consumer
        Consumer<Integer> c=new Consumer<Integer>(){
            @Override
            public void accept(Integer integer) {

                    System.out.println(integer);
            }

        };
        v.forEach(c);

        //supplier
        Supplier<LocalDateTime> s=new Supplier  <LocalDateTime>(){
            public LocalDateTime get(){
                return LocalDateTime.now();

            }
        };
        System.out.println("");
        System.out.println(s.get());

        //Predicate

        Predicate<Integer> p=new Predicate<Integer>(){
            @Override
            public boolean test(Integer i) {
                if(i%2==0)return true;
                return false;

            }
        };

        System.out.println("");
        System.out.println(p.test(10));


        //function

        Function<String,Integer> f=new Function<String,Integer>(){
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };


        System.out.println("");
        System.out.println(f.apply("Sadiya"));

    }
}
