import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Lesson3 {

	public static void main(String[] args) {
		
		//Declare some variables
		double number1, number2;
		String operator = "";
		number1 = 0;
		number2 = 0;
		
		InputStreamReader istream = new InputStreamReader(System.in) ;
        BufferedReader bufRead = new BufferedReader(istream) ;
        try {
            System.out.println("Enter First Number: ");
            String numInput = bufRead.readLine();
            number1 = Double.parseDouble(numInput);
            
            System.out.println("Enter Second Number: ");
            numInput = bufRead.readLine();
            number2 = Double.parseDouble(numInput);
            
            System.out.println("Enter Operator: ");
            operator = bufRead.readLine();
       		}
        catch (IOException err) {
        	System.out.println("Error reading line");
       		}
        catch(NumberFormatException err) {
           System.out.println("Error Converting Number");
        }
        
        switch (operator){
        case "+":
        	double results;
        	results = calcAdd(number1,number2);
        	System.out.println (number1+" "+operator+" "+number2+" = "+ results);
        	break;
        case "-":
        	System.out.println (number1+" "+operator+" "+number2+" = "+calcSubtract(number1,number2));
        	break;
        case "*":
        case "x":
        	calcMultiply(number1, number2);
        	
        	break;
        case "/":
        case "÷":
        	calcDivide(number1,number2);
        	break;
        default:
        	System.out.println("I do not understand what you want me to do.");
        	break;
        }
        
	}

	private static void calcDivide(double number1, double number2) {
		double divide = 0;
		if (number2 == 0)
		{
			System.out.println ("Dividing by zero will result in infinity.");
		}
		else
		{
			divide = number1 / number2;
			System.out.println (number1+" ÷ "+number2+" = "+divide);
		}
		
	}

	private static void calcMultiply(double number1, double number2) {
		double multiply = 0;
		multiply = number1 * number2;
		display (number1, number2, multiply);
	}

	private static void display(double number1, double number2, double multiply) {
		System.out.println (number1+" x "+number2+" = "+multiply);
		
	}

	private static double calcAdd(double number1, double number2) {
		double add = 0;
		add = number1 + number2;
		return (add);
		
	}
	
	private static double calcSubtract(double number1, double number2) {
		double subtract = 0;
		subtract = number1 - number2;
		return (subtract);
		
	}

}
