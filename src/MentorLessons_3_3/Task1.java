package MentorLessons_3_3;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Double> l1 = new ArrayList<>();

        l1.add(1.5);
        l1.add(2.9);
        l1.add(4.6);

        double totalSum = 0;

        for (Double a : l1){
            totalSum+=a;
        }

        System.out.println(totalSum);
    }



}
