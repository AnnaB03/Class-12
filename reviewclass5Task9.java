package syntax.class12;

public class reviewclass5Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Maximum and minimum number in the array?
		
		int [] numbers = {10,5,3,-5,15};
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		for (int i=0; i <numbers.length;i++) {
			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
			if (numbers[i]>largest) {
				largest = numbers[i];
			}
		}System.out.println(largest);
		System.out.println(smallest);

	} 
	
	

}
