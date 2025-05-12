import a.*; //Allow access to all the files under the package a.
import b.*; ////Allow access to all the files under the package b.

class App{
	public static void main(String[] args){ //Main method
		a.Test a1= new a.Test(); //Create an instance of class Test in package a. 
		b.Test b1= new b.Test(); //Create an instance of class Test in package b.
		
		a1.print(); //Calls the method belonging to class Test of package a
		a1.display();
		b1.print(); //Calls the method belonging to class Test of package b
	}
}
