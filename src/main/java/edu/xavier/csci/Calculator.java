package main.java.edu.xavier.csci;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(sum(5,4));
	}
	
	public static int sum(int...numbers) {
		int sum = 0;
		for (int n : numbers) {
			sum += n;
		}
		return sum;
	}

}
