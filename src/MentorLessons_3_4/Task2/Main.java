package MentorLessons_3_4.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Salam");
        words.add("Lambda");
        words.add("Java");

        Consumer<String> stringConsumer =(m) -> System.out.println(m + " sozunun uzunlugu " + m.length());

        for (String a : words){
            stringConsumer.accept(a);
        }

    }
}
