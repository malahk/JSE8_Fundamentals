package ua.org.oa.malahk;

public class DynamicStringListTest {

	public static void main(String[] args) {
		DynamicStringList myList = new DynamicStringList();
		myList.add("I");
		myList.add("AM");
		myList.add("GROOT");
		myList.add("!!!");
		System.out.println(myList);
		myList.remove(0);
		System.out.println(myList);
		System.out.println(myList.get(2));
		System.out.println(myList.get());
		myList.remove();
		System.out.println(myList);
		myList.delete();
		System.out.println(myList);
		// TODO Auto-generated method stub

	}

}
