import java.util.ArrayList;

public class DictionaryTest {

	private ArrayList<String> dictionary = new ArrayList<>();
	private  String[] q = {"for", "nand", "queue", "stack", "polymorphism", "inheritance", "bienve" , "class" , "superclass", "float"};
	
	public DictionaryTest(){
	
	}
	public  void addWordsForArray(ArrayList<String> target){
		for (int i = 0; i < target.size(); i++) {
			dictionary.add(target.get(i));
		}
	}

	public  boolean contains(String target){
		for (int i = 0; i < dictionary.size(); i++) {
			if(dictionary.get(i).equals(target))
				return true;
		}

		return false; 
	}

	private  void moveDataTotheLeft(int i, int j) { 
		for (int index = i; index <= j; index++)
			dictionary.set(index - 1, dictionary.get(index));
	}

	public  int pageSearchNormal(String target){
		//Normal Case
		if(dictionary.isEmpty()){
			return -1;
		}

		else{
			for (int i = 0; i < dictionary.size(); i++) {
				if(dictionary.get(i).equals(target)){
					return i;
				}
			}
		}
		return -1;
	}

	public int pageSearchLW(String target){
		int sum = 0;

		for (int i = 0; i < dictionary.size(); i++) {
			for (int j = 0; j < target.length(); j++) {
				if(target.length() == dictionary.get(i).length()){
					if(Character.compare((dictionary.get(i).charAt(j)), target.charAt(j)) == 0){
						sum++;
					}
				}
			}

			if(sum == target.length()){
				return i;
			}
		}

		return -1;
	}

	public void eliminateDuplicate(String target){
		int sum = 0;
		int index = 0;
		if(contains(target)){
			for (int i = 0; i < dictionary.size(); i++) {
				if(dictionary.get(i).equals(target)){
					sum++;
				}
			}

			while(sum != 1){
				if(dictionary.get(index).equals(target)){
					moveDataTotheLeft(index + 1, dictionary.size() - 1);
					dictionary.set(dictionary.size() - 1 , null);
					
					index++;
					sum--;
				}
			}
		}
          
		for (int i = 0; i < dictionary.size(); i++) {
			System.out.println(dictionary.get(i));
		}
	}

	public  void reverseDictionary(){
		if(!(dictionary.isEmpty())){
			for (int i = 0; i < dictionary.size(); i++) {
				if(i < dictionary.size()/2){
					String tr = dictionary.get(i);
					dictionary.set(i, dictionary.get(dictionary.size() - 1 - i));
					dictionary.set(dictionary.size() - 1 - i, tr) ;
				}
			}
		}

		for (int i = 0; i <dictionary.size(); i++) {
			System.out.println(dictionary.get(i));
		}
	}
}
