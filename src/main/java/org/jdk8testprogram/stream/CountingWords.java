package org.jdk8testprogram.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingWords {
    public static void main(String[] args) {
        String str = "welcome to code decode";
        //Methods1
        List<String> list = Arrays.asList(str.split(" "));
        Map<String, Long> map = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("countWord methods1"+map);

        //methods2
        Map<String, Long> countWord =
                Arrays.stream(str.split(" "))
                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("countWord methods2"+countWord);


    }
}
