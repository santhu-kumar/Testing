
public class Typecasting {

	public static void main(String[] args) {
		
		//Implicit Type Casting
		
		
		int myInt = 10;
		
		double myDouble = myInt;
		
		System.out.println("myInt : " + myInt);
		
		System.out.println("myDouble : " + myDouble);
		
		//Explicity Type Casting (narrowing)
		
		//Larger data type convert into smaller data type
		
		double anotherDouble = 9.5;
		
		int anotherInt = (int) anotherDouble;
		
		System.out.println("anotherDouble : " + anotherDouble);
		
		System.out.println("anotherInt : " + anotherInt);
		

	}

}
