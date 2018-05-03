package com.rao.java.core.errorsExceptions;



public class TryCatch {

	public static void main(String[] args) {
		int d,a;
		d = args.length;										//if no arg then 'div by 0' or else 'ob' exception
		try { 													// monitor a block of code.
			a = 42 / d;
			int c[] = { 1 };
			c[42] = 99;
			System.out.println("This will not be printed.");
		}
//		catch(Exception e) {
//			System.out.println("Generic Exception " + e);			//This will catch all exception and makes below 2 exceptions not reachable
//		}
			catch (ArithmeticException e) { 						// catch divide-by-zero error
			System.out.println("Exception: " + e);					// usefull for debug
			System.out.println("Division by zero.");
		} catch(ArrayIndexOutOfBoundsException e) {					//Thsi is also example for nested catch; We can give similar for try as well
			System.out.println("Array index oob: " + e);
		}
		System.out.println("After try/catch blocks.");
	}
}
