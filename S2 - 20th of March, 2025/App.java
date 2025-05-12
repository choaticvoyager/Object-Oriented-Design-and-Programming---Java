import IT.*; //Allow access to all the files under the package IT.
import IT.Hons.*; //Allow access to all the files under the package Hons of IT
import AMC.*; //Allow access to all the files under the package AMC.

class App{
	public static void main(String[] args){ //Main method
		IT.FirstYear it1=new IT.FirstYear();//Create an instance of class FirstYear in package IT. 
		FourthYear it4=new FourthYear();
		AMC.FirstYear amc1=new AMC.FirstYear();//By prefixing the package name, prevent naming conflicts. 
		SecondYear amc2=new SecondYear();

		it1.display();//Calls the method belonging to class FirstYear of package IT.
		it4.display();//Calls the method belonging to class FourthYear of package IT.
		amc1.display();//Calls the method belonging to class FirstYear of package AMC.	
		amc2.display();//Calls the method belonging to class SecondYear of package AMC.
	}
}
