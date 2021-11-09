package syntax.class12;

public class Method4 {
	
	String method1() {
		return "Sandy"; //Sandy
	}
	String method2 (String name) {
		return name; //System.out.println(canBeAnyName.method2("Roman"));->Roman
	}
	void method3() {
		System.out.println("Mandy"); //Mandy "return" cannot be used with void
	}
	void method4(String name) {
		System.out.println(name); //canBeAnyName.method4("Nasir"); ->NAsir
	}
	String method5 (String mariam) {
		return "Aysha"; //System.out.println(canBeAnyName.method5("Henok")); ->Aysha
		
	}

}
