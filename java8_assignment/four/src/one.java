import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class One {

    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(1,2,3,4,5,7,8,9,10);

        System.out.println("Even Numbers  "+l.stream()
                .filter(e->{
                    boolean r=e%2==0;
                    return r;
                })
                        .collect(Collectors.toList())
                );
    }

}
