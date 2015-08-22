package ua.org.oa.malahk;

public class AppTest {

	public static void main(String[] args) throws Exception {
		AppTests tests = new AppTests(); 
		// TODO Auto-generated method stub
	try{
		if (! tests.testFilmCanBeCreated()) {
			throw new Exception (" not passed ");
		};
		if (! tests.testFilmNameCanBeGet()) {
			throw new Exception (" not passed ");
		};
		if (! tests.testFilmRatingCanBeGet ()) {
			throw new Exception (" not passed ");
		};
		if (! tests.testFilmRatingCanBeSet ()) {
			throw new Exception (" not passed ");
		};
		if (! tests.testFilmRatingCanBeSetAndCorrect ()) {
			throw new Exception (" not passed ");
		};
		if (! tests.testFilmRatingCanBeSetAndCorrect ()) {
			throw new Exception (" not passed ");
		};
		if (! tests.testFilmRatingCanBeSetAndCorrect ()) {
			throw new Exception (" not passed ");
		};
		if (! tests.testFilmRatingCanBeSetAndCorrect ()) {
			throw new Exception (" not passed ");
		};
		
	} catch (Exception e) {
		System.out.println("exception");
		//throw new Exception(e);
	}
	
	System.out.println("All passed!");
	}

}

