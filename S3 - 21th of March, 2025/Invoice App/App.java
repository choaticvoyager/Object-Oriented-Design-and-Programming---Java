import human.*;//Allow access to all the files under the package human.

class App{
	public static void main(String[] args){//Main method
		System.out.println("Welcome to Invoice App");
		Person p1=new Person();//Create an instance of class human in package human.
		p1.talk("Hi from Angelo");//Calls the method belonging to class human of package IT.
		System.out.println("Name: "+p1.name);//Calls the variable belonging to the class Person with the message.
	}
}
