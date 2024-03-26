package org.jdk8testprogram.stream;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighetsNumberArray {

    public static void main(String[] args) {

        int[] number = {5, 9, 11, 2, 8, 21, 11};
        //Second Highest
        Integer secoundHighest =
                Arrays.stream(number)
                        .boxed()
                        .sorted(Comparator.reverseOrder())
                        .skip(1).findFirst().get();  //collect(Collectors.toList());
        System.out.println("secoundHighest::" + secoundHighest);

        //Second lowest

          Integer secondLowest = Arrays.stream(number).boxed().sorted().skip(1).findFirst().get();
        System.out.println("secondLowest::" + secondLowest);

    }
}
