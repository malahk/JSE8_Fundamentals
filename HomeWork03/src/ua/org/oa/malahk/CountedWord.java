package ua.org.oa.malahk;

public class CountedWord
{
	protected String word;
	protected int count;

	public CountedWord(String word)
	{
		this.word = word;
		this.count = 1;
	}

	public String getWord()
	{
		return this.word;
	}

	public int getCount()
	{
		return this.count;
	}
	
	public void increase()
	{
		this.count += 1;
	}
	//case insensitive
	//public Boolean compare(String another)
	//{
		//return this.word == another;
	//}
	
	//http://www.tutorialspoint.com/java/java_string_equalsignorecase.htm
	 // or use String.toLowerCase(); method on Text;
	public boolean equalsIgnoreCase(String another)
	{
		return this.word.equalsIgnoreCase(another);
	}
	
}
