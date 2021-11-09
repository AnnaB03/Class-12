package syntax.class12;

public class Methods {
	
	int times=5; // whatever value we assign here it's overwritten by the main object 
	void sayHello() {
		System.out.println("Hello Batch 11");
	}
	void sayHelloManyTimes() {
		for (int i=0; i<5; i++) {
			System.out.println("Hello Batch 11");
		}
		
	}
	void sayHelloManyTimesWithState() {
		for (int i=0; i<times; i++) {
			System.out.println("Hello Batch 11");
		}
	}
	void sayHelloManyTimesWithStateWithParameters(int times) {
		for (int i=0; i<times; i++) {
			System.out.println("Hello Batch 11");
}
}}