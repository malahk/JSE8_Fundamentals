

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WordCounterTest {

	private static final String CAT = "Cat";
	private static final String DOG = "Dog";

	private WordCounter wordCounter;
	
	@Before
	public void setup(){
		wordCounter = new WordCounter();
	}
	
	@After
	public void tearDown() {
		
	}
	
	@Test
	public void testZeroCount(){
		Assert.assertEquals(0, wordCounter.count(CAT));
	}
	
	@Test
	public void testAddOneWord(){
		int expected = 3;
		for (int i = 0; i < expected; ++i) {
			wordCounter.add(CAT);
		}
		Assert.assertEquals(expected, wordCounter.count(CAT));
	}
	
	@Test
	public void addTwoWord() {
		int expectedCat = 5;
		int expectedDog = 8;
		for (int i = 0; i < expectedCat; ++i) {
			wordCounter.add(CAT);
		}
		for (int i = 0; i < expectedDog; ++i) {
			wordCounter.add(DOG);
		}
		Assert.assertEquals(expectedCat, wordCounter.count(CAT));
		Assert.assertEquals(expectedDog, wordCounter.count(DOG));
	}
	@SuppressWarnings("unused")
	private void assertWordsInCounter (int expected, String word) {
		
		
	}
}
