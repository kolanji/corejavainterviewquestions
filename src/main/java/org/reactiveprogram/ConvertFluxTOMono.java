package org.reactiveprogram;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ConvertFluxTOMono {
    public static void main(String[] args) {

        Flux<Integer> flux = Flux.just(12);
        Mono<Integer> mono = flux.next();
        // get data from mono
        mono.subscribe(data -> System.out.println("monoFromFlux1 data: " + data));

        // multiple values
        Flux<String> flux2 = Flux.just("data2", "data3", "data4");

        Mono<String> monoFromFlux2 = flux2.next();

        // get data from mono
        monoFromFlux2.subscribe(data -> System.out.println("monoFromFlux2 data: " + data));
    }
}
