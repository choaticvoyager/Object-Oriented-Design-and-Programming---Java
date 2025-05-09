import IT.*;
import IT.Hons.*;
import AMC.*;

class App{
	public static void main(String[] args){
		IT.FirstYear it1=new IT.FirstYear();
		FourthYear it4=new FourthYear();
		AMC.FirstYear amc1=new AMC.FirstYear();
		SecondYear amc2=new SecondYear();

		it1.display();
		it4.display();
		amc1.display();		
		amc2.display();
	}
}
