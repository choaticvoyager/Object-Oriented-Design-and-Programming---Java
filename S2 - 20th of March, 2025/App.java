import IT.*; //Allow access to all the files under the package IT.
import IT.Hons.*;
import AMC.*;

class App{
	public static void main(String[] args){
		IT.FirstYear it1=new IT.FirstYear();//Create an instance of class FirstYear in package IT. 
		FourthYear it4=new FourthYear();
		AMC.FirstYear amc1=new AMC.FirstYear();//By prefixing the package name, prevent naming conflicts. 
		SecondYear amc2=new SecondYear();

		it1.display();//Calls the method belonging to class FirstYear of package IT.
		it4.display();
		amc1.display();		
		amc2.display();
	}
}
