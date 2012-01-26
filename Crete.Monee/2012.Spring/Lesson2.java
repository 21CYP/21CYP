
public class Lesson2 {

	/**
	 * Today we will recap primitive datatypes, loops, logic statements and (functions)
	 * 
	 * Turn on line numbers: Windows -> Preferences | General -> Editors -> Text Editors
	 * 
	 */
	
	public static void main(String[] args) {
		// Recap 1
		int i, j, k = 0;
		i = k;
		j = -1;
		System.out.println ("Value of i:" + i);
		System.out.println ("Value of j:" + j);
		System.out.println ("Value of k:" + k);
		clearlines();
		
		//Recap 2
		String name = "The Doctor";
		char name2 = 'T';
		System.out.println ("Printing out string: " + name);
		System.out.println ("Printing out char: " + name2);
		System.out.println ("Adding string to char: " + name + name2);
		clearlines();
		
		
		// Recap 3
		double number = 5;
		int counter;
		System.out.println ("Multiplication table : " + number +"x");
		for (counter=1; counter <6; counter++)
		{
			System.out.println(number + " x " + counter + " =  " + (number * counter));
		}
		clearlines();
		
		// NEW ITEMS
		
		// Arrays
		// What if we want a group of items in one collection? How do we accomplish this?
		
		String[] colors = {"Red", "Green", "Yellow", "Blue"}; // We now have 4 colors in the array of strings
		double[] numbers = {3.14,2.97,121.1,92};
		System.out.println (colors[0]);
		System.out.println (numbers[2]);
		colors[3] = "Orange";
		System.out.println (colors[3]);
		System.out.println (colors.length);
		clearlines();
		
		
		// Loops:
		// for , while (do while / while do), for each statements
		// for loop structure:
		// for (initialize variable, test condition, update value) {task};
		for (i =0; i< 4; i++){System.out.println(i);};
		clearlines();
		
		i = 0; // initialize
		while (i<4) // condition
		{
			System.out.println(i); // task
			i++; //update value
		}
		clearlines();
		
		i = 0; //initialize
		do
		{
			System.out.println(i); // task
			i++; //update value
		} while (i<4); //condition
		clearlines();
		
		for (String s :colors)
		{
			System.out.println (s);
		};
	}

	public static void clearlines()
	{
		System.out.println("___________________________________\n");
	}
	
}
