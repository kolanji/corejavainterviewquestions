package org.jdk8program.fucntionalinterface.Streaming;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MinMax_Test {
	public static void main(String[] args) {

		List<Integer> l = new ArrayList();
		l.add(1);
		l.add(0);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);

		Stream<Integer> ll = l.stream();
		
		//find max values find in arrayList
		 Optional<Integer> maxValue = l.stream()
				 .max((x,y)->{ return x.compareTo(y);});
		
		//Find the Minimum values for arrayList
		
		Optional<Integer> minValue = ll.min((x, y) -> {return x.compareTo(y);});

		if (maxValue.isPresent()) {

			System.out.println("Max Value " + maxValue.get());
		}

	}

}
