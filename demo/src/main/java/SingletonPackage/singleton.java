package SingletonPackage;

public class singleton {

	/* 1. In OOP a singleton class is a class that can have only one object(instance of
	the class) at a time*/
	/* 2. How to design singleton class:*/
	/* 3. Make construtor as private*/
	/* 4. Write a public static method that as return type of object of this singleton
	class(Lazy Initialization)*/

	private static singleton singleton_instance = null; // Refrence variable of the class
	public String str; // Create a variable

	private singleton() {
		str = " Im using singleton class pattern";
	}
	
	public static singleton getInstance() {
		if(singleton_instance == null) 
			singleton_instance = new singleton();	
		 return singleton_instance;
	}
	
	public static void main(String[] args) {
		singleton x = singleton.getInstance();
		singleton y = singleton.getInstance();
		singleton z = singleton.getInstance();
        
		x.str = (x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		z.str = (z.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	}
}
