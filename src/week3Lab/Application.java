package week3Lab;
import java.util.Arrays;
import java.util.List;


public class Application {
	
	public static void greeting(String name) {
		System.out.println("Hello " + name + ", welcome to Hogwarts!");
	}
	public static String greeting2(String name) {
		return "Hello " + name + ", welcome to Promineo tech.";
	}
	public static boolean intGreaterString(String string, int number){
		return number > string.length();
	}
	public static boolean checkString(String[] array, String string){
		List<String> list = Arrays.asList(array);
		if(list.contains(string)) {
			return true;
		}else {
			return false;
		}
	}
	public static int getSmallest(int[] numbers) {
		Arrays.sort(numbers);
		return numbers[0];
	}
	public static double doubleAverage(double[] array) {
		double sum = 0;
		for(double number : array) {
			sum += number;
		}
		return sum / array.length;
	}
	public static int[] stringConvert(String[] strings) {
		int[] array = new int[strings.length];
		for(int i = 0; i < strings.length; i ++) {
			array[i] = strings[i].length();
		}
		return array;
	}
	public static boolean evensVsOdds(String[] words) {
		int evens = 0;
		int odds= 0;
		for(String word : words) {
			if(word.length() % 2 == 0) {
				evens += word.length();
			}else {
				odds += word.length();
			}
		}
		return evens > odds;
	}
	public static boolean palindromeCheck(String word) {
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) != word.charAt(word.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		//create an array with values 1, 5, 2, 8, 13, and 6
		int[] numbers = {1,5,2,8,13,6};
		//print out the first element in the array
		System.out.println(numbers[0]);
		//print out the last element of the array without using the number 5
		System.out.println(numbers[numbers.length - 1]);
		//print out the element in the array at position 6. what happens?
		//System.out.println(numbers[6]); 
			/*
			 * There's an error because there is no position 6. Java starts counting at 0 
			 * not 1. The final element of an array will always be the 
			 * number of elemenets minus 1
			 * 
			 * Commenting out to allow program to continue
			 */
		//print out the element in the array at position -1. What happens?
		//System.out.println(numbers[-1]);
			//same thing as before. there is no -1.
			//commenting out to allow program to continue
		//write a traditional for loop that prints out each element in the array
		System.out.println("Traditional for loop");
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		//write and enhanced for loop that that prints out each element of the array
		System.out.println("Enhanced for loop");
		for(int number : numbers) {
			System.out.println(number);
		}
		//create a new variable called sum, write a loop that adds all the elements
		//in the array into sum
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		System.out.println("The sum of all the numbers in the array is " + sum);
		//create a new variable called average and assign the average value of the array to it
		int average = sum / numbers.length;
		System.out.println("The average value in the array is " + average);
		//write an enhanced for loop that prints out each number in the array only
		// if the number is odd
		System.out.print("The odd numbers in the array are:");
		for(int number : numbers) {
			if(number % 2 != 0) {
				System.out.print(" " + number);
			}
		}
		System.out.println();
		//create an array that contains the values Sam, Sally, Thomas, and Robert
		String[] names = {"Sam","Sally","Thomas","Robert"};
		//calculate the sum of all the letters in the new array
		int nameSum = 0;
		for(String name : names) {
			nameSum += name.length();
		}
		System.out.println("The sum of the all the letters in the new name array is " + nameSum);
		//write and test a method that takes a string name and prints out a greeting
		//this method returns nothing
		greeting("Sean");
		//write and test a method that does the same as before but don't print from the method 
		System.out.println(greeting2("Sean"));
		//analyze the difference between these two methods - what do you find? How are they different?
			/*
			 * They do the same thing, but with slightly different logic and thinking behind them. 
			 * with the second one, its just a matter of preference
			 */
		//write and test a method that takes a string and an int and returns true if the number 
		//of letters in the string is greater than the int
		System.out.println(intGreaterString("Sean", 5));//returns true
		System.out.println(intGreaterString("Sean", 4));//returns false
		//write and test a method that takes an array of strings and a string and 
		//returns true if the string passed in exists in the array
		String[] roomates = {"Molly","Amber","Sean","Adam","Sean"};
		System.out.print("Is Holly a roomate: ");
		System.out.println(checkString(roomates, "Holly"));
		System.out.print("Is Sean a roomate: ");
		System.out.println(checkString(roomates, "Sean"));
		//write and test a method that takes an array of integers and returns the smallest number
		// in the array
		int[] smallestTest = {5,60,3,8};
		System.out.print("My test array is: ");
		for(int number : smallestTest) {
			System.out.print(number + " ");
		}
		System.out.println();
		System.out.println("The smallest number is that array is " + getSmallest(smallestTest));
		//write and test a method that takes an array of doubles and and returns the average
		double[] averageTest = {10.6,15.11,20.1,42.5,24.99};
		System.out.print("My test array of doubles is: ");
		for(double number : averageTest) {
			System.out.print(number + " ");
		}
		System.out.println();
		System.out.println("The average of that array is " + doubleAverage(averageTest));
		//write and test a method that takes an array of strings and returns an array 
		//of integers where each element matches the length of the string in that position
		String[] stringTest = {"I","am","car","savy"};
		System.out.print("The test string array is: ");
		for(String word : stringTest) {
			System.out.print(word + " ");
		}
		System.out.println();
		int[] stringTest2 = stringConvert(stringTest);
		System.out.print("The number of letters in each word is: ");
		for(int number : stringTest2) {
			System.out.print(number + " ");
		}
		System.out.println();
		//write and test a method that takes an array of strings and returns true if the sum 
		//of letters for all strings with an even amount of letters is greater than 
		//the sum of those with an odd amount of letters
		String[] oddVsEven1 = {"even","road","odd","two"};//this should be true when tested
		System.out.print("First test (that should come back true) is: ");
		for(String word : oddVsEven1) {
			System.out.print(word + " ");
		}System.out.println();
		String[] oddVsEven2 = {"to","be","three","kittens"};//this should be false when tested
		System.out.print("Second test (that should come back false) is: ");
		for(String word : oddVsEven2) {
			System.out.print(word + " ");
		}System.out.println();
		System.out.println("The first set of words: " + evensVsOdds(oddVsEven1));
		System.out.println("The second set of words: " + evensVsOdds(oddVsEven2));
		//write and test a method that takes a string and returns true if the string
		//is a palindrome
		System.out.println("Is the word 'car' a palindrome?: " + palindromeCheck("car"));
		System.out.println("Is 'racecar' a palindrome?: " + palindromeCheck("racecar"));
	}//end of main method

}//end of Application
