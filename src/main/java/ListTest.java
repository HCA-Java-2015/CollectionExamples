import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static Integer sumIt(List<Integer> list){
        Integer sum = 0;
        Integer i;
        for(i = 0; i < list.size(); i = i + 1){
            sum += list.get(i);
        }
        return sum;
    }

    public static void main(String[] args){
        List<Integer> ints = new ArrayList<>();
        Integer i = 0;
        while(i < 100){
            ints.add(i);
            i=i+1;
        }
        System.out.println("First Sum:" + sumIt(ints));

        ints.remove(0);
        ints.remove(0);
        ints.remove(0);

        System.out.println("Second Sum:" + sumIt(ints));
    }

}
