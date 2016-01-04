import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {
    public static Integer sumIt(Set<Integer> set){
        Integer sum = 0;

        for(Integer i: set){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args){
        Set<Integer> ints = new HashSet<>();
        Integer i = 0;
        while(i < 100){
            ints.add(i);
            i=i+1;
        }
        System.out.println("First Sum:" + sumIt(ints));

        ints.remove(0);
        ints.remove(70);
        ints.remove(30);

        System.out.println("Second Sum:" + sumIt(ints));
    }

}
