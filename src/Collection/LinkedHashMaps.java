package Collection;
import java.util.LinkedHashMap;
import java.util.List;
public class LinkedHashMaps {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> List = new LinkedHashMap<>();
        List.put(11,"Amit");
        List.put(12 , "Varun");
        List.put(13 , "Dongesh");
        List.put(14 , "paplu");
        List.forEach((key , val) -> System.out.println(key + " = " + val));
    }
}
