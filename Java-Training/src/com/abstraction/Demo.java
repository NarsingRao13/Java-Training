package com.abstraction;

public class Demo {
	private class Run implements Sample {

		@Override
		public void move() {
			System.out.println("Move 5km");
			
		}
	}
	
	public Sample getObject(){
		return new Run();
	}
}
