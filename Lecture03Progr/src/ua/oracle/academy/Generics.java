package ua.oracle.academy;

public class Generics {
	
	Object ob;
	public Generics (Object o) {
		ob = 0;
	}

	Object getOb() {
		return ob;
	}
}

public class Gen<T> {
	
	T ob;
	public Gen (T o) {
		ob = 0;
	}

	T getOb() {
		return ob;
	}
}
