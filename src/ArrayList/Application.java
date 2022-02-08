package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {
		
		ArrayList words = new ArrayList();//arrays before java 5
		words.add("hello");
		words.add("there");
//		words.remove(0);
		words.add(10);
		words.add(9);
		words.add(12.00);
		words.add('H');
		
		Object item1 = words.get(2);//cast to (String)
		Object item2 = words.get(3);// override cast to string
//		System.out.println(item1 + item2);//error not specified data type
		
		ArrayList<String> words1 = new ArrayList<String>();//arrays after java 5 Generics or templating
		words1.add("hello");
		words1.add("there");
		words1.add("10");
		
		String item4 = (String) words1.get(0);//cast to (String)
		String item5 = (String) words1.get(1);
		
		System.out.println(item4 + " " + item5);
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();//cannot use primitive data types in <>
		numbers.add(2);
		numbers.add(5);
		numbers.add(200);
		numbers.add(1);
		numbers.add(2000);
		
		for(int number : numbers) {
			System.out.println(number);
		}
		
	}

}
