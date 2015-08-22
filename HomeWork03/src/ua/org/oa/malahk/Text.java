package ua.org.oa.malahk;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Plan
 * 1) string -> list<words>
 * 2) list<words> -> set<unique words> <=> list<counters>
 * 3) print it
 */
public class Text
{
	protected ArrayList<String> uniqueWords;
	protected ArrayList<Integer> uniqueWordsCount;
	protected static int length = Text.length();
	
	public Text()
	{
		this.uniqueWords = new ArrayList<String>();
		this.uniqueWordsCount = new ArrayList<Integer>();
	}
	
	private static int length() {
		// TODO Auto-generated method stub
		return Text.length;
	}

	public void countWords(String text)
	{
		for (CountedWord countedWord : this.words2counted(this.text2words(text))) {
			//print result
			System.out.println(countedWord.getWord() + ": " + countedWord.getCount());
		}
		

		// expected result:
//		System.out.println("I" + ": " + "1");
//		System.out.println("am" + ": " + "1");
//		System.out.println("Groot" + ": " + "1");
	}
	
	/**
	 * Get array of words
	 * split???
	 *
	 * @param text
	 * @return
	 */
	protected ArrayList<String> text2words(String text)
	{
		ArrayList<String> words = new ArrayList<String>();
		
		for (String word: text.split(" ")) {
			words.add(word);
		}

		return words;
	}
	

	//protected String[] text2words(String text)
	//{
		//return text.split(" ");
	//}
	
	/**
	 * count words
	 * 
	 * @param words
	 * @return
	 * set uniqueWords
	 */
	protected ArrayList<CountedWord> words2counted(ArrayList<String> words)
	{
		ArrayList<CountedWord> countedWords = new ArrayList<CountedWord>();
		
		words:for (String word: words) {
			for (int wordPosition = 0; wordPosition < countedWords.size(); wordPosition++) {
				if (countedWords.get(wordPosition).equalsIgnoreCase(word)) {
					countedWords.get(wordPosition).increase();
					continue words;
				}
			}
			
			countedWords.add(new CountedWord(word));
		}
		
		return countedWords;
	}
}
