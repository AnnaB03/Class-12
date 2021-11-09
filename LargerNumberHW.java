package syntax.class12;

public class LargerNumberHW {
  //Create a method that will take 2 parameters as a numbers and prints which number is larger.
	// using integer
	public static void main(String[] args) {
	int [] num= {10,12,18,4,8,3,};
	int largest = Integer.MIN_VALUE;
	
	
	for (int number:num) {
		if (number>largest) {
			largest=number;
		}System.out.println(largest);
		
		
	} System.out.println("Another way using void");
	
	} void printGreater (int num1,int num2) {
	if (num1>num2) {
		System.out.println(num1);
	} else 
		System.out.println(num2);
}
	




}
