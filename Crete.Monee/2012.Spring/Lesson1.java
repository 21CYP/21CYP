
public class lessons {
	public static void main(String[] args) {
		// how to show messages on screen
		//print will print to one line and will continue on the same line
		//println will print and send carriage return to the next line
		System.out.print("Hello World! ");
		System.out.println("This is my first program.");
		System.out.println("End of line");
		
		//clear -----
		System.out.println("_____________________________________\n");
		
		//declaring variables
		//we will declare variable of primitive data types.
		//ie. int, double, long, float, short, char, bool, string etc.
		
		int books = 0;
		float pages1,pages2, averagepages;
		String name ="The Doctor";
		
		//We will now use the declared variables.
		books = 2; // Changed the value of books to 2.
		books = books + books; // This statement is the same as books = 2 + 2 since books was previously changed to 2.
		System.out.println("I have " + books + " books in my bag."); //you can use variables in the middle of a output statement.

		pages1 = 12;
		pages2 = 17;
		averagepages = (pages1+pages2)/2; // We can calculate using variable names.
		System.out.print("First book has " + pages1 + " pages.\n");
		System.out.print("Second book has " + pages2 + " pages.\n");
		System.out.println("The average number of pages is " + averagepages + ".");
		System.out.println("My name is " + name);
		//Yes we can + to string. Sometimes, it may not make sense.
		System.out.println("Added twice, my name will show as follows: " + (name + name)+ ". Does that make sense?");
		
		//clear -----
		System.out.println("_____________________________________\n");
				
		//Let's do some simple loops.
		//We can write 3 line this way:
		System.out.println("Line 1");
		System.out.println("Line 2");
		System.out.println("Line 3");
		
		//clear -----
		System.out.println("_____________________________________\n");
				
		//or we can just do it much simpler by using a for loop.
		// for (counter ; counter's condition, change counter or do something){statement};
		int counter; // Declare the counter first
		for (counter = 1; counter <4; counter++) // for loop
			{ // we'll put in the statement here
				System.out.println("Line "+counter);
			};
			
		//clear -----
		System.out.println("_____________________________________\n");	
		//how about a simple multiplication table to 10
		for (int i = 1; i <11; i++) // for loop
			{ // we'll put in the statement here
				System.out.println("5 x " + i + " = " + (5*i));
			};
			
	}

}
