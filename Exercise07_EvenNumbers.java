/**
 * 
 */
package labExercises;

/**
 * 
 */
public class Exercise07_EvenNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] evenNumbers = populateArrayWithEvenNumbers();

		displayFullArrayToConsole(evenNumbers);
		System.out.println();
		totalOfNumbersInArray(evenNumbers);

	}

	/**
	 * This Method prints the total of the numbers in the array to the console
	 * 
	 * @param evenNumbers - Input array
	 */
	public static void totalOfNumbersInArray(int[] evenNumbers) {
		int total = 0;

		for (int nums : evenNumbers) {
			total += nums;
		}
		System.out.println();
		System.out.println("The total of the numbers in this array is: " + total);
	}

	/**
	 * This Method prints the array to console
	 * 
	 * @param evenNumbers - Array to be printed
	 */
	public static void displayFullArrayToConsole(int[] evenNumbers) {
		for (int i = 0; i < evenNumbers.length; i++) {
			if (evenNumbers[i] == 100) {
				System.out.print(evenNumbers[i]);
				continue;
			}
			System.out.print(evenNumbers[i] + ", ");
		}
	}

	/**
	 * This method populates the array with even numbers
	 * 
	 * @return - an array populated with even numbers
	 */
	public static int[] populateArrayWithEvenNumbers() {
		int[] evenNumbers = new int[50];
		int index = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evenNumbers[index] = i;
				index++;
			}
		}
		return evenNumbers;
	}

}
