package syntax.class12;

public class Method4Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method4 canBeAnyName = new Method4();
		String name1 = canBeAnyName.method1();
		System.out.println(name1);
		
		System.out.println(canBeAnyName.method2("Roman"));
		
		//System.out.println(canBeAnyName.method4());
		//System.out.println(canBeAnyName.method3()); not possible
		canBeAnyName.method3();
		canBeAnyName.method4("Nasir");
		System.out.println(canBeAnyName.method5("Henok")); //only matters what you are returning

	}

}
