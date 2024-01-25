import java.util.Arrays;

/**
 * Implement each of the 10 methods tested in JUnitTests.java. Study the tests
 * to determine how the methods should work.
 */
public class Java1Review {

	public static void main(String[] args) {
		// If you want to write your own tests, do so here. (Do not modify
		// JUnitTests.java.) To run this method in Eclipse, right-click
		// Java1Review.java in the Package Explorer and select "Run As" >
		// "Java Application" from the context menu.
		
		
	}
	public static String main (String message)
	{
		return "Overloaded main method was passed \"" + message + "\".";
	}
// divide doubles
	public static double divide(double a, double b) {
        return a/b;
    }
//divide by 7?
    public static boolean isDivisibleBy7(int a) {
    	if(a%7 == 0) {
    		return true;
    	}
    	else {
        return false;
    }}
    public static int divide(int a, int b) {
    	return a/b;
    }
//find minimum of 3 integers
    public static int findMin(int a, int b, int c) {
    	return Math.min(a, Math.min(b, c));
    }
    public static int findMin(int[] array) {
    	Arrays.sort(array);
    	return array[0];
    	
    }


    public static double average(int[] array)  
    {
        double sum = 0.0;
        double average = 0.0;
        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }

        average = sum / array.length;
        return average;
        }
//put whole array lowercase
    public static String[] toLowerCase(String[] array) {
    	for(int i = 0; i < array.length; i++) {
    		array[i] = array[i].toLowerCase();
    	}
        return array;
    }
//put 
    public static String[] toLowerCaseCopy(String[] array) {
    	String[] copy = new String[array.length];
    	for(int i = 0; i < array.length; i++) {
    		copy[i]=array[i].toLowerCase();
    	}
        return copy;
    }
   
    public static void removeDuplicates(int[] array) {
     for(int i = 0; i < array.length; i++) {
    	 int temp = array[i];
    	 for(int j = i + 1; j < array.length; j++) {
    		 if(array[j] == temp) {
    			 array[j] = 0;
    			 array[i] = 0;
    		 }
    		 }
    	 }
     }
    }

