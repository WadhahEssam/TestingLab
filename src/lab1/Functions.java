package lab1;

public class Functions {
	public int divide(int a, int b) {
		return a/b;
	}
	
	public String concat(String a,String b) {
		return a + "" + b ; 
	}
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	public boolean isLeabYear(int year) {
		if (year%4 == 0) {
			return true;
		} else {
			throw new IllegalArgumentException("it is not a leab year");
		}
	}
}
