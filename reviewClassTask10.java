package syntax.class12;

public class reviewClassTask10 {

	public static void main(String[] args) {
 // Write a java program to find the second largest number in the array?
int [] numbers = {10,15,17,13,30};
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for (int number:numbers) {
			if (number>largest) {
				secondLargest = largest;
				largest=number;
			} else if (number>secondLargest && largest != number) {
				secondLargest=number;
				
			}
				
			}
		System.out.println("largest "+ largest);
		System.out.println("second largest "+ secondLargest);
		}

	}


