package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;


class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1 , Integer o2){
        return  o2 - o1;
    }

}


public abstract class Comparators {

    public static void main(String[] args) {

        List<Integer> List = new ArrayList<>();

        List.add(12);
        List.add(11);
        List.add(8);
        List.add(13);

        List.sort(new MyComparator());

        System.out.println(List);


    }


}
