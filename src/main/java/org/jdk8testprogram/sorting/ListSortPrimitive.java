package org.jdk8testprogram.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSortPrimitive {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("kolanji");
        list.add("rathna");
        list.add("murugesan");
        list.add("muru_vadivel");
        list.add("amuthavalli");
        list.add("kala");
        list.add("kuppuswamy");
        list.stream()
                .sorted()
                .forEach(s -> System.out.println(s));

        //Descending order
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(result -> System.out.println(result));
    }
}
