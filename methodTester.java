package syntax.class12;

public class methodTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Line before method call");
		Methods methods = new Methods();// creating an object for the "Methods" class that's why Methods stands first
		methods.times = 3;
		//methods.sayHello(); // calling a method/behavior - - the lines in void will be executed here
		//methods.sayHelloManyTimes(); // calling "sayHelloManyTimes" from the Method class
		//methods.sayHelloManyTimesWithState();
		methods.sayHelloManyTimesWithStateWithParameters(10);
		System.out.println("----------");
		methods.sayHelloManyTimesWithStateWithParameters(5);
		System.out.println("Line after method call");

	}

}
