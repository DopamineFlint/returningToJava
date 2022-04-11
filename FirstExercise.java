import java.util.*;

public class FirstExercise{
	
	final static int NUMBER_TWO = 3;
	final static int NUMBER_THREE = 4;

    public static void main(String []args){
		int result = 0;
        Scanner scnr = new Scanner(System.in); 
        
        System.out.print("Enter a number: ");
        
        int numberOne = 0;
        
        numberOne = scnr.nextInt();
        
        result = summation(numberOne);
		
		System.out.println("The sum of first and second numbers is: " + result);
		
		result = multiplication(result);
		
		System.out.println("The multiply of result and number three is: " + result);
		
		scnr.close();
    }
	 
	public static int summation(int num) {
		return num + NUMBER_TWO;
	}
	
	public static int multiplication(int num) {
		return num * NUMBER_THREE;
	}
}