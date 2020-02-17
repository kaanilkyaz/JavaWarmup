import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println(findIt(new int[]{1, 3, 4, 23, 23, 4, 5, 6, 7, 1, 2}));
    }

    public static int findIt(int[] array) {
        HashMap<Integer,Integer> map = new HashMap<>();


        for(int i:array){
            if(!map.containsKey(i)){
                map.put(i,1);
            }else{
                map.put(i,map.get(i) + 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 == 1){
                return entry.getValue();
            }
        }
        return 0;
    }
}
