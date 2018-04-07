import java.util.ArrayList;

/**Dictionary.java is a special dictionary with coding words which you'll used your whole career as a programmer. 
 * The following class gives you access to the dictionary in many different ways for information such as the page where the word's at (index), if the word exist, etc.
 * The objective is to complete the tasks so the dictionary works perfectly. 
 * 
 * Important: Some methods are given, use if necessary.
 * 
 * @author Maria Novoa
 * @author Luis Rivera
 *
 */
public class Dictionary {

	private static String[] dictionary = new String[10];
	
	
	public String[] getDictionary() {
		return dictionary;
	}


	public void setDictionary(String[] dictionary) {
		this.dictionary = dictionary;
	}

	public boolean contains(String target){
		for (int i = 0; i < dictionary.length; i++) {
			if(dictionary[i].equals(target))
				return true;
		}
		
		return false; 
	}
	
	private void moveDataTotheLeft(int i, int j) { 
		for (int index = i + 1; index <= j; index++)
			dictionary[index] = dictionary[index + 1]; 
	}

	public int pageSearchNormal(String target){
		//Q1:
		return 0; //Change if needed
	}
	
	public void eliminateDuplicate(String target){
		//Q2:
	}
	
	public void reverseDictionary(){
		//Q3:
	}
	
}
