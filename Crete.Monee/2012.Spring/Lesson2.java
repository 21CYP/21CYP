import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


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
		
		// Conversions
		
		String number1 = "1.2";
		String number2 = "2.5";
		String number3 = "7253452";
		System.out.println (number1 + number2); // adding string
		Double num1, num2;
		num1 = Double.parseDouble(number1);     // convert string to double
		num2 = Double.parseDouble(number2);		
		System.out.println (num1 + num2); 
		System.out.println (Integer.parseInt(number3) -2);	//on the fly		
		char a = 'a';
		String b = "pple";
		b = Character.toString(a) + b;
		System.out.println (b);
		clearlines();
		
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
		
		int [][] grid = new int [2][2];
		// Loops:
		// for , while (do while / while do), for each statements
		// for loop structure:
		// for (initialize variable, test condition, update value) {task};
		for (i =0; i< 4; i++){System.out.println(i);}
		clearlines();
		
		String[][] array2d = {{"the","first","row"},{"the","second","row"},{"the","third","row"}};

		for (String[] Rows : array2d)
			for (String Cols : Rows)
				System.out.println(Cols);
		
	
		
		
		
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
		
		double[] ar = {1.2, 3.0, 0.8};
		int sum = 0;
		for (double d : ar) {  // d gets successively each value in ar.
		    sum += d;
		};
		System.out.println(sum);
		clearlines();
		
		//Input using istream -- Not important for android but good to know
		InputStreamReader istream = new InputStreamReader(System.in) ;
        BufferedReader bufRead = new BufferedReader(istream) ;
        try {
             System.out.println("Enter your name: ");
             String inputname= bufRead.readLine();

             System.out.println("The Year You Were Born: ");
             String bornYear = bufRead.readLine();
             int age = (2012 - Integer.parseInt(bornYear)) ;
             System.out.println("Hello " + inputname+ ". You are " + age + " years old");
            }
        catch (IOException err) {
             System.out.println("Error reading line");
        }
        catch(NumberFormatException err) {
             System.out.println("Error Converting Number");
        }  
        clearlines();
        
        //multiplication table with input
        try {
             System.out.println("Enter Multiplier: ");
             String numInput= bufRead.readLine();
             number = Double.parseDouble(numInput);
        	}
        catch (IOException err) {
            System.out.println("Error reading line");
        	}
       catch(NumberFormatException err) {
            System.out.println("Error Converting Number");
       }  
		System.out.println ("Multiplication table : " + number +"x");
		for (counter=1; counter <=5; counter++)
		{
			System.out.println(number + " x " + counter + " =  " + (number * counter));
		}
		clearlines();
		
		//IF THEN ELSE
		int legs = 2;
		if (legs == 2)
		{
			System.out.println("You are a human");
		}
		else if (legs == 4)
		{
			System.out.println("Hello Doggie!");
		}
		else
		{
			System.out.println("I have no idea what you are");
		};
		
		
		
		// Switch statement
        int month = 0;
        int year = 0;
        try {
        	 System.out.println("Enter Year:");
             String inputStr= bufRead.readLine();
             year = Integer.parseInt(inputStr);
             System.out.println("Enter Month: ");
             inputStr= bufRead.readLine();
             month = Integer.parseInt(inputStr);
        	}
        catch (IOException err) {
            System.out.println("Error reading line");
        	}
        catch (NumberFormatException err) {
            System.out.println("Error Converting Number");
       }
        switch (month){
          case 1:
          case 3:
          case 5:
          case 7:
          case 8:
          case 10:
          case 12: 
            System.out.println("This month has 31 days.");
            break;
          case 4:
          case 6:
          case 9:
          case 11:
        	  System.out.println("This month has 30 days.");
        	  break;
          case 2:
        	  if (year % 4 == 0)
        	  {
        		  System.out.println("This month 29 days.");
        	  }
        	  else
        	  {
        		  System.out.println("This month 28 days.");
        	  }
        	  break;
          default: 
              System.out.println("I did not get your input. Sorry.");
        }
        
	}

	public static void clearlines()
	{
		System.out.println("___________________________________\n");
	}
	
}
