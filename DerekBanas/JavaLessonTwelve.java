import java.util.Arrays;
import java.util.LinkedList;

public class JavaLessonTwelve {
	
	public static void main(String[] args) {
		
		LinkedList linedListOne = new LinkedList();
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.add("Achmed Bennani");
		names.add("Aly Syed");
		
		names.addLast("Nathen Martin");
		names.addFirst("Joshua Smith");
		
		names.add(0, "Noah Peters");
		
		names.set(2, "Paul Newman");
		
		names.remove(4);
		names.remove("Joshua Smith");
		
		
		for(String name : names) {
			System.out.println(name);
		}
		
		System.out.println("\nFirst Index:" + names.get(0));
		
		System.out.println("\nLast Index:" + names.getLast());
		
		LinkedList<String> nameCopy = new LinkedList<String>(names);
		
		System.out.println("\nnameCopy: " + nameCopy);
		
		if(names.contains("Noah Peters")) {
			System.out.println("Noah`s here!");
		}
		
		if(names.containsAll(nameCopy)) {
			System.out.println("Match");
		}
		
		System.out.println("\n Aly Index: " + names.indexOf("Aly Syed"));
		
		System.out.println("\n List Empty: " + names.isEmpty());
		
		System.out.println("\n List Size: " + names.size());
		
		
		
	}
	
}