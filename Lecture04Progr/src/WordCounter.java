import java.util.HashMap;
import java.util.Map;


public class WordCounter {
	
	private Map<String, Integer> words = new HashMap<String, Integer>(); 
	
	public void add(String word){
		int counter = count(word);
		if (word.contains(word)){
			counter = count(word);
		}
		words.put(word, counter+1);
	}
	
	public int count(String word){
		int result = 0;
		int counter = words.get(word);
		if(!(counter = null)){
			result = counter;
		}
		return words.get(word);
	}

}
