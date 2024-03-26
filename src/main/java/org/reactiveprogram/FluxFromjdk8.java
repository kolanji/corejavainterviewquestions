package org.reactiveprogram;

import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class FluxFromjdk8 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList(Arrays.asList("1,2,3,3,"));

        Stream<String> strea = list.stream();
        Flux<String> flux = Flux.fromStream(strea);

    }
}
