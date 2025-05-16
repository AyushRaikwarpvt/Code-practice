package Coding_Questions;

import java.util.ArrayList;

public class Samples {

    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList<>();
        ArrayList<Integer> List1 = new ArrayList<>();
        List.add(11);
        List.add(2);
        List.add(5);
        List.add(3);

        for (int i = 0; i < List.size() ; i++) {
            if (List.get(i) != List.get(i + 1)){
                List1.add(i);
            }
        }

        System.out.println(List1);

    }
}

