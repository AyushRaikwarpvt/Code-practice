package Collection;

import java.util.ArrayList;
import java.util.List;

public class Comparators {

    public static void main(String[] args) {

        List<Integer> List = new ArrayList<>();

        List.add(12);
        List.add(3);
        List.add(14);
        List.add(11);
        List.add(9);

        List.sort(null);

        System.out.println(List);
    }

}
