package org.jdk8testprogram.fucntionalinterface.Streaming;

import java.util.HashMap;
import java.util.Map;

public class HashmapStream {

	
public static void main(String[] args) {
	Map<Integer,String>map=new HashMap();
	
	map.put(1,"a");
	map.put(2,"b");
	map.put(3,"c");
	//Printl all element
	//map.entrySet().stream().forEach(e->System.out.println(e));
	//Filter 
	map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(e->System.out.println(e));
}
}
