import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static Integer sumIt(Map<Integer, Integer> m){
        Integer sum = 0;
        for(Map.Entry<Integer, Integer> entry : m.entrySet()){
            sum += entry.getValue();
        }
        return sum;
    }

    public static void main(String[] args){
        Map<Integer, Integer> ints = new HashMap<>();
        Integer i = 0;
        while(i < 100){
            ints.put(i, i);
            i=i+1;
        }
        System.out.println("First Sum:" + sumIt(ints));

        ints.remove(0);
        ints.remove(5);
        ints.remove(6);

        System.out.println("Second Sum:" + sumIt(ints));
    }

}
