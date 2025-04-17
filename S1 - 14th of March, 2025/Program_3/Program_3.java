class One{
	int a=10; //variable definition
	int b; //variable declaration
	
	void PrintDetails(){ //Method
		System.out.println("From class One a = "+a);//To print the value of 'a' with the message
		System.out.println("From class One b = "+b);//To print the value of 'b' with the message
	}
}

class Two{
	int a,c; //declaration only
	
	void PrintDetails(){ //Method
		System.out.println("From class Two a = "+a); //To print the value of 'a' with the message
		System.out.println("From class Two c = "+c); //To print the value of 'c' with the message
	}
}

class App{
	public static void main(String[] args){//Main method signature
		One o1=new One(); //Creating an instance of One named o1.
		Two t1=new Two(); //Creating an instance of Two named t1.
		o1.PrintDetails(); //Calling the method of class One on o1 to print the initial values of 'a' and 'b'
		o1.b=100; //Initializing 'b' of instance 'o1' of class One
		o1.PrintDetails();//Calling the method of class One on o1 to print the initialized values of 'a' and 'b'
		t1.PrintDetails();//Calling the method of class Two on t1 to print the initial values of 'a' and 'c'
		t1.a=20;//Initializing 'a' of instance 't1' of class Two
		t1.c=30;//Initializing 'c' of instance 't1' of class Two
		t1.PrintDetails();//Calling the method of class Two on t1 to print the initialized values of 'a' and 'c'
	}
}