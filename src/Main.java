import java.util.ArrayList;

public class Main {

	private static  String[] dup = {"for", "and", "for", "while", "polymorphism", "for", "bienve" , "class" , "superclass", "float"};
	private static ArrayList<String> dupl = new ArrayList<>();

	
	public static void main(String[] args){
		DictionaryTest dt = new DictionaryTest();

		dupl.add("for");
		dupl.add("and");
		dupl.add("for");
		dupl.add("while");
		dupl.add("polymorphism");
		dupl.add("for");
		dupl.add("bienve");
		dupl.add("class");
		dupl.add("superclass");
		dupl.add("inheritance");
		
		dt.addWordsForArray(dupl);
		dt.eliminateDuplicate("for");
	}
}
