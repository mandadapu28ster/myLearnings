package com.rao.java.core.errorsExceptions;

public class FinallyExample {

	// Throw an exception out of the method.
	static void procA() {
		try {
			System.out.println("inside procA");
			throw new RuntimeException("demo");			//as catch alternative finally
		} finally {
			System.out.println("procA's finally");
		} }
	// Return from within a try block.
	static void procB() {
		try {
			System.out.println("inside procB");
			return;										//return doesn't effect finally
		} finally {
			System.out.println("procB's finally");
		} }
	// Execute a try block normally.
	static void procC() {
		try {
			System.out.println("inside procC");			//with out any catch need; normal flow
		} finally {
			System.out.println("procC's finally");
		} }
	public static void main(String args[]) {
		try {
			procA();
		} catch (Exception e) {
			System.out.println("Exception caught");
		}
		procB();
		procC();
	}

}